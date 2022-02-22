package com.yuehai.service.impl;

import com.yuehai.dao.AccountDao;
import com.yuehai.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 月海
 * @create 2022/1/20 15:27
 */

// 创建对象注解
@Service
public class AccountServiceImpl implements AccountService {

    // 根据属性类型进行属性注入（自动装配）
    @Autowired
    private AccountDao accountDao;

    // 添加事务注解
    // 1、传播行为参数为：REQUIRED（默认值）：如果有事务在运行，则将方法添加到这个事务中运行，否则就启动一个新的事务
    // 2、事务隔离级别：READ_COMMITTED（读已提交），Spring 默认的隔离级别为 REPEATABLE_READ（可重复读）
    // 3、超时时间：timeout = 300 表示超时时间为 300 秒
    // 4、是否只读：readOnly = true：表示只读；默认为 false，表示既可以读也可以写
//    @Transactional(propagation = Propagation.REQUIRED,
//            isolation = Isolation.READ_COMMITTED,
//            timeout = 300,
//            readOnly = true
//    )
    @Override()
    public void accountMoney(int money, String name1, String name2) {
        // 减钱
        accountDao.reduceMoney(money,name1);

        // 模拟异常
        int i = 10/0;

        // 加钱
        accountDao.addMoney(money,name2);
    }
}
