package com.zjy.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class IndexController {
    @GetMapping("/")
    @ResponseBody
    public Date index() {
        return new Date();
    }
}
