package com.cloud.design.creational.abstractFactory.impl.color;

import com.cloud.design.creational.abstractFactory.intf.Color;

/**
 * @Author: luhk
 * @Email lhk2014@163.com
 * @Date: 2019/1/4 10:34 AM
 * @Description:
 * @Created with cloud-design-pattern
 * @Version: 1.0
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
