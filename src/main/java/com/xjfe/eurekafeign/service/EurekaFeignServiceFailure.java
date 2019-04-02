package com.xjfe.eurekafeign.service;

import org.springframework.stereotype.Service;

/**
 * 服务消费者，调用服务提供者提供的服务失败，回调处理类
 * @author xjf
 * @date 2019/4/2 15:51
 */
@Service
public class EurekaFeignServiceFailure implements EurekaFeignService{
    @Override
    public String info() {
        String message = "网络繁忙，请稍后再试-_-.ps:服务消费者自己提供的信息";
        return message;
    }
}
