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

    public double price(int price){
        if(dish != null &&  quantity > 0){
            return price * quantity;
        }
        return 0.0;
    }
}
