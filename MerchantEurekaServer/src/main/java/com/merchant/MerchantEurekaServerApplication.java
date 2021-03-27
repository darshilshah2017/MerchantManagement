package com.merchant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MerchantEurekaServerApplication {

    public static void main(String args[]){
        SpringApplication.run(MerchantEurekaServerApplication.class);
    }
}
