package com.merchant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class OTPManagementApplication {

    public static void main(String args[]){
        SpringApplication.run(OTPManagementApplication.class);
    }
}
