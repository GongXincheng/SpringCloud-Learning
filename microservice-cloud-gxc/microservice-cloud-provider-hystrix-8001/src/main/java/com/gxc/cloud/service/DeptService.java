package com.gxc.cloud.service;

import java.util.List;
import com.gxc.cloud.entity.Dept;

public interface DeptService {

  boolean add(Dept dept);

  Dept get(Long id);

  List<Dept> list();

}
