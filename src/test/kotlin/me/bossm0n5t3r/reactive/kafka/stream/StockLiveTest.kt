package me.bossm0n5t3r.reactive.kafka.stream

import me.bossm0n5t3r.reactive.kafka.stream.domain.StockUpdate
import me.bossm0n5t3r.reactive.kafka.stream.kafka.consumer.StockPriceConsumer
import me.bossm0n5t3r.reactive.kafka.stream.kafka.producer.StockPriceProducer
import me.bossm0n5t3r.reactive.kafka.stream.repository.ClickHouseRepository
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.DynamicPropertyRegistry
import org.springframework.test.context.DynamicPropertySource
import org.springframework.test.web.reactive.server.WebTestClient
import org.testcontainers.clickhouse.ClickHouseContainer
import org.testcontainers.junit.jupiter.Container
import org.testcontainers.junit.jupiter.Testcontainers
import org.testcontainers.kafka.KafkaContainer
import org.testcontainers.shaded.org.awaitility.Awaitility
import java.math.BigDecimal
import java.time.Duration
import java.time.Instant
import java.time.temporal.ChronoUnit
import java.util.function.Consumer

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Testcontainers(parallel = true)
internal class StockLiveTest {
    @Autowired
    private lateinit var producer: StockPriceProducer

    @Autowired
    private lateinit var consumer: StockPriceConsumer

    @Autowired
    private lateinit var clickHouseRepository: ClickHouseRepository

    @Autowired
    private lateinit var webTestClient: WebTestClient

    @BeforeEach
    fun setup() {
        clickHouseRepository.initDatabase().block()
        clickHouseRepository.runScript("DELETE FROM stock_prices WHERE symbol IS NOT NULL").block()
        consumer.resetCount()
    }

    @Test
    fun givenTheKafkaProducer_whenSubmittingEvents_thenProcessAllEventUntilItArrivesToConsumers() {
        val eventCount = 200

        producer.produceStockPrices(eventCount).subscribe()

        Awaitility
            .waitAtMost(Duration.ofSeconds(60))
            .untilAsserted { assertTrue(consumer.getCount() == eventCount) }
    }

    @Test
    fun givenTheKafkaProducer_whenStreamConfigured_thenProcessAllEventsAndSaveThemInClickHouse() {
        val eventCount = 200

        val start = Instant.now().truncatedTo(ChronoUnit.MINUTES)

        producer.produceStockPrices(eventCount).subscribe()

        Awaitility
            .waitAtMost(Duration.ofSeconds(60))
            .untilAsserted { assertTrue(consumer.getCount() == eventCount) }

        val end = Instant.now().plusSeconds(60).truncatedTo(ChronoUnit.MINUTES)

        val updates =
            webTestClient
                .get()
                .uri("/stock-prices-out?from={from}&to={to}", start, end)
                .exchange()
                .expectStatus()
                .isOk()
                .expectBodyList(StockUpdate::class.java)
                .returnResult()
                .responseBody

        assertFalse(updates?.isEmpty() ?: true)

        updates?.forEach(
            Consumer { update: StockUpdate ->
                assertTrue(update.price > BigDecimal.ZERO)
                assertTrue(StockPriceProducer.STOCKS.toSet().contains(update.symbol))
                assertTrue(update.currency == "USD")
                assertTrue(isBetween(update.timestamp, start, end))
            },
        )
    }

    private fun isBetween(
        target: Instant,
        start: Instant,
        end: Instant,
    ): Boolean = !target.isBefore(start) && !target.isAfter(end)

    companion object {
        @Container
        private val clickHouseContainer = ClickHouseContainer("clickhouse/clickhouse-server:latest")

        @Container
        private val kafkaContainer: KafkaContainer =
            KafkaContainer("apache/kafka:latest")
                .withEnv("KAFKA_LISTENERS", "PLAINTEXT://:9092,BROKER://:9093,CONTROLLER://:9094")
                .withEnv("KAFKA_AUTO_CREATE_TOPICS_ENABLE", "true")

        @JvmStatic
        @DynamicPropertySource
        fun registerDynamicProperties(registry: DynamicPropertyRegistry) {
            registry.add("spring.kafka.bootstrap-servers", kafkaContainer::getBootstrapServers)
            registry.add("spring.cloud.stream.kafka.binder.brokers", kafkaContainer::getBootstrapServers)
            registry.add("spring.kafka.producer.bootstrap-servers", kafkaContainer::getBootstrapServers)
            registry.add("spring.kafka.consumer.bootstrap-servers", kafkaContainer::getBootstrapServers)
            registry.add("clickhouse.r2dbc-url") {
                "r2dbc:clickhouse://${clickHouseContainer.host}:${clickHouseContainer.getMappedPort(8123)}/default"
            }
        }
    }
}
