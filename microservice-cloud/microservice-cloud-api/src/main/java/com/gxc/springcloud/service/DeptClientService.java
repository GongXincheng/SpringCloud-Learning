package com.gxc.springcloud.service;

import com.gxc.springcloud.entity.Dept;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 *  修改microservicecloud-api工程，根据已经有的DeptClientService接口.
 * 新建.
 * 一个实现了FallbackFactory接口的类DeptClientServiceFallbackFactory.
 * @author 宫新程
 * @date 2018/9/11 16:21
 */

@FeignClient(
    value = "MICROSERVICE-CLOUD-PROVIDER-DEPT",
    fallbackFactory = DeptClientServiceFallbackFactory.class)
//@FeignClient(value = "MICROSERVICE-CLOUD-PROVIDER-DEPT")
public interface DeptClientService {

  @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
   Dept get(@PathVariable("id") long id);

  @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
   List<Dept> list();

  @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
   boolean add(Dept dept);

  @RequestMapping(value = "/dept/discovery", method = RequestMethod.GET)
   Object discovery();
}
