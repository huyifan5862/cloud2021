package com.bobcfc;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("com.bobcfc.mapper")
@EnableDiscoveryClient
public class PaymentMain8004 {
    public static void main(String[]args){
        SpringApplication.run(PaymentMain8004.class,args);
    }
}
