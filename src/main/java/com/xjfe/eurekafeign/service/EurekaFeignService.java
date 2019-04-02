package com.xjfe.eurekafeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 服务消费者，调用服务提供者提供的服务，实现业务
 * @Author: xjf
 * @Date: 2019/4/1 22:48
 */
//调用服务的名称
@FeignClient(value = "eureka-client",fallback = EurekaFeignServiceFailure.class)
public interface EurekaFeignService {

    /**
     * 调用服务的方法
     * @return
     */
    @RequestMapping(value = "/info")
    String info();
}
