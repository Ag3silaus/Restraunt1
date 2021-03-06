package com.redi.restaurant.menu;

import java.util.List;

public class Dish {
    private String name;
    private double price;
    private List<String> ingredients;

    public Dish(String name, double price,List<String> ingredients) {
        this.name = name;
        this.price = price;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public List<String> getIngredients() {
        return ingredients;
    }
}
