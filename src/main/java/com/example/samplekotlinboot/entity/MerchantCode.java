package com.example.samplekotlinboot.entity;

import org.seasar.doma.Domain;

import javax.validation.constraints.Min;

/**
 *　事業者コード
 */
@Domain(valueType = String.class,factoryMethod = "of")
public class MerchantCode {

    private final String value;

    private MerchantCode(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static MerchantCode of(String value){
        return new MerchantCode(value);
    }
}
