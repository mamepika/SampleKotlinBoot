package com.example.samplekotlinboot.controller

import com.example.samplekotlinboot.model.Member
import com.example.samplekotlinboot.service.MemberService
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class MemberController (private val memberService: MemberService){

    @CrossOrigin
    @GetMapping("/members/{merchantCode}")
    fun listMembers(@PathVariable merchantCode:String):List<Member>{
        return memberService.findByMerchantCode(merchantCode)
    }


}