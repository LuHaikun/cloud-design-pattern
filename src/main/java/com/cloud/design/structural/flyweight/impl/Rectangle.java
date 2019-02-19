package com.cloud.design.structural.flyweight.impl;

import com.cloud.design.structural.flyweight.intf.Shape;

/**
 * @Author: luhk
 * @Email lhk2014@163.com
 * @Date: 2019/1/7 2:44 PM
 * @Description: 实现接口的实体类
 * @Created with cloud-design-pattern
 * @Version: 1.0
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
