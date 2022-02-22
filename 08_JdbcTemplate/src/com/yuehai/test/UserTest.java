package com.yuehai.test;

import com.yuehai.entity.User;
import com.yuehai.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 月海
 * @create 2022/1/19 21:36
 */
public class UserTest {
    // 添加
    @Test
    public void test(){
        // 1、加载 spring 配置文件
        // 因为是类路径（ClassPath），所以路径起始是src目录下
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        // 2、获取配置创建的对象
        // 调用getBean()方法，参数1：bean1.xml中配置的id，参数2：对应类的Class
        UserServiceImpl userServiceImpl = context.getBean("userServiceImpl", UserServiceImpl.class);

        // 3、测试
        User user = new User(null,"月海","很可爱");
        int addUser = userServiceImpl.addUser(user);
        System.out.println(addUser);
    }

    // 修改
    @Test
    public void test2(){
        // 1、加载 spring 配置文件
        // 因为是类路径（ClassPath），所以路径起始是src目录下
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        // 2、获取配置创建的对象
        // 调用getBean()方法，参数1：bean1.xml中配置的id，参数2：对应类的Class
        UserServiceImpl userServiceImpl = context.getBean("userServiceImpl", UserServiceImpl.class);

        // 3、测试
        User user = new User(new BigDecimal(1),"月海","很可爱");
        userServiceImpl.update(user);
    }

    // 删除
    @Test
    public void test3(){
        // 1、加载 spring 配置文件
        // 因为是类路径（ClassPath），所以路径起始是src目录下
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        // 2、获取配置创建的对象
        // 调用getBean()方法，参数1：bean1.xml中配置的id，参数2：对应类的Class
        UserServiceImpl userServiceImpl = context.getBean("userServiceImpl", UserServiceImpl.class);

        // 3、测试
        userServiceImpl.delete(new BigDecimal(1));
    }

    // 查询表里面有多少条记录，返回是某个值
    @Test
    public void test4(){
        // 1、加载 spring 配置文件
        // 因为是类路径（ClassPath），所以路径起始是src目录下
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        // 2、获取配置创建的对象
        // 调用getBean()方法，参数1：bean1.xml中配置的id，参数2：对应类的Class
        UserServiceImpl userServiceImpl = context.getBean("userServiceImpl", UserServiceImpl.class);

        // 3、测试
        int count = userServiceImpl.selectCount();
        System.out.println("数据库中共有【" + count + "】条数据");
    }

    // 查询对象
    @Test
    public void test5(){
        // 1、加载 spring 配置文件
        // 因为是类路径（ClassPath），所以路径起始是src目录下
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        // 2、获取配置创建的对象
        // 调用getBean()方法，参数1：bean1.xml中配置的id，参数2：对应类的Class
        UserServiceImpl userServiceImpl = context.getBean("userServiceImpl", UserServiceImpl.class);

        // 3、测试
        User user = userServiceImpl.findUserInfo(new BigDecimal(2));
        System.out.println(user);
    }

    // 查询返回集合
    @Test
    public void test6(){
        // 1、加载 spring 配置文件
        // 因为是类路径（ClassPath），所以路径起始是src目录下
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        // 2、获取配置创建的对象
        // 调用getBean()方法，参数1：bean1.xml中配置的id，参数2：对应类的Class
        UserServiceImpl userServiceImpl = context.getBean("userServiceImpl", UserServiceImpl.class);

        // 3、测试
        List<User> list = userServiceImpl.findAllUser();
        System.out.println(list);
    }

    // 批量操作：添加
    @Test
    public void test7(){
        // 1、加载 spring 配置文件
        // 因为是类路径（ClassPath），所以路径起始是src目录下
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        // 2、获取配置创建的对象
        // 调用getBean()方法，参数1：bean1.xml中配置的id，参数2：对应类的Class
        UserServiceImpl userServiceImpl = context.getBean("userServiceImpl", UserServiceImpl.class);

        // 3、测试
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {null,"java","a"};
        Object[] o2 = {null,"c++","b"};
        Object[] o3 = {null,"php","c"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);

        userServiceImpl.batchAddUser(batchArgs);
    }

    // 批量操作：修改
    @Test
    public void test8(){
        // 1、加载 spring 配置文件
        // 因为是类路径（ClassPath），所以路径起始是src目录下
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        // 2、获取配置创建的对象
        // 调用getBean()方法，参数1：bean1.xml中配置的id，参数2：对应类的Class
        UserServiceImpl userServiceImpl = context.getBean("userServiceImpl", UserServiceImpl.class);

        // 3、测试
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {"月海1","a",7};
        Object[] o2 = {"月海2","b",8};
        Object[] o3 = {"月海3","c",9};
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);

        userServiceImpl.batchUpdateUser(batchArgs);
    }

    // 批量操作：删除
    @Test
    public void test9(){
        // 1、加载 spring 配置文件
        // 因为是类路径（ClassPath），所以路径起始是src目录下
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        // 2、获取配置创建的对象
        // 调用getBean()方法，参数1：bean1.xml中配置的id，参数2：对应类的Class
        UserServiceImpl userServiceImpl = context.getBean("userServiceImpl", UserServiceImpl.class);

        // 3、测试
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {7};
        Object[] o2 = {8};
        Object[] o3 = {9};
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);

        userServiceImpl.batchDeleteUser(batchArgs);
    }
}
