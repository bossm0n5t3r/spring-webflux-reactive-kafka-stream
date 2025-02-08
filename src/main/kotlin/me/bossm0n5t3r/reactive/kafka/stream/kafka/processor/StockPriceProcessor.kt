package me.bossm0n5t3r.reactive.kafka.stream.kafka.processor

import me.bossm0n5t3r.reactive.kafka.stream.configuration.LOGGER
import me.bossm0n5t3r.reactive.kafka.stream.domain.StockUpdate
import me.bossm0n5t3r.reactive.kafka.stream.domain.currency.CurrencyRate
import me.bossm0n5t3r.reactive.kafka.stream.repository.ClickHouseRepository
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.kafka.support.KafkaHeaders
import org.springframework.messaging.Message
import org.springframework.messaging.support.MessageBuilder
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.math.BigDecimal
import java.util.function.Function

@Configuration
class StockPriceProcessor {
    companion object {
        private const val USD = "USD"
        private const val EUR = "EUR"
    }

    @Bean
    fun processStockPrices(
        repository: ClickHouseRepository,
        currencyRate: CurrencyRate,
    ): Function<Flux<Message<StockUpdate>>, Flux<Message<StockUpdate>>> =
        Function { stockPrices: Flux<Message<StockUpdate>> ->
            stockPrices.flatMapSequential { message: Message<StockUpdate> ->
                val stockUpdate: StockUpdate = message.payload
                LOGGER.info("message: {}", stockUpdate)
                repository
                    .saveStockPrice(stockUpdate)
                    .flatMap { success -> if (success == true) Mono.just(stockUpdate) else Mono.empty() }
                    .flatMap { stock -> currencyRate.convertRate(USD, EUR, stock.price) }
                    .map { newPrice -> stockUpdate.convertPrice(newPrice).also { LOGGER.info("Updated message: {}", it) } }
                    .map { priceInEuro ->
                        MessageBuilder
                            .withPayload(priceInEuro)
                            .setHeader(KafkaHeaders.KEY, stockUpdate.symbol)
                            .copyHeaders(message.headers)
                            .build()
                    }
            }
        }

    private fun StockUpdate.convertPrice(newPrice: BigDecimal): StockUpdate = StockUpdate(this.symbol, newPrice, EUR, this.timestamp)
}
