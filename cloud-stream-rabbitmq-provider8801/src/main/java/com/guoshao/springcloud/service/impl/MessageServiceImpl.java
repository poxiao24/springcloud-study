package com.guoshao.springcloud.service.impl;

import com.guoshao.springcloud.service.IMessageService;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author guoshao
 * @create 2021-06-13 9:28
 */
@EnableBinding(Source.class)
public class MessageServiceImpl implements IMessageService {
    @Resource
    private MessageChannel output;//消息发送通道

    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("************serial:"+serial);
        return serial;
    }
}
