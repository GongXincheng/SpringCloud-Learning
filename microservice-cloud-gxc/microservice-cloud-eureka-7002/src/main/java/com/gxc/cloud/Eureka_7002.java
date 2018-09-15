package com.gxc.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka_7002.
 * @author 宫新程
 * @date 2018/9/14 10:07
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka_7002 {
  public static void main(String[] args) {
    SpringApplication.run(Eureka_7002.class, args);
  }
}
