package com.cloud.design.creational.prototype;

import com.cloud.design.creational.prototype.impl.Circle;
import com.cloud.design.creational.prototype.impl.Square;
import com.cloud.design.creational.prototype.impl.Triangle;

import java.util.Hashtable;

/**
 * @Author: luhk
 * @Email lhk2014@163.com
 * @Date: 2019/1/4 2:41 PM
 * @Description:
 * @Created with cloud-design-pattern
 * @Version: 1.0
 */
public class ShapeCache {
    private static Hashtable<String,Shape> shapeMap = new Hashtable<String,Shape>();
    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    // 对每种形状都运行数据库查询，并创建该形状
    // shapeMap.put(shapeKey, shape);
    // 例如，我们要添加三种形状
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(),square);

        Triangle triangle = new Triangle();
        triangle.setId("3");
        shapeMap.put(triangle.getId(),triangle);
    }
}
