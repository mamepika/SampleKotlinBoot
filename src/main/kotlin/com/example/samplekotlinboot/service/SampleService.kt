package com.example.samplekotlinboot.service


import com.example.samplekotlinboot.model.Merchant
import com.example.samplekotlinboot.repository.MerchantDao
import com.example.samplekotlinboot.repository.MerchantRepository
import org.springframework.stereotype.Component
import org.springframework.stereotype.Service

@Service
@Component
class SampleService (
        val merchantRepository: MerchantRepository
){


}