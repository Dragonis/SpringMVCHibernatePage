package com.springapp.mvc.model;

/**
 * Created by Dragonis on 22.08.2015.
 */
public class Motorbike extends Vehicle implements Refuelable {
    @Override
    public String refuel() {
        return "Zatankowalem paliwo - Motor";
    }

    @Override
    public boolean checkIfBagIsAbove30Percent() {
        return false;
    }

    @Override
    public void run() {

    }
}
