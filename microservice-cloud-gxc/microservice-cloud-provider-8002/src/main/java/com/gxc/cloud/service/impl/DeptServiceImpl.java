package com.gxc.cloud.service.impl;

import com.gxc.cloud.entity.Dept;
import com.gxc.cloud.mapper.DeptMapper;
import com.gxc.cloud.service.DeptClientService;
import com.gxc.cloud.service.DeptService;

import org.springframework.stereotype.Service;

import java.util.List;

import javax.annotation.Resource;

/**
 * DeptServiceImpl.
 * @author 宫新程
 * @date 2018/9/14 9:13
 */
@Service
public class DeptServiceImpl implements DeptService {

  @Resource
  private DeptMapper deptMapper;


  @Override
  public boolean add(Dept dept) {
    return deptMapper.addDept(dept);
  }

  @Override
  public Dept get(Long id) {
    return deptMapper.findById(id);
  }

  @Override
  public List<Dept> list() {
    return deptMapper.findAll();
  }
}
