package com.example.myblog.blogapi.repository;

import com.example.myblog.blogapi.beans.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
