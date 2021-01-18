package com.bobcfc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
//@RibbonClient(name="CLOUD-PROVIDER-PAYMENT",configuration = MySelfRule.class)  //使用自定义的负载均衡
@EnableEurekaClient
@EnableFeignClients
public class OrderFeign80Main {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeign80Main.class, args);
    }
}
