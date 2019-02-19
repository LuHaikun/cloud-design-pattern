package com.cloud.design.structural.bridge.impl;

import com.cloud.design.structural.bridge.Shape;
import com.cloud.design.structural.bridge.intf.DrawAPI;

/**
 * @Author: luhk
 * @Email lhk2014@163.com
 * @Date: 2019/1/7 10:52 AM
 * @Description: 具体的实现是RedCircle、GreenCircle，它们的抽象类为Shape，按一般逻辑来说，我们是直接继承Shape来
 * 创建不同的具体对象，但桥接模式中是通过“桥梁”DrawAPI建立抽象与具体实现之间的联系，调用DrawAPI中的方法来具体实现
 * @Created with cloud-design-pattern
 * @Version: 1.0
 */
public class Circle extends Shape {
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}
