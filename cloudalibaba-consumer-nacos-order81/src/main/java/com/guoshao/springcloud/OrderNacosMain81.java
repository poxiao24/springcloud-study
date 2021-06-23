package com.guoshao.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author guoshao
 * @create 2021-06-13 22:01
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderNacosMain81 {
    public static void main(String[] args) {
        SpringApplication.run(OrderNacosMain81.class,args);
    }
}
