package com.cloud.design.creational.prototype.impl;


import com.cloud.design.creational.prototype.Shape;

/**
 * @Author: luhk
 * @Email lhk2014@163.com
 * @Date: 2019/1/4 10:06 AM
 * @Description:
 * @Created with cloud-design-pattern
 * @Version: 1.0
 */
public class Circle extends Shape {
    public Circle(){
        type = "circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
