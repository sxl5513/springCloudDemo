package com.anber.client_two;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author anber
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class ClientTwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientTwoApplication.class, args);
    }

}
