package com.cloud.design.creational.singleton.hungry;

/**
 * @Author: luhk
 * @Email lhk2014@163.com
 * @Date: 2019/1/4 11:19 AM
 * @Description: 饿汉式比较常用，但容易产生垃圾对象，没有加锁，执行效率会提高。
 * @Created with cloud-design-pattern
 * @Version: 1.0
 */
public class HungrySingleton {
    private static HungrySingleton singleton = new HungrySingleton();
    private HungrySingleton(){}
    public static HungrySingleton getInstance() {
        return singleton;
    }
}
