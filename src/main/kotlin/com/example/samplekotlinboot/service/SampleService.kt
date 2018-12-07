package com.example.samplekotlinboot.service

import com.example.samplekotlinboot.repository.MerchantDao
import org.springframework.context.annotation.ComponentScan
import org.springframework.stereotype.Service

@Service
class SampleService (
        val merchantDao : MerchantDao
){
    fun findAll(){

    }


}