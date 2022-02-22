package com.yuehai.factoryBean;

import com.yuehai.bean.Course;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author 月海
 * @create 2022/1/18 15:38
 */
public class MyBean implements FactoryBean<Course> {
    // 定义返回 bean 的实例
    @Override
    public Course getObject() throws Exception {
        // 在实现了工厂接口的 MyBean 类中的 getObject() 里
        // 创建 Course 类的实例，获取他的对象
        Course course = new Course();
        // 向 course 都西昂中添加数据
        course.setCname("aaa");
        // 返回 course 对象
        return course;
    }

    // 返回 bean 的类型
    @Override
    public Class<?> getObjectType() {
        return null;
    }

    //
    @Override
    public boolean isSingleton() {
        return false;
    }
}
