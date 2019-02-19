package com.cloud.design.creational.abstractFactory;

import com.cloud.design.creational.abstractFactory.impl.shape.Circle;
import com.cloud.design.creational.abstractFactory.impl.shape.Square;
import com.cloud.design.creational.abstractFactory.impl.shape.Triangle;
import com.cloud.design.creational.abstractFactory.intf.Color;
import com.cloud.design.creational.abstractFactory.intf.Shape;

/**
 * @Author: luhk
 * @Email lhk2014@163.com
 * @Date: 2019/1/4 10:08 AM
 * @Description: 让其子类实现工厂接口，返回的也是一个抽象的产品。
 * @Created with cloud-design-pattern
 * @Version: 1.0
 */
public class ShapeFactory extends AbstractFactory{
    @Override
    public Color buildColor(String color) {
        return null;
    }

    @Override
    public Shape buildShape (String shapeType) {
        if (shapeType == null) {
            throw new RuntimeException("shapeType is null");
        }
        switch (shapeType) {
            case "triangle" :
                return new Triangle();
            case "square" :
                return new Square();
            case "circle" :
                return new Circle();
            default:
                return null;
        }
    }
}
