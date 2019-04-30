package com.example.apolloconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ApolloconfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApolloconfigApplication.class, args);
    }

}
