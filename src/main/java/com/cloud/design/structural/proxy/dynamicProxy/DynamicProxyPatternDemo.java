package com.cloud.design.structural.proxy.dynamicProxy;


import com.cloud.design.structural.proxy.dynamicProxy.impl.Singer;
import com.cloud.design.structural.proxy.dynamicProxy.intf.ISinger;

/**
 * @Author: luhk
 * @Email lhk2014@163.com
 * @Date: 2019/1/7 4:16 PM
 * @Description:
 * @Created with cloud-design-pattern
 * @Version: 1.0
 */
public class DynamicProxyPatternDemo {
    public static void main(String[] args) {
        ISinger target = new Singer();
        SingerProxy singer = new SingerProxy(target);
        ISinger proxy  = (ISinger) singer.getInstance();
        proxy.sing();
    }
}
