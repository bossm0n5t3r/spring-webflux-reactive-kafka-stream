package me.bossm0n5t3r.reactive.kafka.stream.repository

import io.r2dbc.spi.ConnectionFactories
import io.r2dbc.spi.ConnectionFactory
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ClickHouseConfiguration {
    @Bean
    fun connectionFactory(
        @Value("\${clickhouse.r2dbc-url}") url: String,
    ): ConnectionFactory = ConnectionFactories.get(url)
}
