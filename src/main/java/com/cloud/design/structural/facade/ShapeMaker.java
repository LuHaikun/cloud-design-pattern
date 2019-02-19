package com.cloud.design.structural.facade;

import com.cloud.design.structural.facade.impl.Circle;
import com.cloud.design.structural.facade.impl.Rectangle;
import com.cloud.design.structural.facade.intf.Shape;

/**
 * @Author: luhk
 * @Email lhk2014@163.com
 * @Date: 2019/1/7 3:08 PM
 * @Description: 外观类 1、客户端不需要知道系统内部的复杂联系，整个系统只需提供一个"接待员"即可。 2、定义系统的入口
 * @Created with cloud-design-pattern
 * @Version: 1.0
 */
public class ShapeMaker {
    private Shape rectangle;
    private Shape circle;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
    }

    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
}
