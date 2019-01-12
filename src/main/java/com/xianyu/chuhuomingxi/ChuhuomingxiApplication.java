package com.xianyu.chuhuomingxi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xianyu.chuhuomingxi.mapper")
public class ChuhuomingxiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChuhuomingxiApplication.class, args);
    }

}

