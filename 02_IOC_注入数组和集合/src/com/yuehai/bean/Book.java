package com.yuehai.bean;

import java.util.List;

/**
 * @author 月海
 * @create 2022/1/17 22:44
 */

// 书类
public class Book {
    // list集合类型的属性
    private List<String> list;

    // 创建属性对应的 set 方法
    public void setList(List<String> list) { this.list = list; }

    // 控制台打印所需的方法
//    @Override
//    public String toString() {
//        return "Book{" +
//                "list=" + list +
//                '}';
//    }
}
