package com.cloud.design.behavioral.command.impl;

import com.cloud.design.behavioral.command.Stock;
import com.cloud.design.behavioral.command.intf.Order;

/**
 * @Author: luhk
 * @Email lhk2014@163.com
 * @Date: 2019/1/10 4:41 PM
 * @Description: Order 接口的实体类。
 * @Created with cloud-design-pattern
 * @Version: 1.0
 */
public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
}
