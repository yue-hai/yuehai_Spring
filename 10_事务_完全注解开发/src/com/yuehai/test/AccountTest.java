package com.yuehai.test;

import com.yuehai.config.AccountConfig;
import com.yuehai.service.impl.AccountServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

/**
 * @author 月海
 * @create 2022/1/19 21:36
 */

// 完全注解开发
public class AccountTest {
    // 转账
    @Test
    public void test(){
        // 1、加载配置类，参数为配置类的class对象
        ApplicationContext context = new AnnotationConfigApplicationContext(AccountConfig.class);

        // 2、获取配置创建的对象
        // 调用getBean()方法，参数1：bean1.xml中配置的id，参数2：对应类的Class
        AccountServiceImpl accountServiceImpl = context.getBean("accountServiceImpl", AccountServiceImpl.class);

        // 3、测试，小A转账给小B
        accountServiceImpl.accountMoney(100,"小A","小B");
    }

    // Lambda表达式
    @Test
    public void test2(){
        // 1、创建 GenericApplicationContext 对象
        GenericApplicationContext context = new GenericApplicationContext();

        // 2、调用 context 的方法对象注册
        context.refresh();
        context.registerBean("accountServiceImpl",AccountServiceImpl.class,() -> new AccountServiceImpl());

        // 3、获取在 spring 注册的对象
        AccountServiceImpl accountServiceImpl = (AccountServiceImpl) context.getBean("accountServiceImpl");

        System.out.println(accountServiceImpl);
    }
}
