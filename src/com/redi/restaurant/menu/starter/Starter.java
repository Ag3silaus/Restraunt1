package com.redi.restaurant.menu.starter;

import com.redi.restaurant.menu.Dish;

import java.util.List;

public abstract class Starter extends Dish {

    public Starter(String name, double price,List<String> ingredients) {
        super(name, price, ingredients);
    }

}
