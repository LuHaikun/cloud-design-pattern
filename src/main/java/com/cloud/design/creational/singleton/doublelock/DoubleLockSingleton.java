package com.cloud.design.creational.singleton.doublelock;

/**
 * @Author: luhk
 * @Email lhk2014@163.com
 * @Date: 2019/1/4 11:22 AM
 * @Description: 双锁机制，安全且在多线程情况下能保持高性能。
 * @Created with cloud-design-pattern
 * @Version: 1.0
 */
public class DoubleLockSingleton {
    private volatile static DoubleLockSingleton singleton;
    private DoubleLockSingleton(){}
    public static DoubleLockSingleton getSingleton () {
        if(singleton == null){
            synchronized (DoubleLockSingleton.class) {
                if(singleton == null){
                    singleton = new DoubleLockSingleton();
                }
            }
        }
        return singleton;
    }
}
