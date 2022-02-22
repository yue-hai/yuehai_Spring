package com.yuehai.test;

import com.yuehai.config.SpringConfig;
import com.yuehai.serlice.UserService;
import com.yuehai.serlice.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 月海
 * @create 2022/1/17 19:32
 */
public class SpringTest {
    // 此方法仅是测试演示，以后正常编写不会这么写
    @Test
    public void test1(){
        // 1、加载配置类，参数为配置类的class对象
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        // 2、获取配置创建的对象
        // 注解中的 value 值，不写的话默认是是类的首字母小写
        UserService userService = context.getBean("userServiceImpl", UserServiceImpl.class);

        // 3、输出测试
        System.out.println(userService);
        userService.add();
    }

}
