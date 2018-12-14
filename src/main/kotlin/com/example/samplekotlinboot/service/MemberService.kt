package com.example.samplekotlinboot.service

import com.example.samplekotlinboot.model.Member
import com.example.samplekotlinboot.repository.MemberRepository

class MemberService (val memberRepository: MemberRepository)
{


    fun findByMerchantCode(merchantCode:String):List<Member>{
        return memberRepository.findByMerchantCode(merchantCode)
    }
}