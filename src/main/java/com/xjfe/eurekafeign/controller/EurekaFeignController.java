package com.xjfe.eurekafeign.controller;

import com.xjfe.eurekafeign.service.EurekaFeignService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 服务消费控制器类，对用户提供服务
 * @Author: xjf
 * @Date: 2019/4/1 22:50
 */
@RestController
public class EurekaFeignController {

    @Resource
    private EurekaFeignService eurekaFeignService;

    @RequestMapping("/feignInfo")
    public String feignInfo(){
        String message = eurekaFeignService.info();

        return "获取到的信息："+message;
    }
}
