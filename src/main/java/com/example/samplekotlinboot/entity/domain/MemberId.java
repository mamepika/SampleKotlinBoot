package com.example.samplekotlinboot.entity.domain;

import org.seasar.doma.Domain;

/**
 * 会員ID
 */
@Domain(valueType = String.class,factoryMethod = "of")
public class MemberId {

    private final String value;

    private MemberId(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static MemberId of(String value){
        return new MemberId(value);
    }
}
