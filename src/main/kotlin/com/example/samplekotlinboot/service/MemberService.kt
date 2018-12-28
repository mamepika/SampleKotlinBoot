package com.example.samplekotlinboot.service

import com.example.samplekotlinboot.entity.domain.MemberId
import com.example.samplekotlinboot.entity.domain.MerchantCode
import com.example.samplekotlinboot.model.Member
import com.example.samplekotlinboot.repository.MemberRepository
import org.seasar.doma.jdbc.SelectOptions
import org.springframework.stereotype.Service

@Service
class MemberService (private val memberRepository: MemberRepository)
{


    fun findByMerchantCode(merchantCode: MerchantCode):List<Member>{
        return memberRepository.findByMerchantCode(merchantCode)
    }

    fun findByMerchantCode(merchantCode: MerchantCode,options:SelectOptions):List<Member>{
        return memberRepository.findByMerchantCode(merchantCode,options)
    }

    fun findByMerchantCodeAndMemberId(merchantCode: MerchantCode, memberId: MemberId):Member{
        return memberRepository.findByMerchantCodeAndMemberId(merchantCode, memberId)
    }
}