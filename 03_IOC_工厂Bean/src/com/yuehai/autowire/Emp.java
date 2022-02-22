package com.yuehai.autowire;

/**
 * @author 月海
 * @create 2022/1/18 19:41
 */

// 员工类
public class Emp {
    // 部门类的对象属性
    private Dept dept;

    // 创建属性对应的 set 方法
    public void setDept(Dept dept) { this.dept = dept; }

    // 控制台打印所需的方法
    @Override
    public String toString() {
        return "Emp{" +
                "dept=" + dept +
                '}';
    }
}
