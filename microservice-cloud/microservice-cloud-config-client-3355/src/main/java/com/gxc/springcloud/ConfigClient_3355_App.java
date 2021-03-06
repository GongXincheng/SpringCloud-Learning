package com.gxc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 宫新程
 * @date 2018/9/13 15:05
 */
@SpringBootApplication
@EnableEurekaClient //启用Eureka
public class ConfigClient_3355_App {

  public static void main(String[] args) {
    SpringApplication.run(ConfigClient_3355_App.class, args);
  }
}
