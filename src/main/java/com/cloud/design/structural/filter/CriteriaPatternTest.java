package com.cloud.design.structural.filter;

import com.cloud.design.structural.filter.impl.*;
import com.cloud.design.structural.filter.intf.Filter;
import com.cloud.design.structural.filter.model.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: luhk
 * @Email lhk2014@163.com
 * @Date: 2019/1/7 2:00 PM
 * @Description:
 * @Created with cloud-design-pattern
 * @Version: 1.0
 */
public class CriteriaPatternTest {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Robert","Male", "Single"));
        persons.add(new Person("John","Male", "Married"));
        persons.add(new Person("Laura","Female", "Married"));
        persons.add(new Person("Diana","Female", "Single"));
        persons.add(new Person("Mike","Male", "Single"));
        persons.add(new Person("Bobby","Male", "Single"));

        Filter male = new FilterMale();
        Filter female = new FilterFemale();
        Filter single = new FilterSingle();
        Filter singleMale = new AndFilter(single, male);
        Filter singleOrFemale = new OrFilter(single, female);

        System.out.println("Males: ");
        printPersons(male.meetFilter(persons));

        System.out.println("\nFemales: ");
        printPersons(female.meetFilter(persons));

        System.out.println("\nSingle Males: ");
        printPersons(singleMale.meetFilter(persons));

        System.out.println("\nSingle Or Females: ");
        printPersons(singleOrFemale.meetFilter(persons));
    }

    public static void printPersons(List<Person> persons){
        for (Person person : persons) {
            System.out.println(person.toString());
        }
    }
}
