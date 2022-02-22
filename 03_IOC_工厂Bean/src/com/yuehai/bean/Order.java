package com.yuehai.bean;

import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author 月海
 * @create 2022/1/18 17:58
 */

// 订单类
public class Order {
    // 订单名称
    private String name;

    // bean 生命周期1：通过构造器创建 bean 实例（无参数构造）
    public Order() {
        System.out.println("bean 生命周期1：通过构造器创建 bean 实例（无参数构造）");
    }

    // bean 生命周期2：创建属性对应的 set 方法
    public void setName(String name) {
        this.name = name;
        System.out.println("bean 生命周期2：调用 set 方法设置属性的值");
    }

    // bean 生命周期3：创建执行的初始化方法（方法名字随便）
    // 该方法需自己创建，并在 xml 配置文件中配置
    public void initMethod() {
        System.out.println("bean 生命周期3：执行初始化的方法");
    }

    // bean 生命周期5：创建执行的销毁的方法（方法名字随便）
    // 该方法需自己创建，并在 xml 配置文件中配置
    public void destroyMethod() {
        System.out.println("bean 生命周期5：执行销毁的方法");
    }

    // 控制台打印所需的方法
    @Override
    public String toString() {
        return "Order{" +
                "name='" + name + '\'' +
                '}';
    }
}
