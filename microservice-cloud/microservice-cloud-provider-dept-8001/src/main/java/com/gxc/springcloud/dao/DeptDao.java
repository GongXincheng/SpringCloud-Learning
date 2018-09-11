package com.gxc.springcloud.dao;

import com.gxc.springcloud.entity.Dept;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * DeptDao.
 * @author 宫新程
 * @date 2018/9/11 17:11
 */
@Mapper
public interface DeptDao {

  boolean addDept(Dept dept);

  Dept findById(Long id);

  List<Dept> findAll();

}
