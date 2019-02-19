package com.cloud.design.behavioral.command;

import com.cloud.design.behavioral.command.impl.BuyStock;
import com.cloud.design.behavioral.command.impl.SellStock;

/**
 * @Author: luhk
 * @Email lhk2014@163.com
 * @Date: 2019/1/10 4:43 PM
 * @Description:
 * @Created with cloud-design-pattern
 * @Version: 1.0
 */
public class CommandPatternDemo {
    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
