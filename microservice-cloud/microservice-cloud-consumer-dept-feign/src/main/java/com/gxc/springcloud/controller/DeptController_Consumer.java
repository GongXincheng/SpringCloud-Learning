package com.gxc.springcloud.controller;

import com.gxc.springcloud.entity.Dept;
import com.gxc.springcloud.service.DeptClientService;
import com.netflix.discovery.converters.Auto;

import java.util.List;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * DeptController_Consumer：使用Feign.
 * @author 宫新程
 * @date 2018/9/11 22:59
 */
@RestController
public class DeptController_Consumer {

  @Autowired
  private DeptClientService deptService;

  @PostMapping(value = "/add")
  @ResponseBody
  public boolean add(Dept dept) {
    return deptService.add(dept);
  }

  @GetMapping(value = "/get/{id}")
  @ResponseBody
  public Dept get(@PathVariable Long id) {
    return this.deptService.get(id);
  }

  @GetMapping(value = "/list")
  @ResponseBody
  public List<Dept> list() {
    return this.deptService.list();
  }

  @GetMapping("/discovery")
  @ResponseBody
  public Object discovery() {
    return this.deptService.discovery();
  }

}
