package com.gxc.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * HystrixDashboard 监控.
 * @author 宫新程
 * @date 2018/9/15 11:32
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboard_9001 {
  public static void main(String[] args) {
    SpringApplication.run(HystrixDashboard_9001.class, args);
  }
}
