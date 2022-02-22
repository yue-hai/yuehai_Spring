package com.yuehai.test;

import com.yuehai.entity.User;
import com.yuehai.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @author 月海
 * @create 2022/1/20 22:24
 */

// 单元测试框架
// @ExtendWith(SpringExtension.class)
// 加载配置文件
// @ContextConfiguration("classpath:bean.xml")
// 使用一个复合注解替代上面两个注解完成整合
@SpringJUnitConfig(locations = "classpath:bean.xml")
public class JUnit5Test {
    // 根据属性类型进行属性注入（自动装配）
    @Autowired
    private UserServiceImpl userServiceImpl;

    // 测试添加
    @Test
    public void test(){
        User user = new User(null,"月海","超级无敌大可爱");
        int addUser = userServiceImpl.addUser(user);
        System.out.println(addUser);
    }
}
