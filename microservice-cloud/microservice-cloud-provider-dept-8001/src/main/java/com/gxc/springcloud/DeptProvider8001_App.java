package com.gxc.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 启动类.
 *
 * @author 宫新程
 * @date 2018/9/11 22:04
 */
@SpringBootApplication
@MapperScan("com.gxc.springcloud.dao")
@EnableEurekaClient //启用Eureka
@EnableDiscoveryClient //服务发现
public class DeptProvider8001_App {

  public static void main(String[] args) {
    SpringApplication.run(DeptProvider8001_App.class,args);
  }
}
