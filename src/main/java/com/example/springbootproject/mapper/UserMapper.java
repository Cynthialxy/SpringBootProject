package com.example.springbootproject.mapper;

import com.example.springbootproject.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("SELECT * FROM customer")
    List<User> getAllUser();
}
