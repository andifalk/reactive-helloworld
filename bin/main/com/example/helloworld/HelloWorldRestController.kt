package com.example.helloworld

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
@RequestMapping(produces = [MediaType.APPLICATION_JSON_UTF8_VALUE])
class HelloWorldRestController {

    @GetMapping("/")
    fun sayHello(@RequestParam(name = "msg", required = false) message: String?): Mono<Message>
            = Mono.just(Message("Hello ${message ?: "World"}"))
}