package com.gxc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka_7001_App 启动类.
 * @author 宫新程
 * @date 2018/9/12 9:01
 */
@SpringBootApplication
@EnableEurekaServer //接受其他微服务注册进来
public class Eureka_7001_App {

  public static void main(String[] args) {
    SpringApplication.run(Eureka_7001_App.class, args);
  }
}
