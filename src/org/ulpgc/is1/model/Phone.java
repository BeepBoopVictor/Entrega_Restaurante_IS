package org.ulpgc.is1.model;

public class Phone {
    public String number;
    private Restaurant restaurant;
    public Phone(String number) {
        if (isValid(number)){
            this.number = number;
        } else {
            this.number = "XXXX";
        }
    }

    public boolean isValid(String number){
        return number.matches("\\d{3}-\\d{3}-\\d{3}");
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
