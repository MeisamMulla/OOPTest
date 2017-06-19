package com.meisammulla;

/**
 * Created by mmeis on 6/18/2017.
 */
public class Burger {
    private String name;
    private String meat;
    private double cost;

    private double totalCost;

    public Burger(String name, String meat, double cost) {
        this.name = name;
        this.meat = meat;
        this.cost = cost;
        this.totalCost += this.cost;
    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public double getCost() {
        return cost;
    }

    public void addCharge(double amount) {
        this.totalCost += amount;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void displayBurger() {
        System.out.println("Burger:" + this.getName() + " ($" + this.getCost() + ")");
    }
}
