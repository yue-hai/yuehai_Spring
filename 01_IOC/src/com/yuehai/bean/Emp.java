package com.yuehai.bean;

/**
 * @author 月海
 * @create 2022/1/17 20:52
 */

// 员工类
public class Emp {
    // 员工姓名
    private String ename;
    // 员工性别
    private String egender;
    // 表示员工属于某一个部门，使用对象形式表示
    private Dept dept;

    // 级联赋值需要对应的 get 方法
    // 生成 Dept 类对应的 dept 对象的 get 方法
    public Dept getDept() { return dept; }

    // 生成 set 方法
    public void setEname(String ename) { this.ename = ename; }
    public void setEgender(String egender) { this.egender = egender; }
    public void setDept(Dept dept) { this.dept = dept; }

    // 控制台打印所需的方法
    @Override
    public String toString() {
        return "Emp{" +
                "ename='" + ename + '\'' +
                ", egender='" + egender + '\'' +
                ", dept=" + dept +
                '}';
    }
}
