package com.yuehai.entity;

import java.math.BigDecimal;

/**
 * @author 月海
 * @create 2022/1/19 21:06
 */

// 对应数据库 t_user 表的 User 类
public class User {
    // 对应的属性
    private BigDecimal userId;
    private String username;
    private String ustatus;

    // 构造器
    public User() { }

    public User(BigDecimal userId, String username, String ustatus) {
        this.userId = userId;
        this.username = username;
        this.ustatus = ustatus;
    }

    // get set 方法
    public BigDecimal getUserId() { return userId; }
    public void setUserId(BigDecimal userId) { this.userId = userId; }
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getUstatus() { return ustatus; }
    public void setUstatus(String ustatus) { this.ustatus = ustatus; }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", ustatus='" + ustatus + '\'' +
                '}';
    }
}
