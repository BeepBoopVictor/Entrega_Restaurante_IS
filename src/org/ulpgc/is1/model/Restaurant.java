package org.ulpgc.is1.model;

import java.util.ArrayList;

public class Restaurant {
    public String name;
    public Phone phone;
    private ArrayList<Menu> menus;
    private ArrayList<Order> orders;
    private Phone phone_2;

    public Restaurant(String name, Phone phone) {
        this.name = name;
        this.phone = phone;
    }

    public void addMenu(Menu menu){
        menus.add(menu);
    }

    public void addOrder(Order order){
        orders.add(order);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public ArrayList<Menu> getMenus() {
        return menus;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }
}
