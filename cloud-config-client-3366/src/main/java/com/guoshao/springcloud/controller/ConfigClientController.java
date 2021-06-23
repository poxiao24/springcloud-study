package com.guoshao.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author guoshao
 * @create 2021-06-12 11:12
 */
@RestController
@RefreshScope
public class ConfigClientController {
    @Value("${config.port}")
    private String serverPort;

    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/configInfo")
    public String getConfigInfo(){
        return "serverPort:"+serverPort+"\t\t\n configInfo:"+configInfo;
    }
}
