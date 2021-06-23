package com.guoshao.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author guoshao
 * @create 2021-06-08 9:19
 * 相当于@Controller+@ResponseBody两个注解的结合，返回json数据不需要在方法前面加@ResponseBody注解了，
 * 但使用@RestController这个注解，就不能返回jsp,html页面，视图解析器无法解析jsp,html页面
 */
@RestController
@Slf4j
public class OrderZkController {
    public static final String INVOKE_URL="http://cloud-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/zk")
    public String paymentInfo(){
        return restTemplate.getForObject(INVOKE_URL+"/payment/zk",String.class);
    }
}
