package com.gxc.cloud.mapper;

import com.gxc.cloud.entity.Dept;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

/**
 * DeptMapper.
 * @author 宫新程
 * @date 2018/9/11 17:11
 */
@Mapper
public interface DeptMapper {

  boolean addDept(Dept dept);

  Dept findById(Long id);

  List<Dept> findAll();

}
