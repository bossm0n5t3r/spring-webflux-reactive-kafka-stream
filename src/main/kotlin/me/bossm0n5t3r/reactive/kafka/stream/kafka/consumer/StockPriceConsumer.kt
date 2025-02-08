package me.bossm0n5t3r.reactive.kafka.stream.kafka.consumer

import jakarta.annotation.PostConstruct
import me.bossm0n5t3r.reactive.kafka.stream.configuration.LOGGER
import me.bossm0n5t3r.reactive.kafka.stream.domain.StockUpdate
import me.bossm0n5t3r.reactive.kafka.stream.kafka.TopicConfiguration
import org.apache.kafka.clients.admin.NewTopic
import org.apache.kafka.clients.consumer.ConsumerRecord
import org.apache.kafka.common.TopicPartition
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.boot.autoconfigure.kafka.KafkaProperties
import org.springframework.kafka.core.reactive.ReactiveKafkaConsumerTemplate
import org.springframework.lang.NonNull
import org.springframework.stereotype.Component
import reactor.core.scheduler.Schedulers
import reactor.kafka.receiver.ReceiverOptions
import reactor.kafka.receiver.ReceiverPartition
import java.util.concurrent.atomic.AtomicInteger

@Component
class StockPriceConsumer(
    @NonNull properties: KafkaProperties,
    @Qualifier(TopicConfiguration.STOCK_PRICES_OUT) topic: NewTopic,
) {
    private val receiverOptions =
        ReceiverOptions
            .create<String, StockUpdate>(properties.buildConsumerProperties())
            .subscription(listOf(topic.name()))
            .assignment((0 until topic.numPartitions()).map { i -> TopicPartition(topic.name(), i) }.toList())
            .addAssignListener { partitions: Collection<ReceiverPartition> ->
                LOGGER.info("************** onPartitionsAssigned: {}", partitions)
            }
    private val kafkaConsumerTemplate: ReactiveKafkaConsumerTemplate<String, StockUpdate> = ReactiveKafkaConsumerTemplate(receiverOptions)
    private val count = AtomicInteger()

    @PostConstruct
    fun consume() {
        Schedulers.boundedElastic().schedule {
            kafkaConsumerTemplate
                .receiveAutoAck()
                .doOnNext { consumerRecord: ConsumerRecord<String, StockUpdate> ->
                    // simulate processing
                    count.incrementAndGet()
                    LOGGER.info(
                        "received key={}, value={} from topic={}, offset={}, partition={}",
                        consumerRecord.key(),
                        consumerRecord.value(),
                        consumerRecord.topic(),
                        consumerRecord.offset(),
                        consumerRecord.partition(),
                    )
                }.doOnError { e: Throwable -> LOGGER.error("Consumer error", e) }
                .doOnComplete { LOGGER.info("Consumed all messages") }
                .subscribe()
        }
    }

    fun getCount(): Int = count.get()

    fun resetCount() {
        count.set(0)
    }
}
