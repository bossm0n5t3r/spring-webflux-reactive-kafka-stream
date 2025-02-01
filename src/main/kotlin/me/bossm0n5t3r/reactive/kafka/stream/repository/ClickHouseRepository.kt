package me.bossm0n5t3r.reactive.kafka.stream.repository

import io.r2dbc.spi.Connection
import io.r2dbc.spi.ConnectionFactory
import io.r2dbc.spi.Result
import me.bossm0n5t3r.reactive.kafka.stream.configuration.LOGGER
import me.bossm0n5t3r.reactive.kafka.stream.domain.StockUpdate
import org.springframework.core.io.ClassPathResource
import org.springframework.core.io.Resource
import org.springframework.core.io.buffer.DataBuffer
import org.springframework.core.io.buffer.DataBufferUtils
import org.springframework.core.io.buffer.DefaultDataBufferFactory
import org.springframework.stereotype.Repository
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import reactor.kotlin.core.publisher.cast
import reactor.kotlin.core.publisher.toMono
import java.math.BigDecimal
import java.nio.charset.StandardCharsets
import java.time.Instant

@Repository
class ClickHouseRepository(
    private val connectionFactory: ConnectionFactory,
) {
    fun create(): Mono<Connection> = connectionFactory.create().toMono().cast()

    final fun initDatabase(): Mono<Void> {
        val resource = ClassPathResource("init.sql")
        return readFile(resource).flatMap { scriptContent: String -> this.runScript(scriptContent) }
    }

    init {
        initDatabase().block()
    }

    private fun readFile(resource: Resource): Mono<String> {
        val dataBufferFlux: Flux<DataBuffer> =
            DataBufferUtils.read(
                resource,
                DefaultDataBufferFactory(),
                1024,
            )

        return dataBufferFlux.reduce("") { data: String, buffer: DataBuffer ->
            val content = buffer.toString(StandardCharsets.UTF_8)
            DataBufferUtils.release(buffer)
            data + content
        }
    }

    fun runScript(scriptContent: String): Mono<Void?> =
        Mono.usingWhen(
            create(),
            { connection: Connection -> executeScript(connection, scriptContent) },
            Connection::close,
        )

    private fun executeScript(
        connection: Connection,
        scriptContent: String,
    ): Mono<Void> =
        Flux
            .fromIterable(
                scriptContent
                    .split(";".toRegex())
                    .dropLastWhile { it.isEmpty() }
                    .toTypedArray()
                    .toList(),
            ).map { obj: String -> obj.trim { it <= ' ' } }
            .filter { statement: String -> statement.isNotEmpty() }
            .concatMap { statement ->
                LOGGER.info("Executing statement: $statement")
                connection.createStatement(statement).execute()
            }.then()

    fun saveStockPrice(stockUpdate: StockUpdate): Mono<Boolean> =
        create()
            .flatMapMany { connection: Connection ->
                connection
                    .createStatement(
                        """
                        INSERT INTO stock_prices (symbol, original_price, currency, timestamp) 
                        VALUES (:symbol, :original_price, :currency, parseDateTime64BestEffort(:timestamp, 9))
                        """.trimIndent(),
                    ).bind("symbol", stockUpdate.symbol)
                    .bind("original_price", stockUpdate.price.toDouble())
                    .bind("currency", stockUpdate.currency)
                    .bind("timestamp", stockUpdate.timestamp.toString())
                    .execute()
                    .also { LOGGER.info("Saved stock price: $stockUpdate") }
            }.flatMap(Result::getRowsUpdated)
            .reduce(Long::plus)
            .map { count: Long -> count > 0 }

    fun findMinuteAvgStockPrices(
        from: Instant,
        to: Instant,
    ): Flux<StockUpdate> =
        create()
            .flatMapMany { connection: Connection ->
                connection
                    .createStatement(
                        """
                        SELECT
                            symbol,
                            currency,
                            date_time,
                            avgMerge(avg_price) AS avg_price
                        FROM avg_stock_prices
                        WHERE date_time BETWEEN parseDateTime64BestEffort(:from, 9) AND parseDateTime64BestEffort(:to, 9)
                        GROUP BY symbol, currency, date_time;
                        """.trimIndent(),
                    ).bind("from", from.toString())
                    .bind("to", to.toString())
                    .execute()
            }.flatMap {
                it.map { row, _ ->
                    StockUpdate(
                        requireNotNull(row.get("symbol", String::class.java)),
                        requireNotNull(row.get("avg_price", BigDecimal::class.java)),
                        requireNotNull(row.get("currency", String::class.java)),
                        requireNotNull(row.get("date_time", Instant::class.java)),
                    )
                }
            }
}
