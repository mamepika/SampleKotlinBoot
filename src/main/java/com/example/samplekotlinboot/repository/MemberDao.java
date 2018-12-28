package com.example.samplekotlinboot.repository;

import com.example.samplekotlinboot.entity.Member;
import com.example.samplekotlinboot.entity.domain.MemberId;
import com.example.samplekotlinboot.entity.domain.MerchantCode;
import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;
import org.seasar.doma.jdbc.SelectOptions;

import java.util.List;

@Dao
@ConfigAutowireable
public interface MemberDao {

    /**
     * 事業者コードに紐づく会員を返す
     * @param merchantCode 事業者コード
     * @return 事業者に属する会員
     */
    @Select
    List<Member> findByMerchantCode(MerchantCode merchantCode);



    @Select
    List<Member> findByMerchantCode(MerchantCode merchantCode, SelectOptions options);


    /**
     * 事業者コード 会員IDに紐づく会員を返す
     * @param merchantCode 対象会員が属する事業者コード
     * @param memberId 対象会員の会員ID
     * @return 対象会員
     */
    @Select
    Member findByMerchantCodeAndMemberId(MerchantCode merchantCode, MemberId memberId);


}
