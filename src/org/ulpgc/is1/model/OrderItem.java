package org.ulpgc.is1.model;

public class OrderItem {
    public int quantity;
    private Dish dish;

    public OrderItem(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
