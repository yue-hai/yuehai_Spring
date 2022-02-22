package com.yuehai.test;

import com.yuehai.entity.User;
import com.yuehai.service.impl.UserServiceImpl;
import org.junit.jupiter.api.DynamicTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author 月海
 * @create 2022/1/20 22:03
 */

// 单元测试框架
//@RunWith(SpringJUnit4ClassRunner.class)
//// 加载配置文件
//@ContextConfiguration("classpath:bean.xml")
public class JUnit4Test {
//    // 根据属性类型进行属性注入（自动装配）
//    @Autowired
//    private UserServiceImpl userServiceImpl;
//
//    // 测试添加
//    @Test
//    public void test(){
//        User user = new User(null,"月海","超级可爱");
//        int addUser = userServiceImpl.addUser(user);
//        System.out.println(addUser);
//    }
}
