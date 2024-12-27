package com.devil.dao.impl;

import com.devil.dao.UserDao;
import com.devil.service.UserService;
import org.springframework.stereotype.Repository;

/**
 * ClassName：UserDaoImpl
 *
 * @author: Devil
 * @Date: 2024/9/8
 * @Description:
 * @version: 1.0
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void show() {
        System.out.println("啦啦啦啦");
    }
}
