package org.ulpgc.is1.control;

import org.ulpgc.is1.model.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Itziar", "Marrero");
        Customer customer2 = new Customer("Victor", "Gil");

        OrderManager.addCustomer(customer1);
        OrderManager.addCustomer(customer2);

        Restaurant restaurant1 = new Restaurant("Pizzeria Sole", new Phone("111-222-333"));
        Restaurant restaurant2 = new Restaurant("Hamburgueseria Paquito", new Phone("3ab4"));

        Dish dish1 = new Dish("Papas arrugadas", "Papas", 15);
        Dish dish2 = new Dish("Bife", "Carne", 32);
        Dish dish3 = new Dish("Pizza", "Comida", 20);

        System.out.println("Datos del primer restaurante: " + restaurant1.getName() + ", teléfono: " +restaurant1.phone.getNumber());
        System.out.println("Nombre del segundo cliente: " + customer2.getName("Complete"));
        System.out.println("Datos del tercer plato: " + dish3.getName() +", descripción: " + dish3.getDescription() + ", precio: " + dish3.getPrice());

        ArrayList<Integer> dishesId = new ArrayList<Integer>();
        dishesId.add(2);
        dishesId.add(3);
        ArrayList<Integer> quantity = new ArrayList<Integer>();
        quantity.add(5);
        quantity.add(2);

        OrderManager.order(customer1, restaurant1, dishesId, quantity);

        OrderManager.deleteCustomer(customer1);

        System.out.println(customer1.getOrder(1));
        System.out.println(customer1.getOrder(1).price());

    }
}