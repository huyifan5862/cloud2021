package com.bobcfc.controller;

import com.bobcfc.entity.CommonResult;
import com.bobcfc.entity.Payment;
import com.bobcfc.feign.OrderFeign;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class OrderController {
    @Autowired
    RestTemplate template;
    @Autowired
    ObjectMapper mapper;
    @Autowired
    private OrderFeign feign;
    private static String urlPath="http://CLOUD-PROVIDER-PAYMENT";
    @RequestMapping("/get")
    public CommonResult get(long pid) {
        CommonResult forObject = template.getForObject(urlPath+"/get?pid="+pid, CommonResult.class);
        return forObject;
    }
    @RequestMapping("/create")
    public CommonResult create(Payment payment) throws JsonProcessingException {
        System.out.println("payment = " + payment);
        String s = mapper.writeValueAsString(payment);
        CommonResult forObject = template.postForObject(urlPath+"/create",payment,CommonResult.class);
        return forObject;
    }

    @RequestMapping("/get2")
    public CommonResult get2(long pid){
        return feign.getPaymentById(pid);
    }

    @RequestMapping("/time")
    public CommonResult time(){

        return feign.time();
    }



}
