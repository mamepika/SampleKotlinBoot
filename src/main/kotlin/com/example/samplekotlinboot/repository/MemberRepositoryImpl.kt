package com.example.samplekotlinboot.repository

import com.example.samplekotlinboot.entity.Member
import com.example.samplekotlinboot.entity.MemberId
import com.example.samplekotlinboot.entity.MerchantCode
import org.springframework.stereotype.Repository

@Repository
class MemberRepositoryImpl (val memberDao: MemberDao):MemberRepository{


    override fun findByMerchantCode(merchantCode: MerchantCode): List<com.example.samplekotlinboot.model.Member> {
        return memberDao.findByMerchantCode(merchantCode).map { _mapToModel(it) }
    }

    override fun findByMerchantCodeAndMemberId(merchantCode: MerchantCode, memberId: MemberId) :com.example.samplekotlinboot.model.Member{
        return _mapToModel(memberDao.findByMerchantCodeAndMemberId(merchantCode,memberId))
    }
    private fun _mapToModel(entity: Member):com.example.samplekotlinboot.model.Member{
        return com.example.samplekotlinboot.model.Member(merchantCode = entity.merchantCode,
                                                         tenantCode = entity.tenantCode,
                                                         memberId = entity.memberId,cardNumber = entity.cardNumber,cardExpireDate = entity.cardExpireDate,cardCompanyCode = entity.cardCompanyCode, status = entity.status)
    }
}