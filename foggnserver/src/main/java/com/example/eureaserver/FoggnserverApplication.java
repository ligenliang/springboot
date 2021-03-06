package com.example.eureaserver;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan("com.example")
@EnableFeignClients
public class FoggnserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(FoggnserverApplication.class, args);
    }
}
