package com.devil.引出.Test;

import com.devil.bean.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName：IOCtest
 *
 * @author: Devil
 * @Date: 2024/9/8
 * @Description:
 * @version: 1.0
 */
public class IOCtest {
    public static void main(String[] args) {
        //获取Spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-ioc.xml");
        //对象都在spring中管理了，要使用就直接取出来
        User user = (User) context.getBean("user2");
        System.out.println(user);
    }
}
