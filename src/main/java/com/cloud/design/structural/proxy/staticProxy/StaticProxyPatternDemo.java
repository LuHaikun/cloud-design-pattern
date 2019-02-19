package com.cloud.design.structural.proxy.staticProxy;

import com.cloud.design.structural.proxy.staticProxy.impl.Singer;
import com.cloud.design.structural.proxy.staticProxy.intf.ISinger;

/**
 * @Author: luhk
 * @Email lhk2014@163.com
 * @Date: 2019/1/7 4:16 PM
 * @Description:
 * @Created with cloud-design-pattern
 * @Version: 1.0
 */
public class StaticProxyPatternDemo {
    public static void main(String[] args) {
        ISinger target = new Singer();
        SingerProxy singer = new SingerProxy(target);
        singer.sing();
    }
}
