package com.zjy.web.controller;

import com.zjy.dao.MyTest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class IndexController {
    @GetMapping("/")
    @ResponseBody
    public String index() {
        return String.format("%s_%s", MyTest.Test, new Date());
    }
}
