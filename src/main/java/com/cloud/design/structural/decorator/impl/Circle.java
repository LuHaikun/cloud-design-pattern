package com.cloud.design.structural.decorator.impl;

import com.cloud.design.structural.decorator.intf.Shape;

/**
 * @Author: luhk
 * @Email lhk2014@163.com
 * @Date: 2019/1/7 2:45 PM
 * @Description: 实现接口的实体类
 * @Created with cloud-design-pattern
 * @Version: 1.0
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
