package com.gxc.springcloud.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import com.netflix.loadbalancer.RoundRobinRule;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 配置类.
 *
 * @author 宫新程
 * @date 2018/9/11 22:54
 */
@Configuration
public class ConfigBean {

  @Bean
  @LoadBalanced // Ribbon负载均衡,客户端负载均衡工具
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
