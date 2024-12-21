package com.example.springbootproject.controller;

import com.example.springbootproject.common.Result;
import com.example.springbootproject.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/json")
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/user1")
    public Result user(){
//        User user = new User(1,"张三");

        return Result.ok().data("user",new User(1,"张三"));
//        return user;
    }

    @GetMapping("/list")
    public Result getUserlist(){
        User user = new User(1,"张三");
        User user1 = new User(2,"李四");
        User user2 = new User(3,"王五");

        ArrayList<User> objects = new ArrayList<>();
        objects.add(user);
        objects.add(user1);
        objects.add(user2);

        return Result.ok().data("list",objects);
//        return objects;
    }

    @GetMapping("/map")
    public Result getMap(){
        Map<String,Object> map = new HashMap<>();
        User user = new User(1,"张三");

        map.put("用户信息",user);
        map.put("粉丝数",12345);

        return Result.ok().data("map",map);
//        return map;
    }

}
