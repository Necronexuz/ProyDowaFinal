package com.dowa.springmvc.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by nexuz on 24/05/15.
 * NEXUZ NOTES:
 * This class serve as base class for database related operations.
 */
public class AbstractDao {
    @Autowired
    private SessionFactory sessionFactory;

    protected Session getSession(){
        return sessionFactory.getCurrentSession();
    }

    public void persist(Object entity){
        getSession().persist(entity);
    }

    public void delete(Object entity){
        getSession().delete(entity);
    }
}
