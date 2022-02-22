package com.yuehai.bean;

/**
 * @author 月海
 * @create 2022/1/17 20:50
 */

// 部门类
public class Dept {
    // 部门名称
    private String dname;

    // 生成 set 方法
    public void setDname(String dname) { this.dname = dname; }

    // 控制台打印所需的方法
    @Override
    public String toString() {
        return "Dept{" +
                "dname='" + dname + '\'' +
                '}';
    }
}
