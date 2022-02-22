package com.yuehai.test;

import com.yuehai.bean.Book;
import com.yuehai.bean.Emp;
import com.yuehai.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 月海
 * @create 2022/1/17 19:32
 */
public class SpringTest {
    // 此方法仅是测试演示，以后正常编写不会这么写
    @Test
    public void test1(){
        // 1、加载 spring 配置文件
        // 因为是类路径（ClassPath），所以路径起始是src目录下
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        // 2、获取配置创建的对象
        // 调用getBean()方法，参数1：bean1.xml中配置的id，参数2：对应类的Class
        Book book = context.getBean("book", Book.class);

        // 3、输出测试
        System.out.println(book);
    }

    @Test
    public void test2(){
        // 1、加载 spring 配置文件
        // 因为是类路径（ClassPath），所以路径起始是src目录下
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");

        // 2、获取配置创建的对象
        // 调用getBean()方法，参数1：bean1.xml中配置的id，参数2：对应类的Class
        UserServiceImpl userServiceImpl = context.getBean("userServiceImpl", UserServiceImpl.class);

        // 3、输出测试
        userServiceImpl.add();
    }

    @Test
    public void test3(){
        // 1、加载 spring 配置文件
        // 因为是类路径（ClassPath），所以路径起始是src目录下
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");

        // 2、获取配置创建的对象
        // 调用getBean()方法，参数1：bean1.xml中配置的id，参数2：对应类的Class
        Emp emp = context.getBean("emp", Emp.class);

        // 3、输出测试
        System.out.println(emp);
    }

    @Test
    public void test4(){
        // 1、加载 spring 配置文件
        // 因为是类路径（ClassPath），所以路径起始是src目录下
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");

        // 2、获取配置创建的对象
        // 调用getBean()方法，参数1：bean1.xml中配置的id，参数2：对应类的Class
        Emp emp = context.getBean("emp", Emp.class);

        // 3、输出测试
        System.out.println(emp);
    }
}
