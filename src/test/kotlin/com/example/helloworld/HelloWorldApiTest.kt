package com.example.helloworld

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest
import org.springframework.http.MediaType
import org.springframework.test.context.junit.jupiter.SpringExtension
import org.springframework.test.web.reactive.server.WebTestClient


@ExtendWith(SpringExtension::class)
@WebFluxTest(HelloWorldRestController::class)
@DisplayName("Check that HelloWorld API")
class HelloWorldApiTest {

    @Autowired
    private lateinit var webClient: WebTestClient

    @Test
    fun `returns 'HelloWorld' when request parameter is omitted`() {
        this.webClient.get().uri("/").accept(MediaType.APPLICATION_JSON_UTF8)
                .exchange()
                .expectStatus().isOk
                .expectBody().json("{\"msg\": \"Hello World\"}")
    }

    @Test
    fun `returns 'HelloReactive' when 'Reactive' is given as request parameter`() {
        val param = "Reactive"
        this.webClient.get().uri("/?msg={msg}", param).accept(MediaType.APPLICATION_JSON_UTF8)
                .exchange()
                .expectStatus().isOk
                .expectBody().json("{\"msg\": \"Hello $param\"}")
    }

}
