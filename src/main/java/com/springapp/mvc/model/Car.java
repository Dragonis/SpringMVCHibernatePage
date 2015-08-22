package com.springapp.mvc.model;

/**
 * Created by Dragonis on 22.08.2015.
 */
public class Car extends Vehicle implements Refuelable{

    @Override
    public void run() {

    }

    @Override
    public String refuel() {
        return "Zatankowalem paliwo - Samochod";
    }

    @Override
    public boolean checkIfBagIsAbove30Percent() {
        return false;
    }
}
