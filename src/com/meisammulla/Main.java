package com.meisammulla;

public class Main {

    public static void main(String[] args) {
        Burger hamburger = new Hamburger(new Lettuce(), new Pickles(), new Tomato(), new Cheese());
        hamburger.displayBurger();

        Burger deluxeBurger = new DeluxeBurger(new Lettuce(), new Pickles(), new Tomato(), new Cheese(), new Lettuce(), new Tomato(), new Chips(), new Drink());
        deluxeBurger.displayBurger();

        Burger healthyBurger = new HealthyBurger(new Lettuce(), new Pickles(), new Tomato(), new Cheese(), new Lettuce(), new Tomato());
        healthyBurger.displayBurger();
    }
}
