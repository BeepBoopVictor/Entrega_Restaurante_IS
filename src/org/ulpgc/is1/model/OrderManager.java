package org.ulpgc.is1.model;

import java.util.ArrayList;

public class OrderManager {
    private ArrayList<Customer> customers = new ArrayList<Customer>();
    private ArrayList<Restaurant> restaurants = new ArrayList<Restaurant>();
    private ArrayList<Dish> dishes = new ArrayList<Dish>();

    public OrderManager(){
    }

    public void addCustomer(Customer customer){
        customers.add(customer);
    }

    public void addRestaurant(Restaurant restaurant){
        restaurants.add(restaurant);
    }

    public void addDish(Dish dish){
        dishes.add(dish);
    }

    public void order(Customer customer, Restaurant restaurant, ArrayList<Integer> dishesId, ArrayList<Integer> quantities) {
        if (customer != null && restaurant != null && dishesId != null && quantities != null) {
            if (dishesId.size() != quantities.size()) {
                System.out.println("Error: Los IDs de platos y las cantidades no coinciden.");
            }

            Order order = new Order();
            System.out.println("\n- - -ESTE ES TU PEDIDO- - -\n");

            for (int i = 0; i < dishesId.size(); i++){
                int dishId = dishesId.get(i);
                int quantity = quantities.get(i);
                order.addOrderItem(new OrderItem(quantity));
                System.out.println("Plato: " + dishes.get(dishId).getName() + ", cantidad: " + quantity + ", precio: " + order.price(dishes.get(dishId), quantity));
            }

            System.out.println("\n- - - - - - - - - - - - - -\n");

            customer.addOrder(order);
            restaurant.addOrder(order);
        } else {
            System.out.println("Error: Datos de cliente, restaurante o platos no válidos.");
        }
    }

    public void deleteCustomer(Customer customer) {
        if (customer != null) {
            for (Customer c : customers) {
                if (c.equals(customer)) {
                    customers.remove(c);
                    return;
                }
            }
            System.out.println("Error: Cliente no encontrado.");
        }
    }

    public Customer getCustomer(int index) {
        return customers.get(index);
    }

    public Restaurant getRestaurant(int index) {
        return restaurants.get(index);
    }

    public Dish getDish(int index) {
        return dishes.get(index);
    }

    public int getCustomerSize(){
        return customers.size();
    }
}
