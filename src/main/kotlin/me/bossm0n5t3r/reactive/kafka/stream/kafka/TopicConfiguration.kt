package me.bossm0n5t3r.reactive.kafka.stream.kafka

import org.apache.kafka.clients.admin.NewTopic
import org.springframework.cloud.stream.binder.kafka.BinderHeaderMapper
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.kafka.config.TopicBuilder
import org.springframework.kafka.support.KafkaHeaderMapper

@Configuration
class TopicConfiguration {
    companion object {
        const val STOCK_PRICES_OUT: String = "stock-prices-out"
        const val STOCK_PRICES_IN: String = "stock-prices-in"
    }

    @Bean(STOCK_PRICES_IN)
    fun stockPricesIn(): NewTopic =
        TopicBuilder
            .name(STOCK_PRICES_IN)
            .partitions(2)
            .replicas(1)
            .build()

    @Bean(STOCK_PRICES_OUT)
    fun stockPricesOut(): NewTopic =
        TopicBuilder
            .name(STOCK_PRICES_OUT)
            .partitions(2)
            .replicas(1)
            .build()

    @Bean
    fun kafkaBinderHeaderMapper(): KafkaHeaderMapper = BinderHeaderMapper().apply { setMapAllStringsOut(true) }
}
