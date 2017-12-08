/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber.iglojpa.dao;

import id.co.indocyber.iglojpa.model.User;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

/**
 *
 * @author user
 */
public class UserDAO {

    EntityManager em;

    public UserDAO() {
    }

    public UserDAO(EntityManager em) {
        this.em = em;
    }

    public User findUserByName(String name) {
        User user = null;
        
        try {
            
        Query qUser = em.createQuery("Select u from User u where u.username=:username");
        qUser.setParameter("username", name);
        user = (User) qUser.getSingleResult();
            
        } catch (NoResultException nre) {
        //log
        }

        return user;
    }

}
