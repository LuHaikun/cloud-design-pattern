package com.cloud.design.behavioral.chain.intf;


/**
 * @Author: luhk
 * @Email lhk2014@163.com
 * @Date: 2019/1/10 4:08 PM
 * @Description:
 * @Created with cloud-design-pattern
 * @Version: 1.0
 */
public abstract class AbstractLogger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;
    protected int level;
    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }
    public void logMessage (int level,String message) {
        if (this.level <= level) {
            write(message);
        }
        if(this.nextLogger != null){
            nextLogger.logMessage(level,message);
        }
    }
    abstract protected void write (String message);
}
