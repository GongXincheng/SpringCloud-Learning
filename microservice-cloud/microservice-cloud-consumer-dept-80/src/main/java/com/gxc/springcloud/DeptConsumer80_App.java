package com.gxc.springcloud;

import com.gxc.ribbon.MySelfRule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * 启动类.
 *
 * @author 宫新程
 * @date 2018/9/11 23:10
 */
@SpringBootApplication
@EnableEurekaClient
//自定义Ribbon配置类，注意：MySelfRule不能在启动类同包，或者子包下！
@RibbonClient(name = "MICROSERVICE-CLOUD-PROVIDER-DEPT", configuration = MySelfRule.class)
public class DeptConsumer80_App {

  public static void main(String[] args) {
    SpringApplication.run(DeptConsumer80_App.class,args);
  }
}
