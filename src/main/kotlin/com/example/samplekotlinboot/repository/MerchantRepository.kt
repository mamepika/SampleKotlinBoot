package com.example.samplekotlinboot.repository

import com.example.samplekotlinboot.model.Merchant

interface MerchantRepository {

    fun findAll():List<Merchant>


}