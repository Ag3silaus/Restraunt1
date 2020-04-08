package com.redi.restaurant.menu.maincourses;

import com.redi.restaurant.menu.Dish;

import java.util.List;

public abstract class MainCourse extends Dish {
    private String name;
    private double price;
    private List<String> ingredients;

    public MainCourse(String name, double price,List<String> ingredients) {
        super(name, price, ingredients);
    }
}
