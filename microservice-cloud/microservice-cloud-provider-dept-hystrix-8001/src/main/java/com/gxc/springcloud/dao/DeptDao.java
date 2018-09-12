package com.gxc.springcloud.dao;

import com.gxc.springcloud.entity.Dept;

import java.util.List;

/**
 * DeptDao.
 * @author 宫新程
 * @date 2018/9/11 17:11
 */
public interface DeptDao {

  boolean addDept(Dept dept);

  Dept findById(Long id);

  List<Dept> findAll();

}
