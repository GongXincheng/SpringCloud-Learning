package com.gxc.cloud.controller;

import com.gxc.cloud.entity.Dept;
import com.gxc.cloud.service.DeptClientService;
import com.gxc.cloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * DeptController.
 * @author 宫新程
 * @date 2018/9/14 9:09
 */
@RestController
@RequestMapping("/dept")
public class DeptController {

  @Resource
  private DeptService deptService;

  @PostMapping(value = "/add")
  public boolean add(@RequestBody Dept dept) {
    return this.deptService.add(dept);
  }

  // 测试 Hystrix 服务熔断
  @GetMapping(value = "/get/{id}")
  @HystrixCommand(fallbackMethod = "processHystrix_Get")
  public Dept get(@PathVariable Long id) {
    Dept dept = this.deptService.get(id);
    if(dept == null) {
      throw new RuntimeException("该ID：" + id + "没有没有对应的信息");
    }
    dept.setDb_source(dept.getDb_source() + "3");
    return dept;
  }

  public Dept processHystrix_Get(@PathVariable Long id) {
    return new Dept().setDeptno(id).setDname("该ID：" + id + "，没有对应的信息，null--@HystrixCommand")
        .setDb_source("no this database in MySQL");
  }

  @GetMapping(value = "/list")
  public List<Dept> list() {
    List<Dept> list = this.deptService.list();
    for (Dept dept : list) {
      dept.setDb_source(dept.getDb_source() + "3");
    }
    return list;
  }

}
