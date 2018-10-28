package com.imooc.order.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by 廖师兄
 * 2018-01-21 21:57
 */
//@RestController
//@RequestMapping("/env")
//@RefreshScope
public class EnvController {

    @Value("${env}")
    private String env;

    @GetMapping("/print")
    public String print() {
        return env;
    }
}
