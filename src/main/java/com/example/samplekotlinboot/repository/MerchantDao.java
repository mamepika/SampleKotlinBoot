package com.example.samplekotlinboot.repository;

import com.example.samplekotlinboot.entity.Merchant;
import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import java.util.List;

@Dao
@ConfigAutowireable
public interface MerchantDao {

    @Select
    List<Merchant> findAll();
}
