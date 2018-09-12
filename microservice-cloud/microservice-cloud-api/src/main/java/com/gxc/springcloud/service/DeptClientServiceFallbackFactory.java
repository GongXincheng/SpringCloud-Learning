package com.gxc.springcloud.service;

import com.gxc.springcloud.entity.Dept;
import feign.hystrix.FallbackFactory;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 * 服务降级：注意：不要忘记加 @Component 注解,
 * @author 宫新程
 * @date 2018/9/12 23:18
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

      @Override
      public Object discovery() {
        return null;
      }
    };
  }
}
