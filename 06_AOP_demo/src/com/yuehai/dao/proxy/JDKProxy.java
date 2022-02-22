package com.yuehai.dao.proxy;

import com.yuehai.dao.UserDao;
import com.yuehai.dao.impl.UserDaoImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author 月海
 * @create 2022/1/19 16:16
 */

// 使用 Proxy 类创建接口代理对象
public class JDKProxy {
    public static void main(String[] args) {
        // 创建接口实现类的代理对象
        // 创建一个 Class 数组，数组元素为这个类实现的接口的class类
        Class[] interfaces = {UserDao.class};
        // 方式一：使用匿名内部类
//        Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new InvocationHandler() {
//            @Override
//            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                return null;
//            }
//        });
        // 方式二：单独创建一个类，其中写增强的方法，第三个参数 new 这个类
        // 创建要增强的类的对象，作为参数传递
        UserDaoImpl userDaoImpl = new UserDaoImpl();
        // 调用 newProxyInstance() 方法，传入参数，返回增强后的对象
        UserDao userDao = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDaoImpl));
        // 使用增强后的对象，调用方法
        userDao.add(1,2);
    }
}

// 创建代理对象的代码，实现 InvocationHandler 接口
class UserDaoProxy implements InvocationHandler{
    // 创建的是谁的代理对象，就把谁传递过来（UserDao的对象）
    // 使用有参数构造传递
    private Object obj;
    public UserDaoProxy(Object obj) {
        this.obj = obj;
    }

    /**
     * 增强的逻辑
     * @param proxy  代理对象
     * @param method  当前的方法
     * @param args  参数
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 方法之前执行
        System.out.println("方法之前执行，方法名：" + method.getName() + " ，传递的参数：" + Arrays.toString(args) + "--------");

        // 被增强的，方法执行（原方法）
        Object res = method.invoke(obj, args);

        // 方法之后执行
        System.out.println("方法之后执行--------");
        // 判断执行的方法是什么
        switch (method.getName()){
            // 若执行的方法是 add() 方法
            case "add" :
                System.out.println("执行的方法是 add() 方法，原结果是：" + res);
                break;
            // 若执行的方法是 update() 方法
            case "update" :
                System.out.println("执行的方法是 update() 方法，原结果是：" + res);
        }

        return res;
    }
}
