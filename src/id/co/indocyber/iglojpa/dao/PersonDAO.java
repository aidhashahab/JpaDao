/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber.iglojpa.dao;

import id.co.indocyber.iglojpa.model.Employee;
import id.co.indocyber.iglojpa.model.Person;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author zulfahmi
 */
public class PersonDAO {

    EntityManager em; //<-- dijadikan  member variable agar bisa di akses dimana aja

    public PersonDAO(EntityManager em) {  //<-- cons dengan parameter
        this.em = em;
    }

    public Person findById(Long id) { //<-- method for find person with id only
        Person person = em.find(Person.class, id);
        return person;
    }

    public List<Person> findAll() { //<-- method for find all
        Query query = em.createQuery("Select p from Person p");
        List<Person> people = query.getResultList();
        return people;
    }
    
    public List<Person> findByFilter(String filterName) {
        Query query = em.createQuery("Select p from Person p where p.name LIKE CONCAT('%',:filterName,'%')");
        query.setParameter("filterName", filterName);
        List<Person> people = query.getResultList();
        return people;
    }
    
    

    public void save(Person person) { //<-- method untuk save
        em.getTransaction().begin();  //<-- buka transaksi
        em.persist(person);           //<-- input data person ke db
        em.getTransaction().commit(); //<-- tutup transaksi
    }

    public void update(Person person) {
        em.getTransaction().begin();
        em.merge(person);            //<-- untuk update data di db
        em.getTransaction().commit();
    }

    public void delete(Person person) {
        em.getTransaction().begin();
        em.remove(person);          //<-- untuk hapus data di db
        em.getTransaction().commit();
    }

    
}
