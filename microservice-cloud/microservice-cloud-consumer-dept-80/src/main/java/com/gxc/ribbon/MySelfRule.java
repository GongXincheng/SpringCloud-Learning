package com.gxc.ribbon;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自定义Ribbon规则类.
 * @author 宫新程
 * @date 2018/9/12 15:22
 */
@Configuration
public class MySelfRule {

  @Bean
  public IRule myRule() {
    //自定义为随机
    return new RandomRule();
  }

}
