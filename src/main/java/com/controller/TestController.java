package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Acmen on 2017/12/11.
 */
@RestController
public class TestController {

    @RequestMapping("/")
    String index(){
        return "hello Spring Boot";
    }

    @RequestMapping("/hello")
    public List<String> haha(){
        List<String> der = new ArrayList<String>();
        int a= 0;
        int b=1;
        int c=0;
        c= b/a;
        System.out.print(c);
        der.add("汪");
        der.add("汪");
        der.add("汪");
        return der;
    }





}
