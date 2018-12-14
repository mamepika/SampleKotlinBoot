package com.example.samplekotlinboot.repository

import com.example.samplekotlinboot.model.Member

interface MemberRepository {


    fun findByMerchantCode(merchantCode:String):List<Member>
}