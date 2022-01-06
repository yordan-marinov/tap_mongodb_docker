package com.yordanm.mongodb_docker.service;

import com.yordanm.mongodb_docker.model.User;
import com.yordanm.mongodb_docker.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<User> getUsers() {

        return userRepository.findAll().stream().toList();
    }
}
