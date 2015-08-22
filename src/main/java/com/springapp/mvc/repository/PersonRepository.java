package com.springapp.mvc.repository;

import com.springapp.mvc.model.Person;

import java.util.List;

/**
 * Created by Dragonis on 22.08.2015.
 */
public interface PersonRepository {

    List<Person> findPerson(String name, String surname);

    Person findById(int id);

    void save(Person person);

}
