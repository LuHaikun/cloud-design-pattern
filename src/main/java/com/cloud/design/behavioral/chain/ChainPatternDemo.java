package com.cloud.design.behavioral.chain;

import com.cloud.design.behavioral.chain.impl.ConsoleLogger;
import com.cloud.design.behavioral.chain.impl.ErrorLogger;
import com.cloud.design.behavioral.chain.impl.FileLogger;
import com.cloud.design.behavioral.chain.intf.AbstractLogger;

/**
 * @Author: luhk
 * @Email lhk2014@163.com
 * @Date: 2019/1/10 4:18 PM
 * @Description: 不同类型的记录器。赋予它们不同的错误级别，并在每个记录器中设置下一个记录器。每个记录器中的下一个记录器代表的是链的一部分
 * @Created with cloud-design-pattern
 * @Version: 1.0
 */
public class ChainPatternDemo {
    private static AbstractLogger getChainOfLoggers(){
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");

        loggerChain.logMessage(AbstractLogger.DEBUG, "This is an debug level information.");

        loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");
    }
}
