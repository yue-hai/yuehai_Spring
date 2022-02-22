package com.yuehai.dao.impl;

import com.yuehai.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author 月海
 * @create 2022/1/20 15:27
 */

// 创建对象注解
@Repository
public class AccountDaoImpl implements AccountDao {

    // 注入 jdbcTemplate，根据属性类型进行属性注入（自动装配）
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void reduceMoney(int money, String name1) {
        String sql = "update t_account set money=money-? where username=?";
        jdbcTemplate.update(sql,money,name1);
    }

    @Override
    public void addMoney(int money, String name2) {
        String sql = "update t_account set money=money+? where username=?";
        jdbcTemplate.update(sql,money,name2);
    }
}
