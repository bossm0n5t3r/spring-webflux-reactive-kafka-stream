package me.bossm0n5t3r.reactive.kafka.stream.configuration

import com.fasterxml.jackson.annotation.JsonAutoDetect
import com.fasterxml.jackson.annotation.PropertyAccessor
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.registerKotlinModule
import me.bossm0n5t3r.reactive.kafka.stream.domain.currency.CurrencyRate
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary
import reactor.core.publisher.Mono
import java.math.BigDecimal

@Configuration
class BeanConfiguration {
    @Bean
    @Primary
    fun currencyRate(): CurrencyRate =
        object : CurrencyRate {
            override fun convertRate(
                from: String,
                to: String,
                amount: BigDecimal,
            ): Mono<BigDecimal> = Mono.just(amount * BigDecimal(1.2))
        }

    @Bean
    fun objectMapper(): ObjectMapper =
        jacksonObjectMapper()
            .registerKotlinModule()
            .registerModules(JavaTimeModule())
            .setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY)
}
