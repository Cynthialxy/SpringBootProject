package com.example.springbootproject.common;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yinyin
 * @create 2021/07/22 下午 6:03
 */

public class Result {

    private Boolean success;

    private Integer code;

    private String message;

    private Map<String, Object> data = new HashMap<String, Object>();

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }

    private Result(){

    }
    public static Result ok(){
        Result r=new Result();
//        r.setSuccess(ResultCodeEnum.SUCCESS.getSuccess());
//        r.setCode(ResultCodeEnum.SUCCESS.getCode());
//        r.setMessage(ResultCodeEnum.SUCCESS.getMessages());

        r.setSuccess(true);
        r.setCode(20000);
        r.setMessage("成功");

        return r;

    }
    public static Result error(){
        Result r=new Result();
        r.setSuccess(ResultCodeEnum.UNKNOW_REASON.getSuccess());
        r.setCode(ResultCodeEnum.UNKNOW_REASON.getCode());
        r.setMessage(ResultCodeEnum.UNKNOW_REASON.getMessages());
        return r;
    }

    public static Result setResult(ResultCodeEnum result){
        Result r=new Result();
        r.setSuccess(result.getSuccess());
        r.setCode(result.getCode());
        r.setMessage(result.getMessages());
        return r;
    }
    public Result success(Boolean success){
        this.setSuccess(success);
        return this;
    }
    public Result code(Integer code){
        this.setCode(code);
        return this;
    }

    public Result message(String message){
        this.setMessage(message);
        return this;
    }

    public Result data(String key,Object value){
        this.data.put(key, value);
        return this;
    }

    public  Result data( Map<String, Object> map){
        this.setData(map);
        return this;

    }

}
