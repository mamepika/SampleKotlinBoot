package com.example.samplekotlinboot.repository

import com.example.samplekotlinboot.entity.domain.MemberId
import com.example.samplekotlinboot.entity.domain.MerchantCode
import com.example.samplekotlinboot.model.Member
import org.seasar.doma.jdbc.SelectOptions

interface MemberRepository {


    fun findByMerchantCode(merchantCode: MerchantCode):List<Member>

    fun findByMerchantCode(merchantCode: MerchantCode,options:SelectOptions):List<Member>


    fun findByMerchantCodeAndMemberId(merchantCode: MerchantCode, memberId: MemberId):Member
}