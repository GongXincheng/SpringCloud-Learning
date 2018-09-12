package com.gxc.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 启动类.
 *
 * @author 宫新程
 * @date 2018/9/11 22:04
 */
@SpringBootApplication
@EnableEurekaClient //启用Eureka
@MapperScan(basePackages = "com.gxc.springcloud.dao")
@EnableDiscoveryClient //服务发现
@EnableCircuitBreaker //对 Hystrix 熔断机制的支持
public class DeptProvider8001_Hystrix_App {

  public static void main(String[] args) {
    SpringApplication.run(DeptProvider8001_Hystrix_App.class, args);
  }
}
