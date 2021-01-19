package com.bobcfc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@MapperScan("com.bobcfc.mapper")
@EnableEurekaClient
public class HystrixPaymentMain8001 {
    public static void main(String[]args){
        SpringApplication.run(HystrixPaymentMain8001.class,args);
    }
}
