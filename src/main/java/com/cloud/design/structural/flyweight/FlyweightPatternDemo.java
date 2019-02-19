package com.cloud.design.structural.flyweight;

import com.cloud.design.structural.flyweight.impl.Circle;

/**
 * @Author: luhk
 * @Email lhk2014@163.com
 * @Date: 2019/1/7 3:37 PM
 * @Description: 使用该工厂，通过传递颜色信息来获取实体类的对象 创建了20个不同效果的圆，但相同颜色的圆只需要创建一次便可，
 * 相同颜色的只需要引用原有对象，改变其坐标值便可。此种模式下，同一颜色的圆虽然位置不同，但其地址都是同一个，所以说此模式适
 * 用于结果注重单一结果的情况。
 * 一个游戏中有不同的英雄角色，同一类型的角色也有不同属性的英雄，如刺客类型的英雄有很多个，按此种模式设计，利用英雄所属类型去
 * 引用原有同一类型的英雄实例，然后对其相应属性进行修改，便可得到最终想得到的最新英雄；比如说你创建了第一个刺客型英雄，然后需
 * 要设计第二个刺客型英雄，你利用第一个英雄改变属性得到第二个刺客英雄，最新的刺客英雄是诞生了，但第一个刺客英雄的属性也随之变
 * 得与第二个相同，这种情况显然是不可以的
 * @Created with cloud-design-pattern
 * @Version: 1.0
 */
public class FlyweightPatternDemo {

    private static final String colors[] =
            { "Red", "Green", "Blue", "White", "Black" };
    public static void main(String[] args) {

        for(int i=0; i < 20; ++i) {
            Circle circle = (Circle)ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }
    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }
    private static int getRandomX() {
        return (int)(Math.random()*100 );
    }
    private static int getRandomY() {
        return (int)(Math.random()*100);
    }
}
