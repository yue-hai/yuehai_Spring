package com.yuehai.dao;

import com.yuehai.entity.User;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author 月海
 * @create 2022/1/19 20:43
 */
public interface UserDao {
    // 添加
    public int add(User user);
    // 修改
    void update(User user);
    // 删除
    void delete(BigDecimal id);
    // 查询表里面有多少条记录，返回是某个值
    int selectCount();
    // 查询返回对象
    User findUserInfo(BigDecimal id);
    // 查询返回集合
    List<User> findAllUser();
    // 批量操作：添加
    void batchAddUser(List<Object[]> batchArgs);
    // 批量操作：修改
    void batchUpdateUser(List<Object[]> batchArgs);
    // 批量操作：删除
    void batchDeleteUser(List<Object[]> batchArgs);
}
