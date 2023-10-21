package org.ulpgc.is1.model;

public class OrderItem {
    public int quantity;
    private Dish dish;

    public OrderItem(Dish dish, int quantity) {
        this.quantity = quantity;
        this.dish = dish;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
