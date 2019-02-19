package com.cloud.design.structural.bridge;

import com.cloud.design.structural.bridge.impl.Circle;
import com.cloud.design.structural.bridge.impl.GreenCircle;
import com.cloud.design.structural.bridge.impl.RedCircle;

/**
 * @Author: luhk
 * @Email lhk2014@163.com
 * @Date: 2019/1/7 10:54 AM
 * @Description:
 * @Created with cloud-design-pattern
 * @Version: 1.0
 */
public class BridgePatternTest {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
