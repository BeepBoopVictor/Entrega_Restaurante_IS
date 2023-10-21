package org.ulpgc.is1.model;

import java.util.ArrayList;

public class Customer {
    public String name;
    public String surname;
    private ArrayList<Address> addresses;

    public Customer(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void addAddress(String street, int number, int postalCode, String city){
        addresses.add(new Address(street, number, postalCode, city));
    }

}
