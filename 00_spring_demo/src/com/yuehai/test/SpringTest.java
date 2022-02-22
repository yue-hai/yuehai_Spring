package com.yuehai.test;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 月海
 * @create 2022/1/17 15:26
 */
public class SpringTest {

    // 此方法仅是测试演示，以后正常编写不会这么写
    @Test
    public void test1(){
        // 1、加载 spring 配置文件
        // 因为是类路径（ClassPath），所以路径起始是src目录下
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        // 2、获取配置创建的对象
        // 调用getBean()方法，参数1：bean1.xml中配置的id，参数2：对应类的Class
        User user = context.getBean("user", User.class);

        // 3、输出测试
        // com.com.com.yuehai.test.User@436e852b
        System.out.println(user);
        // add......
        user.add();
    }

    @Test
    public void test2(){
        // 1、加载 spring 配置文件
        // 因为是类路径（ClassPath），所以路径起始是src目录下
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        // 2、获取配置创建的对象
        // 调用getBean()方法，参数1：bean1.xml中配置的id，参数2：对应类的Class
        Person person = context.getBean("person", Person.class);

        // 3、输出测试
        System.out.println(person);
    }

    @Test
    public void test3(){
        // 1、加载 spring 配置文件
        // 因为是类路径（ClassPath），所以路径起始是src目录下
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        // 2、获取配置创建的对象
        // 调用getBean()方法，参数1：bean1.xml中配置的id，参数2：对应类的Class
        Book book = context.getBean("book", Book.class);

        // 3、输出测试
        System.out.println(book);
    }

    @Test
    public void test4(){
        // 1、加载 spring 配置文件
        // 因为是类路径（ClassPath），所以路径起始是src目录下
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        // 2、获取配置创建的对象
        // 调用getBean()方法，参数1：bean1.xml中配置的id，参数2：对应类的Class
        Order order = context.getBean("order", Order.class);

        // 3、输出测试
        System.out.println(order);
    }
}
