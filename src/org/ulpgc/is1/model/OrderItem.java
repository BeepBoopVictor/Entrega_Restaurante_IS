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

    public double price(){
        if(dish != null &&  quantity > 0){
            return dish.getPrice() * quantity;
        }
        return 0.0;
    }
}
