package com.example.microservices.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservices.limitsservice.bean.Limits;
import com.example.microservices.limitsservice.configuration.LimitsConfiguration;

@RestController
public class LimitsController {

    @Autowired
    LimitsConfiguration limitsConfiguration;

    @GetMapping("/limits")
    public Limits retrieveLimits(){
        return new Limits(limitsConfiguration.getMin(),limitsConfiguration.getMax());
    } 
}
