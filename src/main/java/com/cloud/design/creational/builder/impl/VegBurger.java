package com.cloud.design.creational.builder.impl;

import com.cloud.design.creational.builder.abstractInft.Burger;

/**
 * @Author: luhk
 * @Email lhk2014@163.com
 * @Date: 2019/1/4 11:44 AM
 * @Description:
 * @Created with cloud-design-pattern
 * @Version: 1.0
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
