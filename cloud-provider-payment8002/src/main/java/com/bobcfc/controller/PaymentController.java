package com.bobcfc.controller;

import com.bobcfc.entity.CommonResult;
import com.bobcfc.entity.Payment;
import com.bobcfc.service.PaymentService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

@RestController
@Slf4j
public class PaymentController {
    @Resource
    PaymentService paymentService;
    @Value("${server.port}")
    private String port;

    @Autowired
    ObjectMapper mapper;
    @RequestMapping("/create")
    public CommonResult createPayment(@RequestBody Payment payment) throws JsonProcessingException {
        System.out.println("payment = " + payment);
        boolean save = paymentService.saveOrUpdate(payment);
        log.info("******开始插入*****");
        int i = 1;
        if (save) {
            log.info("*****插入成功!*****");
            return new CommonResult(200, "插入成功!", save);
        } else {
            log.error("*****插入失败!*****");
            return new CommonResult(500, "插入失败!", save);
        }
    }

    @RequestMapping("/get")
    public CommonResult getPaymentById(Long pid) {
        Payment paymentById = paymentService.getById(pid);
        return new CommonResult(200, "查询成功!"+port, paymentById);
    }

    @RequestMapping("/time")
    public CommonResult time() throws InterruptedException {
        TimeUnit.SECONDS.sleep(3);
        return new CommonResult(200,"成功!");
    }
}
