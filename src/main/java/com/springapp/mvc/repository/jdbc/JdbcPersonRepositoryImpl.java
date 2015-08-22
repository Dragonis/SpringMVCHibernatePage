package com.springapp.mvc.repository.jdbc;

import com.springapp.mvc.model.Person;
import com.springapp.mvc.repository.PersonRepository;

import java.util.List;

/**
 * Created by Dragonis on 22.08.2015.
 */
public class JdbcPersonRepositoryImpl implements PersonRepository{
    @Override
    public List<Person> findPerson(String name, String surname) {
        return null;
    }

    @Override
    public Person findById(int id) {
        return null;
    }

    @Override
    public void save(Person person) {

    }
}
