package com.zjy.web.controller;

import com.zjy.dao.MyTest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class IndexController {

    @Value("${key1}")
    private String key;
    @GetMapping("/")
    @ResponseBody
    public String index() {
        return String.format("%s_%s_%s", MyTest.Test, key, new Date());
    }
}
