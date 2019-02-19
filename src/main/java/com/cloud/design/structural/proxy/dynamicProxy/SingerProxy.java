package com.cloud.design.structural.proxy.dynamicProxy;

import com.cloud.design.structural.proxy.dynamicProxy.intf.ISinger;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: luhk
 * @Email lhk2014@163.com
 * @Date: 2019/1/7 4:15 PM
 * @Description:
 * @Created with cloud-design-pattern
 * @Version: 1.0
 */
public class SingerProxy implements InvocationHandler {
    private ISinger target;

    public SingerProxy(ISinger target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("向观众问好");
        //执行目标对象方法
        Object returnValue = method.invoke(target, args);
        System.out.println("向观众致谢");
        return returnValue;
    }

    public Object getInstance () {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }
}
