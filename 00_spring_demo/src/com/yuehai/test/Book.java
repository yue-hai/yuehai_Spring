package com.yuehai.test;

/**
 * @author 月海
 * @create 2022/1/17 17:52
 */

// 使用有参数构造注入
public class Book {
    // 创建属性，可写多个
    private int id;
    private String name;

    // 创建有参数构造
    public Book(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // 控制台打印所需的方法
    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

// 测试类
class test2{
    // main方法
    public static void main(String[] args) {
        // 使用有参构造器创建对象，，同时注入属性
        Book book = new Book(14,"月海");

        System.out.println(book);
    }
}
