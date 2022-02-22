package com.yuehai.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;

/**
 * @author 月海
 * @create 2022/1/18 19:22
 */
public class MyBeanPost implements BeanPostProcessor {
    // 在初始化之前执行
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("后置处理器1：在初始化之前执行的方法");
        return bean;
    }

    // 在初始化之后执行
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("后置处理器2：在初始化之后执行的方法");
        return bean;
    }
}
