package com.anber.client_two.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "client")
public interface DemoClient {

    @GetMapping("/demo/msg")
    String testMsg();
}
