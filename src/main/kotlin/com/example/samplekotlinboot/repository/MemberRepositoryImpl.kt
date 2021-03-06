package com.example.samplekotlinboot.repository

import com.example.samplekotlinboot.entity.Member
import com.example.samplekotlinboot.entity.domain.MemberId
import com.example.samplekotlinboot.entity.domain.MerchantCode
import org.seasar.doma.jdbc.SelectOptions
import org.springframework.stereotype.Repository

@Repository
class MemberRepositoryImpl (val memberDao: MemberDao):MemberRepository{


    override fun findByMerchantCode(merchantCode: MerchantCode): List<com.example.samplekotlinboot.model.Member> {
        return memberDao.findByMerchantCode(merchantCode).map { _mapToModel(it) }
    }
    override fun findByMerchantCode(merchantCode: MerchantCode,options:SelectOptions): List<com.example.samplekotlinboot.model.Member> {
        return memberDao.findByMerchantCode(merchantCode,options).map { _mapToModel(it) }
    }
    override fun findByMerchantCodeAndMemberId(merchantCode: MerchantCode, memberId: MemberId) :com.example.samplekotlinboot.model.Member{
        return _mapToModel(memberDao.findByMerchantCodeAndMemberId(merchantCode,memberId))
    }


    /**
     * JavaのエンティティをKotlinのエンティティに変換
     * @param entity 会員エンティティ
     */
    private fun _mapToModel(entity: Member):com.example.samplekotlinboot.model.Member{
        return com.example.samplekotlinboot.model.Member(merchantCode = entity.merchantCode,
                                                         tenantCode = entity.tenantCode,
                                                         memberId = entity.memberId,
                                                         cardNumber = entity.cardNumber,
                                                         cardExpireDate = entity.cardExpireDate,
                                                         cardCompanyCode = entity.cardCompanyCode,
                                                         status = entity.status)
    }
}