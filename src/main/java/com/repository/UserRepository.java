package com.repository;

import com.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, String> {
//    List<User> findbyNameLike(String name);
}
