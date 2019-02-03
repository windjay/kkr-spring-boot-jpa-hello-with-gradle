package com.api;

import com.domain.User;
import com.repository.UserRepository;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

//    @Autowired
//    UserRepository userRepository;

    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable String id, HttpServletRequest req) {
        User user = userService.findById(id).orElseThrow(() -> new RuntimeException("Not Found " + id));
        return ResponseEntity.ok(user);
    }

//    @GetMapping("/{id}")
//    public ResponseEntity<User> findById(@PathVariable String id, HttpServletRequest req) {
//        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("Not Found " + id));
//        return ResponseEntity.ok(user);
//    }



}
