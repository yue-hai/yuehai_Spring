package com.yuehai.autowire;

/**
 * @author 月海
 * @create 2022/1/18 19:42
 */

// 部门类
public class Dept {
    // 部门名称
    private String name;

    // 创建属性对应的 set 方法
    public void setName(String name) { this.name = name; }

    // 控制台打印所需的方法
    @Override
    public String toString() {
        return "Dept{" +
                "name='" + name + '\'' +
                '}';
    }
}
