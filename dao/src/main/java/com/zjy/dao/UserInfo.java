package com.zjy.dao;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserInfo {
    private Long id;
    private String name;

    public UserInfo() {

    }

    public UserInfo(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
