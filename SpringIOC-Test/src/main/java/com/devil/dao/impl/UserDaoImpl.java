package com.devil.dao.impl;

import com.devil.dao.UserDao;
import com.devil.entity.SysUser;
import com.devil.util.JdbcUtilPtimize;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
    public void addUser(SysUser sysUser) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = JdbcUtilPtimize.getConnection();
            String sql = "insert into sys_user(username,user_pwd) values(?,?)";
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1,sysUser.getUsername());
            preparedStatement.setString(2,sysUser.getUserPwd());
            int row = preparedStatement.executeUpdate();
            if(row > 0){
                System.out.println("添加成功");
            }else {
                System.out.println("添加失败");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            JdbcUtilPtimize.release(connection,preparedStatement,null);
        }
    }
}
