package com.example.SampleKotlinBoot.controller

import com.example.SampleKotlinBoot.model.Merchant
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MerchantController {

    @GetMapping("/merchants")
    fun listMerchants():List<Merchant>{
        var merchants:List<Merchant> = listOf(Merchant("0001","会社1","tokyo"),Merchant("0002","Company2","Yokohama"))
        return merchants;
    }
}