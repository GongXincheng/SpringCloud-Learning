package com.gxc.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 测试Hystrix的启动类.
 * @author 宫新程
 * @date 2018/9/14 14:31
 */
@SpringBootApplication
@EnableEurekaClient   //Eureka客户端支持
@EnableCircuitBreaker //对 Hystrix 熔断机制的支持
public class Provide_Hystrix_8001 {

  public static void main(String[] args) {
    SpringApplication.run(Provide_Hystrix_8001.class, args);
  }

}
