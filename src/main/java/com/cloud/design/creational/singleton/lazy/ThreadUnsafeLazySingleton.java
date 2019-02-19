package com.cloud.design.creational.singleton.lazy;

/**
 * @Author: luhk
 * @Email lhk2014@163.com
 * @Date: 2019/1/4 11:12 AM
 * @Description: 这种实现最大的问题就是不支持多线程。因为没有加锁 synchronized，所以严格意义上它并不算单例模式
 * @Created with cloud-design-pattern
 * @Version: 1.0
 */
public class ThreadUnsafeLazySingleton {
    private static ThreadUnsafeLazySingleton singleton;
    private ThreadUnsafeLazySingleton(){}
    public static ThreadUnsafeLazySingleton getInstance () {
        if (singleton == null) {
            singleton = new ThreadUnsafeLazySingleton();
        }
        return singleton;
    }
}
