package com.springapp.mvc.service;

import com.springapp.mvc.model.Person;
import com.springapp.mvc.repository.PersonRepository;
import com.springapp.mvc.repository.hibernate.HibernatePersonRepositoryImpl;
import org.springframework.stereotype.Service;

/**
 * Created by Dragonis on 22.08.2015.
 */
@Service
public class PersonServiceImpl implements PersonService {

    private PersonRepository PersonRepository;

    @Override
    public void buy(Person person) {
        PersonRepository.save(person);
    }

    @Override
    public int sell(int id_przedmiotu) {
        return id_przedmiotu;
    }

    @Override
    public String talk(Person person) {
        HibernatePersonRepositoryImpl hibernatePersonRepository = new HibernatePersonRepositoryImpl();
        Person personById = hibernatePersonRepository.findById(0);
        String personFirstandLastName = personById.getFirstName() + " " + personById.getLastName();
        return personFirstandLastName;
    }

    @Override
    public void fight(Person person) {

    }
}
