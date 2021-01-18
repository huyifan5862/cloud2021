package com.bobcfc.controller;

import com.bobcfc.entity.CommonResult;
import com.bobcfc.entity.Payment;
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
    @RequestMapping("/get")
    public CommonResult get(long pid) {
        CommonResult forObject = template.getForObject("http://cloud-providerconsul-payment/get?pid="+pid, CommonResult.class);
        return forObject;
    }
    @RequestMapping("/create")
    public CommonResult create(Payment payment) throws JsonProcessingException {
        System.out.println("payment = " + payment);
        String s = mapper.writeValueAsString(payment);
        CommonResult forObject = template.postForObject("http://cloud-providerconsul-payment/create",payment,CommonResult.class);
        return forObject;
    }
}
