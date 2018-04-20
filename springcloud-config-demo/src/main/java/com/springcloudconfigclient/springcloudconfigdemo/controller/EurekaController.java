package com.springcloudconfigclient.springcloudconfigdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EurekaController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/testeureka")
    public String add() {
        return restTemplate.getForEntity("http://service-test/test?a=10&b=20", String.class).getBody();
    }

    @RequestMapping("/add")
    public String tadd(){
        return "add";
    }

    @RequestMapping("/test")
    public String test(){
        System.out.println("stestdsdd");
        return "test332";
    }
}
