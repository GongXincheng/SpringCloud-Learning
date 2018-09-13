package com.gxc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Zuul.
 * @author 宫新程
 * @date 2018/9/13 12:58
 */
@SpringBootApplication
@EnableZuulProxy
public class Zuul_Gateway_9527 {

  // 配置Zuul完成后，可使用 http://zullhost:port/appname/../.. 访问其他微服务
  // http://10.168.3.116:9527/microservice-cloud-provider-dept/dept/get/555

  public static void main(String[] args) {
    SpringApplication.run(Zuul_Gateway_9527.class, args);
  }
}
