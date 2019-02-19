package com.cloud.design.structural.flyweight;

import com.cloud.design.structural.flyweight.impl.Circle;
import com.cloud.design.structural.flyweight.intf.Shape;

import java.util.HashMap;

/**
 * @Author: luhk
 * @Email lhk2014@163.com
 * @Date: 2019/1/7 3:33 PM
 * @Description: 创建一个工厂，生成基于给定信息的实体类的对象
 * @Created with cloud-design-pattern
 * @Version: 1.0
 */
public class ShapeFactory {
    public static final HashMap<String, Shape> circleMap = new HashMap();

    public static Shape getCircle(String color) {
        Circle circle = (Circle)circleMap.get(color);

        if(circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
