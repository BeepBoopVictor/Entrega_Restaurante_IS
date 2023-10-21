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
}
