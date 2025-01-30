package me.bossm0n5t3r.reactive.kafka.stream.domain.currency

import reactor.core.publisher.Mono
import java.math.BigDecimal

interface CurrencyRate {
    fun convertRate(
        from: String,
        to: String,
        amount: BigDecimal,
    ): Mono<BigDecimal>
}
