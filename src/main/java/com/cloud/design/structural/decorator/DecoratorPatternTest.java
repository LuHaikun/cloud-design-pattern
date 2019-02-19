package com.cloud.design.structural.decorator;

import com.cloud.design.structural.decorator.impl.Circle;
import com.cloud.design.structural.decorator.impl.Rectangle;
import com.cloud.design.structural.decorator.impl.RedShapeDecorator;
import com.cloud.design.structural.decorator.intf.Shape;

/**
 * @Author: luhk
 * @Email lhk2014@163.com
 * @Date: 2019/1/7 2:51 PM
 * @Description:
 * @Created with cloud-design-pattern
 * @Version: 1.0
 */
public class DecoratorPatternTest {
    public static void main(String[] args) {
        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
