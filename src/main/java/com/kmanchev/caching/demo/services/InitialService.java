package com.kmanchev.caching.demo.services;

import org.springframework.stereotype.Service;

@Service
public class InitialService {

    public String getInitialValue() {
        return "this is from Service";
    }
}
