package com.example.springbootproject.controller;

import com.example.springbootproject.common.Result;
import com.example.springbootproject.entity.User;
import com.example.springbootproject.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;

import java.util.List;

@Api(tags = "用户管理")
@RestController
@Validated
public class FirstController {

    @Autowired
    private UserService userService;

    //?传一个参数
    @ApiOperation("获取id")
    @GetMapping("test")
    public Result testGet(Integer id){
        System.out.println("id:"+id);
        return Result.ok().data("user",id);
    }

    //?传两个参数
    @ApiOperation("获取id和name")
    @GetMapping("test2")
    public Result testGet2(Integer id, String name){
        System.out.println("id:"+id+", "+"name:"+name);
        return Result.ok().data("user",id).data("name",name);
    }

    //`/`传一个参数
    @ApiOperation("获取id")
    @GetMapping("path/{id}")
    public Result testPath2(@PathVariable Integer id){
        System.out.println("id:"+id);
        return Result.ok().data("user",id);
    }

    //`/`传两个参
    @ApiOperation("获取id和name")
    @GetMapping("path2/{id}/{name}")
    public Result testPath(@PathVariable Integer id,@PathVariable String name){
        System.out.println("id:"+id+", "+"name:"+name);
        return Result.ok().data("user",id).data("name",name);
    }

    //post json传参
    @ApiOperation("json获取user对象")
    @PostMapping("login")
    public Result testForm(@RequestBody User user){
        System.out.println("user:"+user);
        return Result.ok().data("user",user);
    }

    //post form-data传参
    @ApiOperation("form-data获取user对象")
    @PostMapping("login2")
    public Result testForm2(@ModelAttribute User user) {
        System.out.println(user);
        return Result.ok().data("user",user);
    }

    @ApiOperation("获取用户列表")
    @GetMapping("getUsers")
    public Result getAll(){
        List<User> list = userService.getAllUser();
        return Result.ok().data("user",list);
    }

}
