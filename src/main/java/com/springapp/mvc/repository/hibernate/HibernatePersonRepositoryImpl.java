package com.springapp.mvc.repository.hibernate;

import com.springapp.mvc.model.Person;
import com.springapp.mvc.repository.PersonRepository;
import org.hibernate.Query;
import org.hibernate.Session;
import pojo.worldCountryEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dragonis on 22.08.2015.
 */
public class HibernatePersonRepositoryImpl implements PersonRepository {

    final Session session = HibernateUtil.getSession();

    @Override
    public List<Person> findPerson(String name, String surname) {
        return null;
    }

    @Override
    public Person findById(int id) {
        final Query query1 = session.createQuery("from worldCountryEntity ");
        List<String> name = new ArrayList<String>();
        List<String> continent = new ArrayList<String>();
        List list1 = query1.list();

        for (Object aList1 : list1) {
            worldCountryEntity world = (worldCountryEntity) aList1;
            name.add( world.getName() );
            continent.add( world.getContinent() );
        }
            return new Person(name.get(id),continent.get(id));
    }

    @Override
    public void save(Person person) {

    }
}
