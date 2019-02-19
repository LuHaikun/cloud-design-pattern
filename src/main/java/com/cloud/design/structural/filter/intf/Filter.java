package com.cloud.design.structural.filter.intf;

import com.cloud.design.structural.filter.model.Person;

import java.util.List;

/**
 * @Author: luhk
 * @Email lhk2014@163.com
 * @Date: 2019/1/7 1:51 PM
 * @Description:
 * @Created with cloud-design-pattern
 * @Version: 1.0
 */
public interface Filter {
    public List<Person> meetFilter(List<Person> persons);
}
