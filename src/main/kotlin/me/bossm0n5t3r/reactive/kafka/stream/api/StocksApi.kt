package me.bossm0n5t3r.reactive.kafka.stream.api

import me.bossm0n5t3r.reactive.kafka.stream.domain.StockUpdate
import me.bossm0n5t3r.reactive.kafka.stream.kafka.producer.StockPriceProducer
import me.bossm0n5t3r.reactive.kafka.stream.repository.ClickHouseRepository
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.server.ResponseStatusException
import reactor.core.publisher.Flux
import reactor.kafka.sender.SenderResult
import java.time.Instant

@RestController
class StocksApi(
    private val repository: ClickHouseRepository,
    private val stockPriceProducer: StockPriceProducer,
) {
    @PostMapping("/stock-prices-in")
    fun sendStockPrices(
        @RequestParam("count") count: Int,
    ): Flux<SenderResult<Void>> = stockPriceProducer.produceStockPrices(count)

    @GetMapping("/stock-prices-out")
    fun getAvgStockPrices(
        @RequestParam("from") from: Instant,
        @RequestParam("to") to: Instant,
    ): Flux<StockUpdate> {
        if (from.isAfter(to)) {
            throw ResponseStatusException(HttpStatus.BAD_REQUEST, "'from' must come before 'to'")
        }
        return repository.findMinuteAvgStockPrices(from, to)
    }
}
