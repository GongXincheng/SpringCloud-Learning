package com.gxc.springcloud.controller;

import com.gxc.springcloud.entity.Dept;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

/**
 * DeptController_Consumer.
 * @author 宫新程
 * @date 2018/9/11 22:59
 */
@Controller
public class DeptController_Consumer {

  private static final String URL_PRE = "http://127.0.0.1:8001/dept";

  @Resource
  private RestTemplate restTemplate;

  @RequestMapping("/page")
  public String page() {
    return "addDept";
  }

  /**
   * 添加部门.
   *
   * @param dept 部门信息
   * @return boolean
   */
  @PostMapping(value = "/add")
  @ResponseBody
  public boolean add(Dept dept) {
    return restTemplate.postForObject(URL_PRE + "/add", dept, Boolean.class);
  }

  /**
   * 根据 id 获取dept.
   *
   * @param id id
   * @return dept
   */
  @GetMapping(value = "/get/{id}")
  @ResponseBody
  public Dept get(@PathVariable Long id) {
    return restTemplate.getForObject(URL_PRE + "/get/" + id, Dept.class);
  }

  @GetMapping(value = "/list")
  @ResponseBody
  public List<Dept> list() {
    return restTemplate.getForObject(URL_PRE + "/list", List.class);
  }

  /**
   * 消费者，服务发现.
   * @return 服务发现
   */
  @GetMapping("/discovery")
  @ResponseBody
  public Object discovery() {
    return restTemplate.getForObject(URL_PRE + "/discovery",Object.class);
  }
}
