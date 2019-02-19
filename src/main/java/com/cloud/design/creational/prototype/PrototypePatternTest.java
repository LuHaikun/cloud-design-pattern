package com.cloud.design.creational.prototype;

/**
 * @Author: luhk
 * @Email lhk2014@163.com
 * @Date: 2019/1/4 1:49 PM
 * @Description: 建造者模式（Builder Pattern）使用多个简单的对象一步一步构建成一个复杂的对象。这种类型的设计模式属于创建型模式
 * @Created with cloud-design-pattern
 * @Version: 1.0
 */
public class PrototypePatternTest {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
    }
}
