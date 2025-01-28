package me.bossm0n5t3r.reactivekafkastream

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringWebfluxReactiveKafkaStreamApplication

fun main(args: Array<String>) {
    runApplication<SpringWebfluxReactiveKafkaStreamApplication>(*args)
}
