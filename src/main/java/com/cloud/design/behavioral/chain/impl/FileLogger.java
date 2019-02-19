package com.cloud.design.behavioral.chain.impl;

import com.cloud.design.behavioral.chain.intf.AbstractLogger;

/**
 * @Author: luhk
 * @Email lhk2014@163.com
 * @Date: 2019/1/7 2:45 PM
 * @Description: 创建扩展了该记录器类的实体类。
 * @Created with cloud-design-pattern
 * @Version: 1.0
 */
public class FileLogger extends AbstractLogger {
    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File Console::Logger: " + message);
    }
}
