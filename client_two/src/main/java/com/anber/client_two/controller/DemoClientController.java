package com.anber.client_two.controller;

import com.anber.client_two.client.DemoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoClientController {

    @Autowired
    private DemoClient demoClient;

    @GetMapping("/getClientMsg")
    public String getClientMsg(){
        String response = demoClient.testMsg();
        return response;
    }
}
