package com.yuehai.test;

import com.yuehai.autowire.Emp;
import com.yuehai.bean.Course;
import com.yuehai.bean.Order;
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
        // 有了 MyBean 类中的配置，就可以用 xml 中的 myBean 获取 Course 的对象
        Course course1 = context.getBean("myBean", Course.class);
        Course course2 = context.getBean("myBean", Course.class);

        // 3、输出测试
        System.out.println(course1.hashCode());
        System.out.println(course2.hashCode());
    }

    // 此方法仅是测试演示，以后正常编写不会这么写
    @Test
    public void test2(){
        // 1、加载 spring 配置文件
        // 因为是类路径（ClassPath），所以路径起始是src目录下
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");

        // 2、获取配置创建的对象
        // 有了 MyBean 类中的配置，就可以用 xml 中的 myBean 获取 Course 的对象
        Order order = context.getBean("order", Order.class);

        // 3、输出测试
        System.out.println("bean 生命周期4：获取创建 bean 实例对象");
        System.out.println(order);

        // 手动让 bean 实例销毁
        // ((ClassPathXmlApplicationContext) context)：
        // 将 context 由 ApplicationContext类型强转为 ClassPathXmlApplicationContext 类型
        ((ClassPathXmlApplicationContext) context).close();
    }

    // 此方法仅是测试演示，以后正常编写不会这么写
    @Test
    public void test3(){
        // 1、加载 spring 配置文件
        // 因为是类路径（ClassPath），所以路径起始是src目录下
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");

        // 2、获取配置创建的对象
        // 有了 MyBean 类中的配置，就可以用 xml 中的 myBean 获取 Course 的对象
        Emp emp = context.getBean("emp", Emp.class);

        // 3、输出测试
        System.out.println(emp);

    }

}
