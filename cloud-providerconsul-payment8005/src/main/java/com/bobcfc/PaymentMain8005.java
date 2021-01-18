package com.bobcfc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.bobcfc.mapper")
public class PaymentMain8005 {
    public static void main(String[]args){
        SpringApplication.run(PaymentMain8005.class,args);
    }
}
