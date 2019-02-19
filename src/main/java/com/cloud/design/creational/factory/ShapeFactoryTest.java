package com.cloud.design.creational.factory;

import com.cloud.design.creational.factory.intf.Shape;

/**
 * @Author: luhk
 * @Email lhk2014@163.com
 * @Date: 2019/1/4 10:26 AM
 * @Description:
 * @Created with cloud-design-pattern
 * @Version: 1.0
 */
public class ShapeFactoryTest {
    public static void main(String[] args) {
        //工厂模式调用
        ShapeFactory shapeFactory = new ShapeFactory();
        //获取 Circle 的对象，并调用它的 draw 方法
        Shape circle = shapeFactory.buildShape("circle");

        //circle Circle 的 draw 方法
        circle.draw();

        //获取 Rectangle 的对象，并调用它的 draw 方法
        Shape triangle = shapeFactory.buildShape("triangle");

        //调用 Rectangle 的 draw 方法
        triangle.draw();

        //获取 Square 的对象，并调用它的 draw 方法
        Shape square = shapeFactory.buildShape("square");

        //调用 Square 的 draw 方法
        square.draw();
    }
}
