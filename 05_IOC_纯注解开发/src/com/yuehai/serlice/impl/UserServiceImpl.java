package com.yuehai.serlice.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import com.yuehai.dao.UserDao;
import com.yuehai.serlice.UserService;


/**
 * @author 月海
 * @create 2022/1/18 22:06
 */

// 与这个相似：<bean id="userService" class="com.com.com.yuehai.serlice.UserService"/>
// 在注解里面 value 属性值可以省略不写
// 默认值是类名称，首字母小写：UserService --> userService
// @Service(value = "userService")

// 添加创建对象注解
@Service
public class UserServiceImpl implements UserService {
    // 定义 dao 类型的属性，不需要添加 set 方法，已经封装了
    // 添加注入属性注解，根据 userDao 的类型 UserDao 进行注入
    // @Autowired
    @Autowired
    private UserDao userDao;

    // 定义属性
    // @Value：注入普通类型属性（String、基本类型等）
    @Value(value = "1")
    private int id;
    @Value(value = "月海")
    private String name;

    @Override
    public void add() {
        System.out.println("UserServiceImpl add...");
        userDao.add();
        System.out.println("id = " + id + "，name = " + name);
    }
}
