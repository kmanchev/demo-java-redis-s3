package com.kmanchev.caching.demo.controllers;

import com.kmanchev.caching.demo.services.InitialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InitialController {

    @Autowired
    InitialService initialService;

    @GetMapping("/initial")
    public String getMeInitial() {
        return initialService.getInitialValue();
    }
}
