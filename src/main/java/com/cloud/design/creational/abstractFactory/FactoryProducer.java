package com.cloud.design.creational.abstractFactory;

/**
 * @Author: luhk
 * @Email lhk2014@163.com
 * @Date: 2019/1/4 10:41 AM
 * @Description: 创建一个工厂创造器/生成器类，通过传递形状或颜色信息来获取工厂。
 * @Created with cloud-design-pattern
 * @Version: 1.0
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("shapeFactory")){
            return new ShapeFactory();
        } else if(choice.equalsIgnoreCase("colorFactory")){
            return new ColorFactory();
        }
        return null;
    }
}
