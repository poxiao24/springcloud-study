package com.guoshao.springcloud.service;

import com.guoshao.springcloud.entities.CommonResult;
import com.guoshao.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author guoshao
 * @create 2021-06-08 20:39
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {
    @GetMapping(value = "/payment/get/{id}")
    CommonResult<Payment> getPayment(@PathVariable("id") Long id);
}
