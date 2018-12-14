package com.example.samplekotlinboot.controller

import com.example.samplekotlinboot.model.Member
import com.example.samplekotlinboot.service.MemberService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

class MemberController (val memberService: MemberService){

    @GetMapping("/members/{merchantCode}")
    fun listMembers(@PathVariable merchantCode:String):List<Member>{
        println(merchantCode)

        return memberService.findByMerchantCode(merchantCode)
    }

}