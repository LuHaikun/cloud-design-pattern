package com.cloud.design.creational.builder.intf;

/**
 * @Author: luhk
 * @Email lhk2014@163.com
 * @Date: 2019/1/4 11:34 AM
 * @Description: 一个表示食物条目和食物包装的接口 一些基本部件不会变，而其组合经常变化的时候。
 * @Created with cloud-design-pattern
 * @Version: 1.0
 */
public interface Item {
    public String name();
    public Packing packing();
    public float price();
}
