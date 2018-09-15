package com.gxc.cloud.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * Dept实体类.
 * @author 宫新程
 * @date 2018/9/14 8:59
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Dept implements Serializable {

  private Long deptno;
  private String dname;
  private String db_source;

  public Dept(String dname) {
    this.dname = dname;
  }
}
