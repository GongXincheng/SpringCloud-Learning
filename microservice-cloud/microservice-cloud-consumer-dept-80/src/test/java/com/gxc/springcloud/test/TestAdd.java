package com.gxc.springcloud.test;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

import com.gxc.springcloud.controller.DeptController_Consumer;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * @author 宫新程
 * @date 2018/9/11 23:13
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestAdd {

  private MockMvc mockMvc;

  @Before
  public void init() {
    mockMvc = MockMvcBuilders.standaloneSetup(new DeptController_Consumer()).build();
  }

  @Test
  public void testAdd() throws Exception {
    mockMvc
        .perform(
            MockMvcRequestBuilders.get("/get/3"))
        .andDo(print());
  }


}
