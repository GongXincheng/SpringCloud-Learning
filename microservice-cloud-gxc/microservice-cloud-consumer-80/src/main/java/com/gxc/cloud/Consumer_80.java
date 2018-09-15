package com.gxc.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/**
 * Consumer_80 启动类.
 * @author 宫新程
 * @date 2018/9/14 9:27
 */
@SpringBootApplication
@EnableEurekaClient
//自定义负载均衡算法
//@RibbonClient(value = "MICROSERVICE-CLOUD-PROVIDER-DEPT", configuration = xxx.class);
public class Consumer_80 {
  public static void main(String[] args) {
    SpringApplication.run(Consumer_80.class, args);
  }
}
