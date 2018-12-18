package com.example.samplekotlinboot.repository

import com.example.samplekotlinboot.entity.MemberId
import com.example.samplekotlinboot.entity.MerchantCode
import com.example.samplekotlinboot.model.Member

interface MemberRepository {


    fun findByMerchantCode(merchantCode:MerchantCode):List<Member>


    fun findByMerchantCodeAndMemberId(merchantCode: MerchantCode,memberId: MemberId):Member
}