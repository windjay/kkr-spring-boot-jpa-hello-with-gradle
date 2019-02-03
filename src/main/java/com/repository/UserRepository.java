package com.repository;

import com.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
//    List<User> findbyNameLike(String name);
}

