package com.gxc.cloud.service;

import com.gxc.cloud.entity.Dept;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * FeignClient
 * @author 宫新程
 * @date 2018/9/14 13:01
 */
//@FeignClient(value = "MICROSERVICE-CLOUD-PROVIDER-DEPT")
@FeignClient(value = "MICROSERVICE-CLOUD-PROVIDER-DEPT", fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService {

  @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
  Dept get(@PathVariable("id") long id);

  @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
  List<Dept> list();

  @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
  boolean add(Dept dept);

//  @RequestMapping(value = "/dept/discovery", method = RequestMethod.GET)
//  Object discovery();

}
