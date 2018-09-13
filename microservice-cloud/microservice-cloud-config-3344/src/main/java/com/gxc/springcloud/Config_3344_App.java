package com.gxc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * SpringCloud Config Server.
 * @author 宫新程
 * @date 2018/9/13 14:27
 */
@SpringBootApplication
@EnableConfigServer
public class Config_3344_App {

  public static void main(String[] args) {
    SpringApplication.run(Config_3344_App.class, args);
  }
}
