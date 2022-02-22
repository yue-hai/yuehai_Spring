package com.yuehai.test;

import com.yuehai.aopAnno.User;
import com.yuehai.config.ConfigAop;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 月海
 * @create 2022/1/19 18:46
 */
public class TestAop {

    @Test
    public void test(){
        // 1、加载 spring 配置文件
        // 因为是类路径（ClassPath），所以路径起始是src目录下
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        // 2、获取配置创建的对象
        // 注解中的 value 值，不写的话默认是是类的首字母小写
        User user = context.getBean("user", User.class);

        // 3、输出测试
        user.add();
    }

    @Test
    public void test2(){
        // 1、加载配置类，参数为配置类的class对象
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigAop.class);

        // 2、获取配置创建的对象
        // 注解中的 value 值，不写的话默认是是类的首字母小写
        User user = context.getBean("user", User.class);

        // 3、输出测试
        user.add();
    }
}
