package com.bobcfc;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@MapperScan("com.bobcfc.mapper")
@EnableEurekaClient
public class PaymentMain8001 {
    public static void main(String[]args){
        SpringApplication.run(PaymentMain8001.class,args);
    }
}
