package com.cloud.design.structural.bridge.impl;

import com.cloud.design.structural.bridge.intf.DrawAPI;

/**
 * @Author: luhk
 * @Email lhk2014@163.com
 * @Date: 2019/1/7 10:49 AM
 * @Description: 创建实现了 DrawAPI 接口的实体桥接实现类
 * @Created with cloud-design-pattern
 * @Version: 1.0
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
