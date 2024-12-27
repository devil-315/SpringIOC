package com.devil.bean;

import lombok.Data;

/**
 * ClassName：User
 *
 * @author: Devil
 * @Date: 2024/9/8
 * @Description:
 * @version: 1.0
 */
@Data
public class User {
    private String name;

    public User() {
        System.out.println("无参构造器");
    }

    public User(String name) {
        System.out.println("有参构造器");
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name+ '\'' +
                '}';
    }
}