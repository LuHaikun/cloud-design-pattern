package com.cloud.design.structural.filter.model;

/**
 * @Author: luhk
 * @Email lhk2014@163.com
 * @Date: 2019/1/7 1:50 PM
 * @Description:
 * @Created with cloud-design-pattern
 * @Version: 1.0
 */
public class Person {
    private String name;
    private String gender;
    private String maritalStatus;

    public Person(String name,String gender,String maritalStatus){
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
    public String getMaritalStatus() {
        return maritalStatus;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", maritalStatus='" + maritalStatus + '\'' +
                '}';
    }
}
