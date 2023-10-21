package org.ulpgc.is1.model;

import java.util.ArrayList;

public class Order {
    private static int NEXT_ID = 0;
    public final int id;
    private ArrayList<OrderItem> orderItems;

    public Order(int id) {
        this.id = id;
    }
}
