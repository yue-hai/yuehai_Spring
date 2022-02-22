package com.yuehai.service;

/**
 * @author 月海
 * @create 2022/1/20 15:27
 */
public interface AccountService {
    /**
     * 转账的方法
     * @param money  转账的钱数
     * @param name1  转账的人的名字
     * @param name2  收款的人的名字
     */
    public void accountMoney(int money,String name1,String name2);
}
