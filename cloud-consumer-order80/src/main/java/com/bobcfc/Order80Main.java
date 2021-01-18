package com.bobcfc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//@RibbonClient(name="CLOUD-PROVIDER-PAYMENT",configuration = MySelfRule.class)  //使用自定义的负载均衡
@EnableEurekaClient
public class Order80Main {
    public static void main(String[] args) {
        SpringApplication.run(Order80Main.class, args);
    }
}
