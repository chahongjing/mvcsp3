package com.zjy.web.controller;

import com.zjy.dao.MyTest;
import com.zjy.dao.UserInfo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
public class IndexController {

    @Value("${key1}")
    private String key;

    @GetMapping("/")
    @ResponseBody
    public String index() {
        return String.format("%s_%s_%s", MyTest.Test, key, new Date());
    }

    @GetMapping("/users")
    @ResponseBody
    public List<UserInfo> getUsers() {
        return IntStream.rangeClosed(1, 10)
                .mapToObj(i -> new UserInfo((long) i, "User" + i))
                .collect(Collectors.toList());
    }
}
