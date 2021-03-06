package com.gxc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 集群版 Eureka.
 * @author 宫新程
 * @date 2018/9/12 10:45
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka_7002_App {

  public static void main(String[] args) {
    SpringApplication.run(Eureka_7002_App.class);
  }
}
