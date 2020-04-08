package com.redi.restaurant.menu.drink;

import com.redi.restaurant.menu.Dish;

import java.util.List;

public abstract class Drink extends Dish {
    private String name;
    private double price;
    private List<String> ingredients;

    public Drink(String name, double price,List<String> ingredients) {
       super(name, price, ingredients);
    }
}
