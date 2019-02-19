package com.cloud.design.creational.builder;

import com.cloud.design.creational.builder.intf.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: luhk
 * @Email lhk2014@163.com
 * @Date: 2019/1/4 1:47 PM
 * @Description: 创建一个 Meal 类，带有上面定义的 Item 对象
 * @Created with cloud-design-pattern
 * @Version: 1.0
 */
public class Meal {
    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems(){
        for (Item item : items) {
            System.out.print("Item : "+item.name());
            System.out.print(", Packing : "+item.packing().pack());
            System.out.println(", Price : "+item.price());
        }
    }
}
