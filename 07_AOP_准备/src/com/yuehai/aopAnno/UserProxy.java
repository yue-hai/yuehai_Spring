package com.yuehai.aopAnno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author 月海
 * @create 2022/1/19 18:23
 */

// 增强的类
// 使用注解创建类的对象
@Component
// 生成代理对象
@Aspect
// 设置增强类优先级，值越小优先级越高
@Order(value = 1)
public class UserProxy {
    // 相同切入点的抽取，方法名称随意
    @Pointcut(value = "execution(* com.yuehai.aopAnno.User.add(..))")
    public void pointdemo() {
    }

    // 1、前置通知：@Before
    @Before(value = "pointdemo()")
    public void before(){
        System.out.println("1、前置通知，before...");
    }

    // 2、后置通知（返回通知），在方法之后执行
    @AfterReturning(value = "pointdemo()")
    public void afterReturning(){
        System.out.println("3、后置通知，afterReturning...");
    }

    // 3、最终通知，在返回值之后执行
    @After(value = "pointdemo()")
    public void after(){
        System.out.println("3、最终通知，after...");
    }

    // 4、异常通知，有异常才会执行
    @AfterThrowing(value = "pointdemo()")
    public void afterThrowing(){
        System.out.println("4、异常通知，afterThrowing...");
    }

    // 5、环绕通知
    @Around(value = "pointdemo()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("5、环绕通知，环绕之前，around...");

        // 被增强的方法
        proceedingJoinPoint.proceed();

        System.out.println("5、环绕通知，环绕之后，around...");
    }

}
