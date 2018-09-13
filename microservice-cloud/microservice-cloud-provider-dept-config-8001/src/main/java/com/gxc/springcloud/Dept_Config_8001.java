package com.gxc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 宫新程
 * @date 2018/9/13 17:25
 */
@EnableEurekaClient
@SpringBootApplication
public class Dept_Config_8001 {

  public static void main(String[] args) {
    SpringApplication.run(Dept_Config_8001.class, args);
  }
}
