package com.yuehai.bean;

/**
 * @author 月海
 * @create 2022/1/17 19:23
 */
public class Book {
    // 创建属性
    private String bname;
    private String bauthor;
    private String address;

    // 创建属性对应的 set 方法
    public void setBname(String bname) { this.bname = bname; }
    public void setBauthor(String bauthor) { this.bauthor = bauthor; }
    public void setAddress(String address) { this.address = address; }

    // 控制台打印所需的方法
    @Override
    public String toString() {
        return "Book{" +
                "bname='" + bname + '\'' +
                ", bauthor='" + bauthor + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
