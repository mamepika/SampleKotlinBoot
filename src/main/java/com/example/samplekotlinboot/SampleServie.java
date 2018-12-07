package com.example.samplekotlinboot;

import com.example.samplekotlinboot.repository.MerchantDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SampleServie {

    @Autowired
    private MerchantDao merchantDao;
}
