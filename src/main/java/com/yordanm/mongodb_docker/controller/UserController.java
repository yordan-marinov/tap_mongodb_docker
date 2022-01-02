package com.yordanm.mongodb_docker.controller;

import com.yordanm.mongodb_docker.model.User;
import com.yordanm.mongodb_docker.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/api/resources/users")
    private List<User> getAllUsers(){
        return userService.getUsers();
    }
}
