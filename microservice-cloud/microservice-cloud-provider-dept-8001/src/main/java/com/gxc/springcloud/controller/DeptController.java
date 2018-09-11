package com.gxc.springcloud.controller;

import com.gxc.springcloud.entity.Dept;
import com.gxc.springcloud.service.DeptService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * DeptController(Rest).
 *
 * @author 宫新程
 * @date 2018/9/11 21:53
 */
@RestController
@RequestMapping("/dept")
public class DeptController {

  @Autowired
  private DeptService deptService;

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
