package com.yuehai.service.impl;

import com.yuehai.dao.UserDao;
import com.yuehai.dao.impl.UserDaoImpl;
import com.yuehai.service.UserService;

/**
 * @author 月海
 * @create 2022/1/17 20:12
 */
public class UserServiceImpl implements UserService {

    //创建 UserDao 类型属性，并生成 set 方法
    private UserDao userDao;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void add() {
        System.out.println("service... add");

        // 基于spring的方式：
        userDao.update();
    }
}
