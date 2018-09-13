package com.gxc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 全配置版 Eureka Server.
 * @author 宫新程
 * @date 2018/9/13 16:40
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaClient_7001 {

  public static void main(String[] args) {
    SpringApplication.run(EurekaClient_7001.class, args);
  }
}
