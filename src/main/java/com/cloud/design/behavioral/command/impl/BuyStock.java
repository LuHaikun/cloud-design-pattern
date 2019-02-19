package com.cloud.design.behavioral.command.impl;

import com.cloud.design.behavioral.command.Stock;
import com.cloud.design.behavioral.command.intf.Order;

/**
 * @Author: luhk
 * @Email lhk2014@163.com
 * @Date: 2019/1/10 4:41 PM
 * @Description:
 * @Created with cloud-design-pattern
 * @Version: 1.0
 */
public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
