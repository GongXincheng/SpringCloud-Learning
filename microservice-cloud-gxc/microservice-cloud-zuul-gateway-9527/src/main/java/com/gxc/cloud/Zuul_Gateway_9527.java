package com.gxc.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author 宫新程
 * @date 2018/9/15 11:57
 */
@SpringBootApplication
@EnableZuulProxy
public class Zuul_Gateway_9527 {

  public static void main(String[] args) {
    SpringApplication.run(Zuul_Gateway_9527.class, args);
  }
}
