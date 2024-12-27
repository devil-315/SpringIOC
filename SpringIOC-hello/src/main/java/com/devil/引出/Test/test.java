package com.devil.引出.Test;

import com.devil.bean.User;
import com.devil.引出.service.UserService;
import com.devil.引出.service.impl.UserServiceImpl;

/**
 * ClassName：test
 *
 * @author: Devil
 * @Date: 2024/9/8
 * @Description:
 * @version: 1.0
 */
public class test {
    public static void main(String[] args) {
        //创建service对象，才能调用service的方法
        UserService userService = new UserServiceImpl();

    }
}
