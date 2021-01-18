package com.bobcfc.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
/*
* 自定义负载均衡
* */
public class MySelfRule {
    @Bean
    public IRule myRule() {
//        随机
        return new RandomRule();
    }
}
