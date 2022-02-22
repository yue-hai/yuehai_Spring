package com.yuehai.dao;

/**
 * @author 月海
 * @create 2022/1/20 15:26
 */
public interface AccountDao {
    // 加钱
    void reduceMoney(int money, String name1);
    // 减钱
    void addMoney(int money, String name2);
}
