package com.cloud.design.creational.factory.impl;

import com.cloud.design.creational.factory.intf.Shape;

/**
 * @Author: luhk
 * @Email lhk2014@163.com
 * @Date: 2019/1/4 10:06 AM
 * @Description:
 * @Created with cloud-design-pattern
 * @Version: 1.0
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
