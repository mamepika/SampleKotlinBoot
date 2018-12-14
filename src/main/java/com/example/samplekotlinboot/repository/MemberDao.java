package com.example.samplekotlinboot.repository;

import com.example.samplekotlinboot.entity.Member;
import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import java.util.List;

@Dao
@ConfigAutowireable
public interface MemberDao {

    @Select
    List<Member> findByMerchantCode(String merchantId);


}
