package com.bobcfc.feign;

import com.bobcfc.entity.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(value = "CLOUD-PROVIDER-PAYMENT")
public interface OrderFeign {
    @RequestMapping("/get")
     CommonResult getPaymentById(@RequestParam("pid") Long pid);

    @RequestMapping("/time")
    CommonResult time();
}
