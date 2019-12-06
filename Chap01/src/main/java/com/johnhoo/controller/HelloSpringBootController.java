package com.johnhoo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloSpringBootController {

    /**
     * 测试输出HelloSpringBoot
     */
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(){
        return "HelloSpringBoot";
    }
}
