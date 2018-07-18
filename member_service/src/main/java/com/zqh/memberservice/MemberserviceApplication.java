package com.zqh.memberservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@EnableEurekaClient
@EnableDiscoveryClient
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.zqh")
public class MemberserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MemberserviceApplication.class, args);
    }
}
