package com.cloud.design.creational.builder.impl;

import com.cloud.design.creational.builder.abstractInft.Burger;

/**
 * @Author: luhk
 * @Email lhk2014@163.com
 * @Date: 2019/1/4 1:44 PM
 * @Description:
 * @Created with cloud-design-pattern
 * @Version: 1.0
 */
public class ChickenBurger extends Burger {
    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
