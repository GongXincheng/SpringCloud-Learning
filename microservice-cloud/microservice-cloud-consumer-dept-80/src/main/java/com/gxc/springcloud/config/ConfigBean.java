package com.gxc.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 配置类.
 * @author 宫新程
 * @date 2018/9/11 22:54
 */
@Configuration
public class ConfigBean {

  @Bean
  public RestTemplate getRestTemplate() {
    return new RestTemplate();
  }

}
