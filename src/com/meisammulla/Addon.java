package com.meisammulla;

/**
 * Created by mmeis on 6/18/2017.
 */
public class Addon {
    private String name;
    private double price;

    public Addon(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void displayAddon() {
        System.out.println("Addon:" + this.getName() + " ($" + this.getPrice() + ")");
    }
}
