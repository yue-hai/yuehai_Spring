package com.yuehai.test;


/**
 * @author 月海
 * @create 2022/1/17 17:41
 */

// 使用 set 方法进行注入属性
public class Person {
    // 创建属性，可写多个
    private int id;
    private String name;

    // 创建属性对应的 set 方法
    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }

    // 控制台打印所需的方法
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

// 测试类
class test{
    // main方法
    public static void main(String[] args) {
        // 创建对象
        Person person = new Person();
        // 注入属性
        person.setId(14);
        person.setName("月海");

        System.out.println(person);
    }
}