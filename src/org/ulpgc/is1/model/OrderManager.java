package org.ulpgc.is1.model;

import java.util.ArrayList;

public class OrderManager {
    private ArrayList<Customer> customers;
    private ArrayList<Restaurant> restaurants;
    private ArrayList<Dish> dishes;

    public void addCustomer(Customer customer){
        customers.add(customer);
    }

    public void addRestaurant(String name, Phone phone){
        restaurants.add(new Restaurant(name, phone));
    }

    public void addDish(String name, String description, int price){
        dishes.add(new Dish(name, description, price));
    }

    public static void order(Customer customer, Restaurant restaurant, ArrayList<Integer> dishesId, ArrayList<Integer> quantities) {
        if (customer != null && restaurant != null && dishesId != null && quantities != null) {
            if (dishesId.size() != quantities.size()) {
                System.out.println("Error: Los IDs de platos y las cantidades no coinciden.");
                return;
            }

            Order order = new Order(customer, restaurant);
            for (int i = 0; i < dishesId.size(); i++) {
                int dishId = dishesId.get(i);
                int quantity = quantities.get(i);
                if (dishId >= 0 && dishId < restaurant.getMenusSize()) {
                    Menu menu = restaurant.getMenus().get(dishId);
                    if (menu != null && dishId >= 0 && dishId < menu.getDishes().size()) {
                           Dish dish = menu.getDishes().get(dishId);
                           OrderItem orderItem = new OrderItem(dish, quantity);
                           order.addOrderItem(orderItem);
                    } else {
                        System.out.println("Error: Plato no encontrado en el menú.");
                    }
                } else {
                    System.out.println("Error: Menú no encontrado en el restaurante.");
                }
            }

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

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public ArrayList<Restaurant> getRestaurants() {
        return restaurants;
    }

    public ArrayList<Dish> getDishes() {
        return dishes;
    }
}
