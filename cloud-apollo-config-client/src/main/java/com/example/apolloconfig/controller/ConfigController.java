package com.example.apolloconfig.controller;


import com.example.apolloconfig.config.ApolloConfig;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ConfigController {
    @Resource
    private ApolloConfig apolloConfig;

    @RequestMapping("getConfig")
    public String getConfig(){
        return apolloConfig.getEnv();
    }
}
