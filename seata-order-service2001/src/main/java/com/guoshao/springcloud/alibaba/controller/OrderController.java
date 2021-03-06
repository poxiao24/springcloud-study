package com.guoshao.springcloud.alibaba.controller;

import com.guoshao.springcloud.alibaba.domain.CommonResult;
import com.guoshao.springcloud.alibaba.domain.Order;
import com.guoshao.springcloud.alibaba.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author guoshao
 * @create 2021-06-20 21:19
 */
@RestController
public class OrderController {
    @Resource
    private OrderService orderService;

    @GetMapping("/order/create")
    public CommonResult create(Order order){
        orderService.create(order);
        return new CommonResult(200,"订单创建成功");
    }
}
