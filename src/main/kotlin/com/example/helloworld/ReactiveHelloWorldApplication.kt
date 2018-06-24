package com.example.helloworld

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ReactiveHelloworldApplication

fun main(args: Array<String>) {
    runApplication<ReactiveHelloworldApplication>(*args)
}
