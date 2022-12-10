package com.example.myblog.blogapi.controller;

import com.example.myblog.blogapi.dto.RegisterRequest;
import com.example.myblog.blogapi.service.AuthService;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collections;

@RestController
@RequestMapping("api/auth")
public class AuthController {

    @Autowired
    AuthService authService;

    @PostMapping("/signup")
    public ResponseEntity signUp(@RequestBody RegisterRequest registerRequest){
        return new ResponseEntity<>(HttpStatus.OK);

    }
}
