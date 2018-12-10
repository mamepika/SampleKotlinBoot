package com.example.samplekotlinboot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
class SampleKotlinBootApplication

fun main(args: Array<String>) {
    runApplication<SampleKotlinBootApplication>(*args)
}