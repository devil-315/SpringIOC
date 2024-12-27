package com.devil.引出.service.impl;

import com.devil.引出.dao.UserDao;
import com.devil.引出.dao.impl.UserDaoImpl;
import com.devil.引出.service.UserService;

/**
 * ClassName：UserServiceImpl
 *
 * @author: Devil
 * @Date: 2024/9/8
 * @Description:
 * @version: 1.0
 */
public class UserServiceImpl implements UserService {
    //创建dao层对象，才能调用dao中的方法
    private UserDao userDao = new UserDaoImpl();
    @Override
    public void getUser() {
        userDao.getUser();
    }
}
