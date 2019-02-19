package com.cloud.design.creational.abstractFactory;

import com.cloud.design.creational.abstractFactory.intf.Color;
import com.cloud.design.creational.abstractFactory.intf.Shape;

/**
 * @Author: luhk
 * @Email lhk2014@163.com
 * @Date: 2019/1/4 10:37 AM
 * @Description: 系统的产品有多于一个的产品族，而系统只消费其中某一族的产品。主要解决接口选择的问题。
 * @Created with cloud-design-pattern
 * @Version: 1.0
 */
public abstract class AbstractFactory {
    public abstract Color buildColor(String color);
    public abstract Shape buildShape(String shape) ;
}
