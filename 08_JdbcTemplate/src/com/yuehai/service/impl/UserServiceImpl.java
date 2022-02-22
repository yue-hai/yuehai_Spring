package com.yuehai.service.impl;

import com.yuehai.dao.UserDao;
import com.yuehai.entity.User;
import com.yuehai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author 月海
 * @create 2022/1/19 20:44
 */

// 创建对象注解
@Service
public class UserServiceImpl implements UserService {

    // 注入 dao，根据属性类型进行属性注入（自动装配）
    @Autowired
    private UserDao userDao;
    @Override
    public int addUser(User user) {
        int add = userDao.add(user);
        return add;
    }

    @Override
    public void update(User user) {
        userDao.update(user);
    }

    @Override
    public void delete(BigDecimal id) {
        userDao.delete(id);
    }

    @Override
    public int selectCount() {
        int count = userDao.selectCount();
        return count;
    }

    @Override
    public User findUserInfo(BigDecimal id) {
        User user = userDao.findUserInfo(id);
        return user;
    }

    @Override
    public List<User> findAllUser() {
        List<User> list = userDao.findAllUser();
        return list;
    }

    @Override
    public void batchAddUser(List<Object[]> batchArgs) {
        userDao.batchAddUser(batchArgs);
    }

    @Override
    public void batchUpdateUser(List<Object[]> batchArgs) {
        userDao.batchUpdateUser(batchArgs);
    }

    @Override
    public void batchDeleteUser(List<Object[]> batchArgs) {
        userDao.batchDeleteUser(batchArgs);
    }

}
