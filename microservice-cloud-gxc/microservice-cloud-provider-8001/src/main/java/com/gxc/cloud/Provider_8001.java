package com.gxc.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Provider_8001.
 * @author 宫新程
 * @date 2018/9/14 9:21
 */
@SpringBootApplication
@EnableEurekaClient
public class Provider_8001 {

  public static void main(String[] args) {
    SpringApplication.run(Provider_8001.class, args);
  }
}
