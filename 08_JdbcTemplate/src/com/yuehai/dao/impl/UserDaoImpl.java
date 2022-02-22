package com.yuehai.dao.impl;

import com.yuehai.dao.UserDao;
import com.yuehai.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author 月海
 * @create 2022/1/19 20:44
 */

// 创建对象注解
@Repository
public class UserDaoImpl implements UserDao {

    // 注入 jdbcTemplate，根据属性类型进行属性注入（自动装配）
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int add(User user) {
        // 1、创建 sql 语句
        String sql = "insert into t_user values(?,?,?)";

        // 2、调用 JdbcTemplate 对象里面 update 方法实现添加操作
        // 第一个参数：sql 语句；第二个参数：占位符，可变参数，设置 sql 语句值
        int update = jdbcTemplate.update(sql, user.getUserId(), user.getUsername(), user.getUstatus());

        // 3、返回值
        return update;
    }

    @Override
    public void update(User user) {
        String sql = "update t_user set username=?,ustatus=? where user_id=?";
        jdbcTemplate.update(sql, user.getUsername(), user.getUstatus(), user.getUserId());

    }

    @Override
    public void delete(BigDecimal id) {
        String sql = "delete from t_user where user_id=?";
        jdbcTemplate.update(sql, id);

    }

    @Override
    public int selectCount() {
        String sql = "select count(*) from t_user";
        int count = jdbcTemplate.queryForObject(sql,Integer.class);
        return count;
    }

    @Override
    public User findUserInfo(BigDecimal id) {
        // 记得写别名
        String sql = "select user_id userId,username userame,ustatus ustatus from t_user where user_id=?";
        User user = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class), id);
        return user;
    }

    @Override
    public List<User> findAllUser() {
        String sql = "select * from t_user";
        List<User> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<User>(User.class));
        return list;
    }

    @Override
    public void batchAddUser(List<Object[]> batchArgs) {
        String sql = "insert into t_user values(?,?,?)";
        jdbcTemplate.batchUpdate(sql,batchArgs);
    }

    @Override
    public void batchUpdateUser(List<Object[]> batchArgs) {
        String sql = "update t_user set username=?,ustatus=? where user_id=?";
        jdbcTemplate.batchUpdate(sql,batchArgs);
    }

    @Override
    public void batchDeleteUser(List<Object[]> batchArgs) {
        String sql = "delete from t_user where user_id=?";
        jdbcTemplate.batchUpdate(sql,batchArgs);

    }

}
