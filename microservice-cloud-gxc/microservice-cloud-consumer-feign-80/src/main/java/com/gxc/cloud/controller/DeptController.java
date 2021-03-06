package com.gxc.cloud.controller;

import com.gxc.cloud.entity.Dept;
import com.gxc.cloud.service.DeptClientService;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


/**
 * 消费端DeptController,使用Feign.
 * @author 宫新程
 * @date 2018/9/14 9:29
 */
@RestController
@RequestMapping("/consumer")
public class DeptController {

  //Rest微服务构建
  //private static final String URL_PREFIX = "http://localhost:8001";
  //Eureka + Ribbon
//  private static final String URL_PREFIX = "http://MICROSERVICE-CLOUD-PROVIDER-DEPT";
//
//  @Resource
//  private RestTemplate restTemplate;
//
  @Resource
  private DeptClientService deptService;



  @PostMapping(value = "/add")
  public boolean add(@RequestBody Dept dept) {
    return deptService.add(dept);
  }

  @GetMapping(value = "/get/{id}")
  public Dept get(@PathVariable Long id) {
    return deptService.get(id);
  }

  @GetMapping(value = "/list")
  public List<Dept> list() {
    return deptService.list();
  }

}
