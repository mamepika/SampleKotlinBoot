package com.example.samplekotlinboot.repository

import com.example.samplekotlinboot.entity.Merchant
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository

@Repository
class MerchantRepositoryImpl (
         val merchantDao: MerchantDao
):MerchantRepository {
}