package com.xianyu.chuhuomingxi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class XianyuContoller {
    @RequestMapping("/test")
    public String nihao(){
        return "123";
    }
}
