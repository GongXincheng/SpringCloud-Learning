package com.gxc.springcloud.service.impl;

import com.gxc.springcloud.dao.DeptDao;
import com.gxc.springcloud.entity.Dept;
import com.gxc.springcloud.service.DeptService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * DeptServiceImpl.
 *
 * @author 宫新程
 * @date 2018/9/11 21:49
 */
@Service
public class DeptServiceImpl implements DeptService {

  @Autowired
  private DeptDao deptDao;

  @Override
  public boolean add(Dept dept) {
    return deptDao.addDept(dept);
  }

  @Override
  public Dept get(Long id) {
    return this.deptDao.findById(id);
  }

  @Override
  public List<Dept> list() {
    return this.deptDao.findAll();
  }
}
