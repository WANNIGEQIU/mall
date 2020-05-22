package com.im.mall.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.im.mall.order.dao")
public class OrderApp {
    public static void main(String[] args) {
        SpringApplication.run(OrderApp.class,args);
    }
}
