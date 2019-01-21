package com.example.samplekotlinboot.util

import org.junit.Assert
import org.junit.Test

class CommonUtilTest {

    @Test
    fun test(){
        val common = CommonUtil()

        Assert.assertEquals(2,common.add(1,3))
    }
}