package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Acmen on 2017/12/11.
 */
@Controller
public class FreemarkerController {
    @RequestMapping("/go")
    public String Using(Model map){
        map.addAttribute("song","你在南方的艳阳里大雪纷飞");
        map.addAttribute("sex",1);
        List<String> user = new ArrayList<>();
        user.add("大小姐");
        user.add("虞姬");
        user.add("悟空");
        map.addAttribute("userList",user);

        return "index";

    }


}
