package com.bobcfc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Order82Main {
    public static void main(String[] args) {
        SpringApplication.run(Order82Main.class, args);
    }
}
