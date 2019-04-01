package com.xjfe.eurekafeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * 程序入口，服务的使用者
 * @author XJF
 */
//启用Eureka服务发现
@EnableDiscoveryClient
//启用Feign
@EnableFeignClients
@SpringBootApplication
public class SpringcloudEurekaFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEurekaFeignApplication.class, args);
    }

}
