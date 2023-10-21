package org.ulpgc.is1.control;

import org.ulpgc.is1.model.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        OrderManager orderManager = new OrderManager();
        init(orderManager);

        System.out.println("Datos del primer restaurante: " + orderManager.getRestaurant(0).getName() + ", teléfono: " + orderManager.getRestaurant(0).getPhone().getNumber());
        System.out.println("Nombre del segundo cliente: " + orderManager.getCustomer(1).getName("Complete"));
        System.out.println("Datos del tercer plato: " + orderManager.getDish(2).getName() +", descripción: " + orderManager.getDish(2).getDescription() + ", precio: " + orderManager.getDish(2).getPrice());

        ArrayList<Integer> dishesId = new ArrayList<Integer>();
        dishesId.add(1);
        dishesId.add(2);
        ArrayList<Integer> quantity = new ArrayList<Integer>();
        quantity.add(5);
        quantity.add(2);

        orderManager.order(orderManager.getCustomer(0), orderManager.getRestaurant(0), dishesId, quantity);

        orderManager.deleteCustomer(orderManager.getCustomer(1));
        System.out.println("Cantidad de clientes tras borrar uno: " + orderManager.getCustomerSize());


    }

    public static void init(OrderManager orderManager){
        Customer customer1 = new Customer("Itziar", "Marrero");
        Customer customer2 = new Customer("Victor", "Gil");

        orderManager.addCustomer(customer1);
        orderManager.addCustomer(customer2);

        Restaurant restaurant1 = new Restaurant("Pizzeria Sole", new Phone("111-222-333"));
        Restaurant restaurant2 = new Restaurant("Hamburgueseria Paquito", new Phone("3ab4"));

        orderManager.addRestaurant(restaurant1);
        orderManager.addRestaurant(restaurant2);

        Dish dish1 = new Dish("Papas arrugadas", "Papas", 15);
        Dish dish2 = new Dish("Bife", "Carne", 32);
        Dish dish3 = new Dish("Pizza", "Comida", 20);

        orderManager.addDish(dish1);
        orderManager.addDish(dish2);
        orderManager.addDish(dish3);


    }
}