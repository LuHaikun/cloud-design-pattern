package com.cloud.design.structural.filter.impl;

import com.cloud.design.structural.filter.intf.Filter;
import com.cloud.design.structural.filter.model.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: luhk
 * @Email lhk2014@163.com
 * @Date: 2019/1/7 1:52 PM
 * @Description:
 * @Created with cloud-design-pattern
 * @Version: 1.0
 */
public class AndFilter implements Filter {
    private Filter filter;
    private Filter otherFilter;

    public AndFilter(Filter filter, Filter otherFilter) {
        this.filter = filter;
        this.otherFilter = otherFilter;
    }

    @Override
    public List<Person> meetFilter(List<Person> persons) {
        List<Person> firstFilterItems = filter.meetFilter(persons);
        return otherFilter.meetFilter(firstFilterItems);
    }
}
