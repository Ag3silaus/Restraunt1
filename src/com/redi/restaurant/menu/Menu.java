package com.redi.restaurant.menu;
import com.redi.restaurant.menu.desserts.Dessert;
import com.redi.restaurant.menu.drink.Drink;
import com.redi.restaurant.menu.maincourses.MainCourse;
import com.redi.restaurant.menu.starter.Starter;
import java.util.ArrayList;
import java.util.List;


public class Menu {

    private List<Starter> starter = new ArrayList<>();
    private List<MainCourse> mainCourses = new ArrayList<>();
    private List<Dessert> desserts = new ArrayList<>();
    private List<Drink> drinks = new ArrayList<>();

    public Menu(List<Starter> starter, List<MainCourse> mainCourses, List<Dessert> desserts) {
        this.starter = starter;
        this.mainCourses = mainCourses;
        this.desserts = desserts;
    }

}
