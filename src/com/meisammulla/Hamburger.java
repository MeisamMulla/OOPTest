package com.meisammulla;

/**
 * Created by mmeis on 6/18/2017.
 */
public class Hamburger extends Burger {
    private Condiment condiment1;
    private Condiment condiment2;
    private Condiment condiment3;
    private Condiment condiment4;

    public Hamburger(Condiment condiment1, Condiment condiment2, Condiment condiment3, Condiment condiment4) {
        super("Hamburger", "beef",3.50d);

        this.condiment1 = condiment1;
        this.condiment2 = condiment2;
        this.condiment3 = condiment3;
        this.condiment4 = condiment4;

        this.addCharge(condiment1.getPrice());
        this.addCharge(condiment2.getPrice());
        this.addCharge(condiment3.getPrice());
        this.addCharge(condiment4.getPrice());
    }

    @Override
    public void displayBurger() {
        super.displayBurger();

        condiment1.displayCondiment();
        condiment2.displayCondiment();
        condiment3.displayCondiment();
        condiment4.displayCondiment();

        System.out.println("Total burger cost: $" + this.getTotalCost());
    }
}
