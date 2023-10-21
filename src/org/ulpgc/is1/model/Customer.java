package org.ulpgc.is1.model;

import java.util.ArrayList;

public class Customer {
    public String name;
    public String surname;
    private ArrayList<Address> addresses = new ArrayList<Address>();
    private ArrayList<Order> orders = new ArrayList<Order>();

    public Customer(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void addAddress(String street, int number, int postalCode, String city){
        addresses.add(new Address(street, number, postalCode, city));
    }

    public void addOrder(Order order){
        orders.add(order);
    }

    public String getName(String format) {
        if(format == "Complete"){
            return name + " " + surname;
        } else{
            return name;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public ArrayList<Address> getAddresses() {
        return addresses;
    }

    public Order getOrder(int index){
        return orders.get(index);
    }

}
