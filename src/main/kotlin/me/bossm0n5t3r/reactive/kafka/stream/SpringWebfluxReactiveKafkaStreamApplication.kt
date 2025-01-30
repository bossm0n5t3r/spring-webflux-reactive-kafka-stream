package me.bossm0n5t3r.reactive.kafka.stream

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringWebfluxReactiveKafkaStreamApplication

fun main(args: Array<String>) {
    runApplication<SpringWebfluxReactiveKafkaStreamApplication>(*args)
}
