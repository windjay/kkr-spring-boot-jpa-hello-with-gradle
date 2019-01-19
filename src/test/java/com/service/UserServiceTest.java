package com.service;

import com.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.NONE)
public class UserServiceTest {

    @Autowired
    UserService userService;

    @Test
    public void testFindById() {
        userService.findById("windjay").orElseThrow(() -> new RuntimeException("Not Found"));
    }
}