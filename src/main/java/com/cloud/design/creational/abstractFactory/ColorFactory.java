package com.cloud.design.creational.abstractFactory;

import com.cloud.design.creational.abstractFactory.impl.color.Blue;
import com.cloud.design.creational.abstractFactory.impl.color.Green;
import com.cloud.design.creational.abstractFactory.impl.color.Red;
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
public class ColorFactory extends AbstractFactory{
    @Override
    public Color buildColor(String color) {
        if (color == null) {
            throw new RuntimeException("shapeType is null");
        }
        switch (color) {
            case "red" :
                return new Red();
            case "green" :
                return new Green();
            case "blue" :
                return new Blue();
            default:
                return null;
        }
    }

    @Override
    public Shape buildShape (String shapeType) {
        return null;
    }
}
