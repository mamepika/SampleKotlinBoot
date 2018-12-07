package com.example.samplekotlinboot.controller

import com.example.samplekotlinboot.model.Merchant
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class MerchantController {

    @GetMapping("/merchants")
    fun listMerchants():List<Merchant>{
        var merchants:List<Merchant> = listOf(Merchant("0001","会社1","tokyo"),Merchant("0002","Company2","Yokohama"))
        return merchants;
    }

    @PostMapping(value="/merchants")
    fun list(@RequestBody merchant : Merchant):List<Merchant>{
        val merchants : List<Merchant> = listOf(Merchant("0001","会社1","tokyo"),
                                                Merchant("0002","Company2","Yokohama"),
                                                merchant)

        return merchants

    }
}