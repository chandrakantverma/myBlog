package com.example.myblog.blogapi.controller;

import com.example.myblog.blogapi.beans.Post;
import com.example.myblog.blogapi.service.UserPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user/{userid}")
public class UserPostController {

    @Autowired
    UserPostService userPostService;

    @GetMapping("/home")
    public String getHomePage(){
        return "<h1>Welcome</h1>";
    }

    @PostMapping("/post")
    public ResponseEntity createUserPost(@RequestBody(required = false) Post postRequestBody){
        return userPostService.createUserPost(postRequestBody);
    }
}
