package com.cloud.design.behavioral.command;

import com.cloud.design.behavioral.command.intf.Order;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: luhk
 * @Email lhk2014@163.com
 * @Date: 2019/1/10 4:43 PM
 * @Description:
 * @Created with cloud-design-pattern
 * @Version: 1.0
 */
public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
