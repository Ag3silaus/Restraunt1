package com.redi.restaurant.menu.desserts;

import com.redi.restaurant.menu.Dish;

import java.util.List;

public abstract class Dessert extends Dish {
    private String name;
    private double price;
    private List<String> ingredients;

    public Dessert(String name, double price,List<String> ingredients) {
        super(name, price, ingredients);
    }
}
