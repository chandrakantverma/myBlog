package com.example.myblog.blogapi.service;


import com.example.myblog.blogapi.beans.User;
import com.example.myblog.blogapi.dto.RegisterRequest;
import com.example.myblog.blogapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    UserRepository userRepository;
    public void signUp(RegisterRequest registerRequest) {

        User user = new User();
        user.setUserName(registerRequest.getUsername());
        user.setPassWord(registerRequest.getPassword());
        user.setEmail(registerRequest.getEmail());
        userRepository.save(user);
    }
}
