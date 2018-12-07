package com.example.samplekotlinboot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SampleKotlinBootApplication

fun main(args: Array<String>) {
    runApplication<SampleKotlinBootApplication>(*args)
}