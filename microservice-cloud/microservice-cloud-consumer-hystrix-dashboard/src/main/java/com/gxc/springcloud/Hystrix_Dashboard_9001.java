package com.gxc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author 宫新程
 * @date 2018/9/13 10:41
 */
@SpringBootApplication
@EnableHystrixDashboard
public class Hystrix_Dashboard_9001 {

  public static void main(String[] args) {
    SpringApplication.run(Hystrix_Dashboard_9001.class, args);
  }
}


