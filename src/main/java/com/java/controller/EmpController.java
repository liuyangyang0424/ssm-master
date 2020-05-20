package com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("emp")
public class EmpController {

    @RequestMapping("/test1.do")
    public @ResponseBody  String test1(){
        return "hello test1";
    }
}
