package com.gxc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * 启动类.
 *
 * @author 宫新程
 * @date 2018/9/11 23:10
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients  //启用Feign
public class DeptConsumer80_Feign_App {

  public static void main(String[] args) {
    SpringApplication.run(DeptConsumer80_Feign_App.class, args);
  }
}
