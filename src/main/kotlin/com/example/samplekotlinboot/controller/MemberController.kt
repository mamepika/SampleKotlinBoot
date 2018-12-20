package com.example.samplekotlinboot.controller

import com.example.samplekotlinboot.entity.domain.MemberId
import com.example.samplekotlinboot.entity.domain.MerchantCode
import com.example.samplekotlinboot.model.Member
import com.example.samplekotlinboot.service.MemberService
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

/**
 * 会員 コントローラー
 */
@RestController
class MemberController (private val memberService: MemberService){

    @CrossOrigin
    @GetMapping("/members/{merchantCode}")
    fun listMembers(@PathVariable @Validated merchantCode:String):List<Member>{
        return memberService.findByMerchantCode(MerchantCode.of(merchantCode))
    }


    @CrossOrigin
    @GetMapping("/members/{merchantCode}/{memberId}")
    fun findByMerchantCodeAndMemberId(@PathVariable merchantCode:String,@PathVariable memberId:String):Member{
        return memberService.findByMerchantCodeAndMemberId(MerchantCode.of(merchantCode), MemberId.of(memberId))
    }
}