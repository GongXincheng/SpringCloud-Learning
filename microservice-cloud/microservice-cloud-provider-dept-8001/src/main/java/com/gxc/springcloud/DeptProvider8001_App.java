package com.gxc.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类.
 *
 * @author 宫新程
 * @date 2018/9/11 22:04
 */
@SpringBootApplication
@MapperScan("com.gxc.springcloud.dao")
public class DeptProvider8001_App {

  public static void main(String[] args) {
    SpringApplication.run(DeptProvider8001_App.class,args);
  }
}
