package com.yuehai.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author 月海
 * @create 2022/1/18 22:46
 */

// 作为配置类，替代 xml 配置文件
@Configuration
// basePackages：为要扫描的包，与下面的 xml 配置中的配置相同
// <context:component-scan base-package="com.com.yuehai"></context:component-scan>
@ComponentScan(basePackages = "com.yuehai")
public class SpringConfig { }