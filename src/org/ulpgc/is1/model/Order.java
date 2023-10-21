package org.ulpgc.is1.model;

public class Order {
    private static int NEXT_ID = 0;
    public final int id;

    public Order(int id) {
        this.id = id;
    }
}
