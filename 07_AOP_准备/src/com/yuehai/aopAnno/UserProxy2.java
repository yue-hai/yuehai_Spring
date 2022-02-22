package com.yuehai.aopAnno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author 月海
 * @create 2022/1/19 19:24
 */

// 增强的类
// 使用注解创建类的对象
@Component
// 生成代理对象
@Aspect
// 设置增强类优先级，值越小优先级越高
@Order(value = 2)
public class UserProxy2 {
    // 相同切入点的抽取，方法名称随意
    @Pointcut(value = "execution(* com.yuehai.aopAnno.User.add(..))")
    public void pointdemo() {
    }

    // 1、前置通知：@Before
    @Before(value = "pointdemo()")
    public void before(){
        System.out.println("1、前置通知2，UserProxy2...before...");
    }
}
