package com.api;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
//@WebMvcTest(UserController.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
public class UserControllerTest {

  @Autowired
  MockMvc mockMvc;

  @Test
  public void test() throws Exception {
    mockMvc.perform(get("/user/windjay"))
            .andExpect(status().isOk())
            .andDo(print())
//            .andExpect(view().name("hello"))
            .andExpect(jsonPath("$.name", is(equalTo("windjay"))))
            .andExpect(jsonPath("$.id", is(equalTo("windjay"))))
//            .andExpect(xpath("//h1").string("windjay")) // xml path
            .andExpect(content().string(containsString("windjay")));
  }




}