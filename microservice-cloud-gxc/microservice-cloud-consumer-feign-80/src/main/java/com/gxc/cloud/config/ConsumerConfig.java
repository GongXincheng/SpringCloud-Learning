package com.gxc.cloud.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RetryRule;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 配置类.
 * @author 宫新程
 * @date 2018/9/14 9:30
 */
@Configuration
public class ConsumerConfig {

  @Bean
  @LoadBalanced  //开启Ribbon，实现负载均衡
  public RestTemplate getRestTemplate() {
    return new RestTemplate();
  }

  @Bean
  public IRule myRule() {
    //1：默认轮询算法
    //return new RoundRobinRule();
    //2：用重新选择的随机算法替代默认的轮询算法
    //return new RandomRule();
    return new RetryRule();
  }

}
