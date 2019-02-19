package com.cloud.design.creational.builder;

import com.cloud.design.creational.builder.impl.ChickenBurger;
import com.cloud.design.creational.builder.impl.Coke;
import com.cloud.design.creational.builder.impl.Pepsi;
import com.cloud.design.creational.builder.impl.VegBurger;

/**
 * @Author: luhk
 * @Email lhk2014@163.com
 * @Date: 2019/1/4 1:48 PM
 * @Description: 创建一个 MealBuilder 类，实际的 builder 类负责创建 Meal 对象
 * @Created with cloud-design-pattern
 * @Version: 1.0
 */
public class MealBuilder {
    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
