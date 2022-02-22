package com.yuehai.aopAnno;

import org.springframework.stereotype.Component;

/**
 * @author 月海
 * @create 2022/1/19 18:20
 */

// 被增强类
// 使用注解创建类的对象
@Component
public class User {
    public void add(){
        System.out.println("add...");
    };
}
