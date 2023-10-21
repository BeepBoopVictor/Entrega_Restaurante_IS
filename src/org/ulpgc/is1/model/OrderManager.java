package org.ulpgc.is1.model;

import java.util.ArrayList;

public class OrderManager {
    private ArrayList<Customer> customers;
    private ArrayList<Restaurant> restaurants;
    private ArrayList<Dish> dishes;

    public void addCustomer(String name, String surname){
        customers.add(new Customer(name, surname));
    }

    public void addRestaurant(String name, Phone phone){
        restaurants.add(new Restaurant(name, phone));
    }

    public void addDish(String name, String description, int price){
        dishes.add(new Dish(name, description, price));
    }


}
