package com.yuehai.service;

import com.yuehai.entity.User;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author 月海
 * @create 2022/1/19 20:43
 */
public interface UserService {
    // 添加的方法
    public int addUser(User user);
    // 修改
    public void update(User user);
    // 删除
    public void delete(BigDecimal id);
    // 查询表里面有多少条记录，返回是某个值
    public int selectCount();
    // 查询返回对象
    public User findUserInfo(BigDecimal id);
    // 查询返回集合
    public List<User> findAllUser();
    // 批量操作：添加
    public void batchAddUser(List<Object[]> batchArgs);
    // 批量操作：修改
    public void batchUpdateUser(List<Object[]> batchArgs);
    // 批量操作：删除
    public void batchDeleteUser(List<Object[]> batchArgs);
}
