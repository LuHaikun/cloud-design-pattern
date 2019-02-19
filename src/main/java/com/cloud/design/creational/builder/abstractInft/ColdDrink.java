package com.cloud.design.creational.builder.abstractInft;

import com.cloud.design.creational.builder.impl.Bottle;
import com.cloud.design.creational.builder.intf.Item;
import com.cloud.design.creational.builder.intf.Packing;

/**
 * @Author: luhk
 * @Email lhk2014@163.com
 * @Date: 2019/1/4 11:41 AM
 * @Description: 创建实现 Item 接口的抽象类，该类提供了默认的功能
 * @Created with cloud-design-pattern
 * @Version: 1.0
 */
public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
