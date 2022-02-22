package com.yuehai.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author 月海
 * @create 2022/1/19 19:33
 */

// 作为配置类，替代 xml 配置文件
@Configuration
// basePackages：为要扫描的包，与下面的 xml 配置中的配置相同
// <context:component-scan base-package="com.com.yuehai"></context:component-scan>
@ComponentScan(basePackages = "com.yuehai")
// 表示开启AOP代理自动配置，true是cglib代理，默认false是jdk代理
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ConfigAop {

}
