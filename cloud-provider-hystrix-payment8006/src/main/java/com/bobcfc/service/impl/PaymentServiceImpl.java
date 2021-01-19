package com.bobcfc.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bobcfc.entity.CommonResult;
import com.bobcfc.entity.Payment;
import com.bobcfc.mapper.PaymentMapper;
import com.bobcfc.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.Serializable;

@Service
public class PaymentServiceImpl extends ServiceImpl<PaymentMapper,Payment> implements PaymentService {

}
