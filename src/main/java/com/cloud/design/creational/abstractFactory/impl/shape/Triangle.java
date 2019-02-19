package com.cloud.design.creational.abstractFactory.impl.shape;

import com.cloud.design.creational.abstractFactory.intf.Shape;

/**
 * @Author: luhk
 * @Email lhk2014@163.com
 * @Date: 2019/1/4 10:05 AM
 * @Description:
 * @Created with cloud-design-pattern
 * @Version: 1.0
 */
public class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Triangle::draw() method.");
    }
}
