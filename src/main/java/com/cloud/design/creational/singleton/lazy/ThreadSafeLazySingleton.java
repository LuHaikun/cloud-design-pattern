package com.cloud.design.creational.singleton.lazy;

/**
 * @Author: luhk
 * @Email lhk2014@163.com
 * @Date: 2019/1/4 11:12 AM
 * @Description: 这种方式具备很好的 lazy loading，能够在多线程中很好的工作，但是，效率很低，99% 情况下不需要同步。
 * @Created with cloud-design-pattern
 * @Version: 1.0
 */
public class ThreadSafeLazySingleton {
    private static ThreadSafeLazySingleton singleton;
    private ThreadSafeLazySingleton(){}
    public static synchronized ThreadSafeLazySingleton getInstance () {
        if (singleton == null) {
            singleton = new ThreadSafeLazySingleton();
        }
        return singleton;
    }
}
