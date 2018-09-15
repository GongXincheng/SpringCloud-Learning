package com.gxc.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * SpringCloud Config Server.
 * @author 宫新程
 * @date 2018/9/15 12:59
 */
@SpringBootApplication
@EnableConfigServer
public class Config_3344 {

  public static void main(String[] args) {
    SpringApplication.run(Config_3344.class);
  }
}
