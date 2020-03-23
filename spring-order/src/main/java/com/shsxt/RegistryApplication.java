package com.shsxt;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer // 启动eureka注册中心
public class RegistryApplication {

    public static void main(String[] args) {
        System.out.println("helloworld");
        SpringApplication.run(RegistryApplication.class, args);
    }

}
