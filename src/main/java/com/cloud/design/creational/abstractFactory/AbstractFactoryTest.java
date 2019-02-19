package com.cloud.design.creational.abstractFactory;

import com.cloud.design.creational.abstractFactory.intf.Color;
import com.cloud.design.creational.abstractFactory.intf.Shape;

/**
 * @Author: luhk
 * @Email lhk2014@163.com
 * @Date: 2019/1/4 10:42 AM
 * @Description:
 * @Created with cloud-design-pattern
 * @Version: 1.0
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        //获取形状工厂
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shapeFactory");

        //获取形状为 Circle 的对象
        Shape circle = shapeFactory.buildShape("circle");

        //调用 Circle 的 draw 方法
        circle.draw();

        //获取形状为 Rectangle 的对象
        Shape triangle = shapeFactory.buildShape("triangle");

        //调用 Rectangle 的 draw 方法
        triangle.draw();

        //获取形状为 Square 的对象
        Shape square = shapeFactory.buildShape("square");

        //调用 Square 的 draw 方法
        square.draw();

        //获取颜色工厂
        AbstractFactory colorFactory = FactoryProducer.getFactory("colorFactory");

        //获取颜色为 Red 的对象
        Color red = colorFactory.buildColor("red");

        //调用 Red 的 fill 方法
        red.fill();

        //获取颜色为 Green 的对象
        Color green = colorFactory.buildColor("green");

        //调用 Green 的 fill 方法
        green.fill();

        //获取颜色为 Blue 的对象
        Color blue = colorFactory.buildColor("blue");

        //调用 Blue 的 fill 方法
        blue.fill();
    }
}
