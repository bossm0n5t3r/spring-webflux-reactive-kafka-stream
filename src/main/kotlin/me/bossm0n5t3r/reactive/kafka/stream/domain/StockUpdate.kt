package me.bossm0n5t3r.reactive.kafka.stream.domain

import java.math.BigDecimal
import java.time.Instant

data class StockUpdate(
    val symbol: String,
    val price: BigDecimal,
    val currency: String,
    val timestamp: Instant,
)
