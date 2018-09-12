package com.gxc.springcloud.service;

import com.gxc.springcloud.entity.Dept;

import java.util.List;

public interface DeptService {
  boolean add(Dept dept);

  Dept get(Long id);

  List<Dept> list();
}
