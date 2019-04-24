package com.example.springcloudconfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController {

    @Value("${env}") // git配置文件里的key
    String configEnv;

    @RequestMapping("/getConfigInfo")
    public String getConfigInfo(){
        return "获取环境配置：" +  configEnv;
    }
}
