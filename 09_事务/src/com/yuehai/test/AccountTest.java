package com.yuehai.test;

import com.yuehai.service.impl.AccountServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.PlatformTransactionManager;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 月海
 * @create 2022/1/19 21:36
 */
public class AccountTest {
    // 转账
    @Test
    public void test(){
        // 1、加载 spring 配置文件
        // 因为是类路径（ClassPath），所以路径起始是src目录下
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");

        // 2、获取配置创建的对象
        // 调用getBean()方法，参数1：bean1.xml中配置的id，参数2：对应类的Class
        AccountServiceImpl accountServiceImpl = context.getBean("accountServiceImpl", AccountServiceImpl.class);

        // 3、测试，小A转账给小B
        accountServiceImpl.accountMoney(100,"小A","小B");
    }

}
