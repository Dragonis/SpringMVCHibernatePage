package com.springapp.mvc.model;

/**
 * Created by Dragonis on 22.08.2015.
 */
public abstract class Vehicle {

    public abstract void run();

    public String stop(){
        return "Zatrzymalem sie. ";
    }
}
