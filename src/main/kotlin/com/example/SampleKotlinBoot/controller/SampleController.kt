package com.example.SampleKotlinBoot.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class SampleController {

    @GetMapping("/hello")
    fun hello():String{
        return "Hello Kotlin !!"
    }

    @GetMapping("hello/{message}")
    fun hello(@PathVariable message:String):String{
        return "Hello Kotlin $message"
    }
}