package com.guoshao.springcloud.controller;

import com.guoshao.springcloud.entities.CommonResult;
import com.guoshao.springcloud.entities.Payment;
import com.guoshao.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author guoshao
 * @create 2021-06-08 20:44
 */
@RestController
@Slf4j
public class OrderFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;
    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id){
        return paymentFeignService.getPayment(id);
    }
}
