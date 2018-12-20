package com.example.samplekotlinboot.repository

import com.example.samplekotlinboot.entity.domain.MemberId
import com.example.samplekotlinboot.entity.domain.MerchantCode
import com.example.samplekotlinboot.model.Member

interface MemberRepository {


    fun findByMerchantCode(merchantCode: MerchantCode):List<Member>


    fun findByMerchantCodeAndMemberId(merchantCode: MerchantCode, memberId: MemberId):Member
}