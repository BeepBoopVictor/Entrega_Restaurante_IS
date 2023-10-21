package org.ulpgc.is1.model;

import java.util.ArrayList;

public class Menu {
    public String name;
    private ArrayList<Dish> dishes;
    private ArrayList<Restaurant> restaurants;
    private MenuType menu;

    public Menu(String name) {
        this.name = name;
        dishes = new ArrayList<Dish>();
    }

    public void addDish(Dish dish){
        dishes.add(dish);
    }

    public void addRestaurant(Restaurant restaurant){
        restaurants.add(restaurant);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
