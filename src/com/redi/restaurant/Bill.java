package com.redi.restaurant;
import com.redi.restaurant.menu.Dish;

import java.util.ArrayList;
import java.util.List;

public class Bill {
    private List<Dish> items = new ArrayList<>();
    public void addItem (Dish dish) {
        items.add(dish);

    }
    public double getTotal(){
        double total=0;
     for (Dish item : items){
         total+=item.getPrice();
     }
     return total;
    }
}
