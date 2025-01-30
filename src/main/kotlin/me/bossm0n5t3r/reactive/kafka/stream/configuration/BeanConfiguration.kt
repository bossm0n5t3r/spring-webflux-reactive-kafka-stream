package me.bossm0n5t3r.reactive.kafka.stream.configuration

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
}
