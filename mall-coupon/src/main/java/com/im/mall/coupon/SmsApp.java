package com.im.mall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.im.mall.coupon.dao")
public class SmsApp {
    public static void main(String[] args) {
        SpringApplication.run(SmsApp.class,args);
    }
}
