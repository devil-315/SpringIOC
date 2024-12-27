package com.devil.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * ClassName：User
 *
 * @author: Devil
 * @Date: 2024/9/8
 * @Description:
 * @version: 1.0
 */
//TODO 相当于 <bean id="user" class="com.devil.entity.User"/>
@Component
public class User {
    //TODO 相当于 <property name="name" value="devil"/>
    @Value("devil")
    private String name;

    public User() {
        System.out.println("无参构造器");
    }

    public User(String name) {
        System.out.println("有参构造器");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
