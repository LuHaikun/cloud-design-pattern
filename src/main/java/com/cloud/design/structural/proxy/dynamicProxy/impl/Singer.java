package com.cloud.design.structural.proxy.dynamicProxy.impl;

import com.cloud.design.structural.proxy.dynamicProxy.intf.ISinger;

/**
 * @Author: luhk
 * @Email lhk2014@163.com
 * @Date: 2019/1/7 4:14 PM
 * @Description:
 * @Created with cloud-design-pattern
 * @Version: 1.0
 */
public class Singer implements ISinger {
    @Override
    public void sing() {
        System.out.println("K歌之王");
    }
}
