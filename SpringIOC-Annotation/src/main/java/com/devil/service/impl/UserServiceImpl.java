package com.devil.service.impl;

import com.devil.dao.UserDao;
import com.devil.dao.impl.UserDaoImpl;
import com.devil.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName：UserServiceImpl
 *
 * @author: Devil
 * @Date: 2024/9/8
 * @Description:
 * @version: 1.0
 */
@Service("userService") //重命名
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao = new UserDaoImpl();
    @Override
    public void show() {
            userDao.show();
    }
}
