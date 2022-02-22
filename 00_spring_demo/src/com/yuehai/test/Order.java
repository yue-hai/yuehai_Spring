package com.yuehai.test;

/**
 * @author 月海
 * @create 2022/1/17 18:42
 */

// p 名称空间注入
public class Order {
    // 创建属性，可写多个
    private int id;
    private String name;

    // 创建属性对应的 set 方法
    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }

    // 控制台打印所需的方法
    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
