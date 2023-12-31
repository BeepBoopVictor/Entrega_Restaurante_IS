package org.ulpgc.is1.model;

import java.util.ArrayList;

public class Order {
    private static int NEXT_ID = 0;
    private final int id;
    private ArrayList<OrderItem> orderItems = new ArrayList<OrderItem>();

    public Order() {
        this.id = NEXT_ID++;
    }

    public void addOrderItem(OrderItem orderItem){
        orderItems.add(orderItem);
    }

    public OrderItem getOrderItem(int index){
        return orderItems.get(index);
    }

    public static int getNextId() {
        return NEXT_ID;
    }

    public static void setNextId(int nextId) {
        NEXT_ID = nextId;
    }

    public int getId() {
        return id;
    }

    public double price(Dish dish, int quantity){
        double final_price = 0.0;
        final_price += dish.getPrice()*quantity;
        return final_price;
    }
}
