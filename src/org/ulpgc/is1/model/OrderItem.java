package org.ulpgc.is1.model;

public class OrderItem {
    public int quantity;

    public OrderItem(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /*public double price(){
        if(dish != null &&  quantity > 0){
            return dish.getPrice() * quantity;
        }
        return 0.0;
    }*/
}
