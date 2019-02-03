package com;

import com.domain.User;
import com.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloApplicationTests {

    @Autowired
    UserRepository userRepository;

    @Test
    public void save() {
        userRepository.save(new User("windjay1", "1111", "windjay"));
    }

}

