package org.ulpgc.is1.model;

import java.util.ArrayList;

public class Menu {
    public String name;
    private ArrayList<Dish> dishes;

    public Menu(String name) {
        this.name = name;
        dishes = new ArrayList<Dish>();
    }

    public void addDish(Dish dish){
        dishes.add(dish);
    }
}
