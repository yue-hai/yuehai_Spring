package com.yuehai.serlice.impl;

import com.yuehai.dao.UserDao;
import com.yuehai.dao.impl.UserDaoImpl;
import com.yuehai.serlice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

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
    // 名称进行注入，若是 UserDao 有多个实现类，@Autowired 就不知道该注入哪个类，就只能使用 @Qualifier 注解用名称进行注入
    // @Qualifier 注解上面要有 @Autowired 注解，不然会报错
    // @Qualifier(value = "userDaoImpl")

    // 只写 @Resource：是根据名称注入，找不到默认名称再按类型注入
    // @Resource
    // @Resource(name = "userDaoImpl")：根据类型注入
    @Resource(name = "userDaoImpl")
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
