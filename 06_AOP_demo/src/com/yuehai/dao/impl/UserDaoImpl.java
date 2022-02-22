package com.yuehai.dao.impl;

import com.yuehai.dao.UserDao;

/**
 * @author 月海
 * @create 2022/1/19 16:14
 */
public class UserDaoImpl implements UserDao {
    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public String update(String id) {
        return id;
    }
}
