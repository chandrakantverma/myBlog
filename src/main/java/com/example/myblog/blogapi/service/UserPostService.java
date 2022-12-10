package com.example.myblog.blogapi.service;


import com.example.myblog.blogapi.beans.Post;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserPostService {

    public ResponseEntity createUserPost(Post postRequestBody){
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
