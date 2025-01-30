package me.bossm0n5t3r.reactive.kafka.stream.configuration

import org.slf4j.Logger
import org.slf4j.LoggerFactory

inline val <reified T> T.LOGGER: Logger
    get() = LoggerFactory.getLogger(T::class.java)
