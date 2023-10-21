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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public ArrayList<Address> getAddresses() {
        return addresses;
    }

}
