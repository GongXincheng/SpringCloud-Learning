package com.gxc.springcloud.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 实体类.
 *
 * @author 宫新程
 * @date 2018/9/11 16:21
 */
@AllArgsConstructor //全部属性的构造方法
@NoArgsConstructor  //无参数构造方法
@Data //Get & Set 方法
@Accessors(chain = true) //链式风格访问
public class Dept implements Serializable {

  private Long deptno; // 主键
  private String dname; // 部门名称
  // 来自哪个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库
  private String db_source;

  public Dept(String dname) {
    this.dname = dname;
  }

}
