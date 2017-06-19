package com.meisammulla;

/**
 * Created by mmeis on 6/18/2017.
 */
public class Condiment {
    private String name;
    private double price;

    public Condiment(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void displayCondiment() {
        System.out.println("Condiment:" + this.getName() + " ($" + this.getPrice()+ ")");
    }
}
