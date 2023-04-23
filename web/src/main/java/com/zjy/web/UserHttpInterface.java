package com.zjy.web;

import com.zjy.dao.UserInfo;
import org.springframework.web.service.annotation.GetExchange;

import java.util.List;

public interface UserHttpInterface {
    @GetExchange("/users")
    List<UserInfo> getUsers();
}
