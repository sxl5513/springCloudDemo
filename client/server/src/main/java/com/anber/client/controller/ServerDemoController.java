package com.anber.client.controller;

import com.anber.client.common.vo.DemoResponseVo;
import com.anber.client.enums.DemoResponseEnum;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author anber
 */
@RestController
@RequestMapping("/demo")
public class ServerDemoController {

    @GetMapping("/msg")
    public DemoResponseVo msg(){
        DemoResponseVo vo = new DemoResponseVo();
        vo.setResultCode(DemoResponseEnum.SUCCESS.getCode());
        vo.setMsg("访问成功");
        return vo;
    }
}
