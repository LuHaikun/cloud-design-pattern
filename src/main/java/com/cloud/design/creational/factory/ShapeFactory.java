package com.cloud.design.creational.factory;

import com.cloud.design.creational.factory.impl.Circle;
import com.cloud.design.creational.factory.impl.Square;
import com.cloud.design.creational.factory.impl.Triangle;
import com.cloud.design.creational.factory.intf.Shape;

/**
 * @Author: luhk
 * @Email lhk2014@163.com
 * @Date: 2019/1/4 10:08 AM
 * @Description: 让其子类实现工厂接口，返回的也是一个抽象的产品。
 * @Created with cloud-design-pattern
 * @Version: 1.0
 */
public class ShapeFactory {
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
