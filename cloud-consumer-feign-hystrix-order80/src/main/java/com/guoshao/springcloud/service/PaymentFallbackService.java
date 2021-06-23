package com.guoshao.springcloud.service;


import org.springframework.stereotype.Component;

/**
 * @author guoshao
 * @create 2021-06-09 16:37
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "----PaymentFallbackService fall back-paymentInfo_OK, /(ㄒoㄒ)/~~";

    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "----PaymentFallbackService fall back-paymentInfo_TimeOut, /(ㄒoㄒ)/~~";
    }
}
