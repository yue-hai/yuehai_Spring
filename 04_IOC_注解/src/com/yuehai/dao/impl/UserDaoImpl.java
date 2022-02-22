package com.yuehai.dao.impl;

import com.yuehai.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @author 月海
 * @create 2022/1/18 22:05
 */

// 添加创建对象注解
@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("UserDaoImpl add...");
    }
}
