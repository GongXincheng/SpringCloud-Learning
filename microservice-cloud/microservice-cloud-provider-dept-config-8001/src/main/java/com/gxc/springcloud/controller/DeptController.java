package com.gxc.springcloud.controller;

import com.gxc.springcloud.entity.Dept;
import com.gxc.springcloud.service.DeptService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * DeptController(Rest).
 *
 * @author 宫新程
 * @date 2018/9/11 21:53
 */
@RestController
@RequestMapping("/dept")
public class DeptController {

  @Autowired private DeptService deptService;

  // Eureka服务发现
  @Autowired private DiscoveryClient client;

  @RequestMapping(value = "/discovery", method = RequestMethod.GET)
  public Object discovery() {
    List<String> list = client.getServices();
    System.out.println("**********" + list);

    List<ServiceInstance> srvList = client.getInstances("microservice-cloud-provider-dept");
    for (ServiceInstance element : srvList) {
      System.out.println(
          element.getServiceId()
              + "\t"
              + element.getHost()
              + "\t"
              + element.getPort()
              + "\t"
              + element.getUri());
    }
    return this.client;
  }

  /**
   * 添加部门.
   *
   * @param dept 部门信息
   * @return boolean
   */
  @PostMapping(value = "/add")
  public boolean add(@RequestBody Dept dept) {
    return this.deptService.add(dept);
  }

  /**
   * 根据 id 获取dept.
   *
   * @param id id
   * @return dept
   */
  @GetMapping(value = "/get/{id}")
  public Dept get(@PathVariable Long id) {
    return this.deptService.get(id);
  }

  @GetMapping(value = "/list")
  public List<Dept> list() {
    return this.deptService.list();
  }
}
