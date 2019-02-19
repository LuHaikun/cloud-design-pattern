package com.cloud.design.creational.builder.impl;

import com.cloud.design.creational.builder.intf.Packing;

/**
 * @Author: luhk
 * @Email lhk2014@163.com
 * @Date: 2019/1/4 11:36 AM
 * @Description:
 * @Created with cloud-design-pattern
 * @Version: 1.0
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
