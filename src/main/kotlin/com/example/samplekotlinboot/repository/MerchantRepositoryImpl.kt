package com.example.samplekotlinboot.repository

import com.example.samplekotlinboot.entity.Merchant
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository

@Repository
class MerchantRepositoryImpl (
         val merchantDao: MerchantDao
):MerchantRepository
{
    override fun findAll(): List<com.example.samplekotlinboot.model.Merchant> {

        return merchantDao.findAll().map { _mapToModel(it) }
    }


    private fun _mapToModel(entity: Merchant):com.example.samplekotlinboot.model.Merchant{
        return com.example.samplekotlinboot.model.Merchant(id = entity.id,name = entity.name,address = entity.address)

    }
}