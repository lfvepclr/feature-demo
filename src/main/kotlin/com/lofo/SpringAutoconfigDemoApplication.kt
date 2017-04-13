package com.lofo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class SpringAutoconfigDemoApplication

fun main(args: Array<String>) {
    SpringApplication.run(SpringAutoconfigDemoApplication::class.java, *args)
}

