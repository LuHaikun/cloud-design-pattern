package com.cloud.design.structural.decorator;

import com.cloud.design.structural.decorator.intf.Shape;

/**
 * @Author: luhk
 * @Email lhk2014@163.com
 * @Date: 2019/1/7 2:45 PM
 * @Description: 实现了 Shape 接口的抽象装饰类
 * @Created with cloud-design-pattern
 * @Version: 1.0
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw(){
        decoratedShape.draw();
    }
}
