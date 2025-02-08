package me.bossm0n5t3r.reactive.kafka.stream.kafka.producer

import me.bossm0n5t3r.reactive.kafka.stream.domain.StockUpdate
import me.bossm0n5t3r.reactive.kafka.stream.kafka.TopicConfiguration.Companion.STOCK_PRICES_IN
import org.apache.kafka.clients.admin.NewTopic
import org.apache.kafka.clients.producer.ProducerRecord
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.boot.autoconfigure.kafka.KafkaProperties
import org.springframework.http.MediaType
import org.springframework.kafka.core.reactive.ReactiveKafkaProducerTemplate
import org.springframework.messaging.MessageHeaders
import org.springframework.messaging.support.MessageBuilder
import org.springframework.stereotype.Component
import reactor.core.publisher.Flux
import reactor.kafka.sender.SenderOptions
import reactor.kafka.sender.SenderResult
import java.math.BigDecimal
import java.time.Instant
import kotlin.random.Random

@Component
class StockPriceProducer(
    properties: KafkaProperties,
    @Qualifier(STOCK_PRICES_IN) private val topic: NewTopic,
) {
    private val kafkaProducer: ReactiveKafkaProducerTemplate<String, StockUpdate> =
        ReactiveKafkaProducerTemplate(SenderOptions.create(properties.buildProducerProperties()))

    companion object {
        val STOCKS = listOf("AAPL", "GOOG", "MSFT", "AMZN", "TSLA")
        private const val CURRENCY = "USD"
    }

    fun produceStockPrices(count: Int): Flux<SenderResult<Void>> =
        Flux
            .range(0, count)
            .map {
                val stock = STOCKS.random()
                val price = BigDecimal.valueOf(100 + (200 * Random.nextDouble()))

                MessageBuilder
                    .withPayload(StockUpdate(stock, price, CURRENCY, Instant.now()))
                    .setHeader(MessageHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                    .build()
            }.flatMap {
                val newRecord =
                    ProducerRecord(
                        topic.name(),
                        it.payload.symbol,
                        it.payload,
                    )
                kafkaProducer.send(newRecord)
            }
}
