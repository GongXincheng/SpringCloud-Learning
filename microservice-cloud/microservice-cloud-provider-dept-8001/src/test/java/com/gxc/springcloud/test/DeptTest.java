package com.gxc.springcloud.test;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

import com.gxc.springcloud.controller.DeptController;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * @author 宫新程
 * @date 2018/9/11 22:09
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DeptTest {

  private MockMvc mockMvc;

  @Before
  public void init() {
    mockMvc = MockMvcBuilders.standaloneSetup(new DeptController()).build();
  }

  @Test
  public void testAdd() throws Exception {
    mockMvc
        .perform(
            MockMvcRequestBuilders.get("/dept/get/3"))
        .andDo(print());
  }

}
