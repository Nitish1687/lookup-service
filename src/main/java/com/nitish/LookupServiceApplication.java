package com.nitish;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class LookupServiceApplication {

    public static void main(String[] args) {
        System.setProperty("spring.config.name", "registration-server");

        SpringApplication.run(LookupServiceApplication.class, args);
    }
}
