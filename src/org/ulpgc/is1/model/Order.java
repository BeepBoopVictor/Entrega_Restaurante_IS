package org.ulpgc.is1.model;

import java.util.ArrayList;

public class Order {
    private static int NEXT_ID = 0;
    public final int id;
    private ArrayList<OrderItem> orderItems;

    public Order(int id) {
        this.id = id;
    }

    public void addOrderItem(int quantity){
        orderItems.add(new OrderItem(quantity));
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
}
