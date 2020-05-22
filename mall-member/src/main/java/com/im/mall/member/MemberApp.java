package com.im.mall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.im.mall.member.dao")
public class MemberApp {
    public static void main(String[] args) {
        SpringApplication.run(MemberApp.class,args);
    }
}
