package com.springapp.mvc.service;

import com.springapp.mvc.model.Person;

/**
 * Created by Dragonis on 22.08.2015.
 */

public interface PersonService {

    void buy(Person person);

    int sell(int id_przedmiotu);

    String talk(Person person);

    void fight(Person person);
}
