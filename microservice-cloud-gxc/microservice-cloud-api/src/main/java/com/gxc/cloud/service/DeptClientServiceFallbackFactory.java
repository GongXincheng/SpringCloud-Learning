package com.gxc.cloud.service;

import com.gxc.cloud.entity.Dept;

import org.springframework.stereotype.Component;

import java.util.List;

import feign.hystrix.FallbackFactory;

/**
 * 服务降级.
 * @author 宫新程
 * @date 2018/9/14 17:14
 */
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {
  @Override
  public DeptClientService create(Throwable throwable) {
    return new DeptClientService() {
      @Override
      public Dept get(long id) {
        return new Dept().setDeptno(id).setDname("该ID：" + id + "没有没有对应的信息,Consumer客户端提供的降级信息,此刻服务Provider已经关闭")
            .setDb_source("no this database in MySQL");
      }

      @Override
      public List<Dept> list() {
        return null;
      }

      @Override
      public boolean add(Dept dept) {
        return false;
      }
    };
  }
}
