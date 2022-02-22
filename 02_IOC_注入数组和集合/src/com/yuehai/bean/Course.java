package com.yuehai.bean;

/**
 * @author 月海
 * @create 2022/1/17 22:18
 */

// 课程类
public class Course {
    // 课程名
    private String cname;

    // 创建属性对应的 set 方法
    public void setCname(String cname) { this.cname = cname; }

    // 控制台打印所需的方法
    @Override
    public String toString() {
        return "Course{" +
                "cname='" + cname + '\'' +
                '}';
    }
}
