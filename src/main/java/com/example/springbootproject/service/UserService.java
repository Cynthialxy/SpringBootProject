package com.example.springbootproject.service;

import com.example.springbootproject.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    List<User> getAllUser();
}
