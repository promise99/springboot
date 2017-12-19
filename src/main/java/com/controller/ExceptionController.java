package com.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Acmen on 2017/12/11.
 */
@ControllerAdvice
public class ExceptionController {
    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public Map<String,String> ExceptionHandler(){
        Map<String,String> map = new HashMap<String,String>();
        map.put("code","500");
        map.put("msg","亲，系统错误，我们杀了个程序员祭天");
        return map;
    }




}
