package com.meisammulla;

/**
 * Created by mmeis on 6/18/2017.
 */
public class HealthyBurger extends Burger {
    private Condiment condiment1;
    private Condiment condiment2;
    private Condiment condiment3;
    private Condiment condiment4;
    private Condiment condiment5;
    private Condiment condiment6;

    public HealthyBurger(Condiment condiment1, Condiment condiment2, Condiment condiment3, Condiment condiment4, Condiment condiment5, Condiment condiment6) {
        super("Healthy Burger", "beef",7.50d);

        this.condiment1 = condiment1;
        this.condiment2 = condiment2;
        this.condiment3 = condiment3;
        this.condiment4 = condiment4;
        this.condiment5 = condiment5;
        this.condiment6 = condiment6;

        this.addCharge(condiment1.getPrice());
        this.addCharge(condiment2.getPrice());
        this.addCharge(condiment3.getPrice());
        this.addCharge(condiment4.getPrice());
        this.addCharge(condiment5.getPrice());
        this.addCharge(condiment6.getPrice());
    }

    @Override
    public void displayBurger() {
        super.displayBurger();

        condiment1.displayCondiment();
        condiment2.displayCondiment();
        condiment3.displayCondiment();
        condiment4.displayCondiment();
        condiment5.displayCondiment();
        condiment6.displayCondiment();

        System.out.println("Total burger cost: $" + this.getTotalCost());
    }
}
