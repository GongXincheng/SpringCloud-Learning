package com.gxc.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * SpringCloud Config Client.
 *
 * @author 宫新程
 * @date 2018/9/15 13:23
 */
@SpringBootApplication
@EnableEurekaClient
public class Config_Client_3355 {
  public static void main(String[] args) {
    SpringApplication.run(Config_Client_3355.class, args);
  }
}
