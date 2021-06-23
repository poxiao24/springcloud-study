package com.guoshao.springcloud.controller;

import com.guoshao.springcloud.service.IMessageService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author guoshao
 * @create 2021-06-13 9:36
 */
@RestController
public class SendMessageController {
    @Resource
    private IMessageService messageService;

    @RequestMapping("/sendMessage")
    public String sendMessage(){
        String send= messageService.send();
        return send;
    }
}
