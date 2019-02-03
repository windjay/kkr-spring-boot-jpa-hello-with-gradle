package com.repository;

import com.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

//import static org.junit.Assert.*;

/**
 *  2019-20-02
 * 테스트 시에는 h2database dependency 가 포함되어 있으면 해당 메모리 DB를 사용함
 *
 */
@RunWith(SpringRunner.class)
@DataJpaTest
public class UserRepositoryTest {

  @Autowired
  UserRepository userRepository;

  @Test
  public void testSave() {
    User user = new User("windjay1", "1111", "windjay1");
    userRepository.save(user);

  }

  @Test
  public void testFind() {
    User user = new User("windjay1", "1111", "windjay1");
    List<User> all = userRepository.findAll();

    assertThat(all).isNotEmpty();
    assertThat(all.get(0)).isEqualTo(user);


  }
}
