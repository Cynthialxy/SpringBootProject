package com.example.springbootproject.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel(value = "User对象",description = "用户")
public class User {

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @ApiModelProperty(value = "用户id")
    private int id;
    @ApiModelProperty(value = "用户名")
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

