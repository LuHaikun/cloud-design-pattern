package com.cloud.design.creational.builder.impl;

import com.cloud.design.creational.builder.abstractInft.ColdDrink;

/**
 * @Author: luhk
 * @Email lhk2014@163.com
 * @Date: 2019/1/4 1:45 PM
 * @Description:
 * @Created with cloud-design-pattern
 * @Version: 1.0
 */
public class Coke extends ColdDrink {
    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
