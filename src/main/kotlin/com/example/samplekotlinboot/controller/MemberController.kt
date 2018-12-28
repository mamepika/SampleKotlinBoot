package com.example.samplekotlinboot.controller

import com.example.samplekotlinboot.entity.domain.MemberId
import com.example.samplekotlinboot.entity.domain.MerchantCode
import com.example.samplekotlinboot.model.Member
import com.example.samplekotlinboot.service.MemberService
import org.seasar.doma.jdbc.SelectOptions
import org.springframework.data.domain.Pageable
import org.springframework.data.web.PageableDefault
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*

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
    @GetMapping("/members/{merchantCode}/paging")
    fun listMembersPaging(@PathVariable @Validated merchantCode:String,@RequestParam(name = "offset",required = false)offset:Int):List<Member>{
        val options:SelectOptions= SelectOptions.get().offset(offset).limit(5)

        return memberService.findByMerchantCode(MerchantCode.of(merchantCode),options)
    }

    @CrossOrigin
    @GetMapping("/members/{merchantCode}/{memberId}")
    fun findByMerchantCodeAndMemberId(@PathVariable merchantCode:String,@PathVariable memberId:String):Member{
        return memberService.findByMerchantCodeAndMemberId(MerchantCode.of(merchantCode), MemberId.of(memberId))
    }
}