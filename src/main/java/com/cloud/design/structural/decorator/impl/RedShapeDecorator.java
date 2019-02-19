package com.cloud.design.structural.decorator.impl;

import com.cloud.design.structural.decorator.intf.Shape;
import com.cloud.design.structural.decorator.ShapeDecorator;

/**
 * @Author: luhk
 * @Email lhk2014@163.com
 * @Date: 2019/1/7 2:47 PM
 * @Description: 创建扩展了 ShapeDecorator 类的实体装饰类
 * @Created with cloud-design-pattern
 * @Version: 1.0
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}
