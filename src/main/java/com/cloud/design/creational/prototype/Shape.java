package com.cloud.design.creational.prototype;

/**
 * @Author: luhk
 * @Email lhk2014@163.com
 * @Date: 2019/1/4 2:34 PM
 * @Description:
 * @Created with cloud-design-pattern
 * @Version: 1.0
 */
public abstract class Shape implements Cloneable{
    private String id;
    protected String type;

    public abstract void draw();

    public String getType(){
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
