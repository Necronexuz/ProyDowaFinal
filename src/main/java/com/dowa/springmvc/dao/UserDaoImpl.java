package com.dowa.springmvc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.dowa.springmvc.model.User;

/**
 * Created by nexuz on 24/05/15.
 */

@Repository("UserDao")
public class UserDaoImpl extends AbstractDao implements UserDao {
    @Override
    public void saveUser(User user) {
        persist(user);
    }

    @SuppressWarnings("unchecked")
    public List<User> findAllUsers() {
        Criteria criteria = getSession().createCriteria(User.class);
        return (List<User>) criteria.list();
    }

    @Override
    public void deleteUserBySsn(String ssn) {
        Query query = getSession().createSQLQuery("DELETE FROM user WHERE ssn = :ssn"); // TO DO: maybe change it
        query.setString("ssn", ssn);
        query.executeUpdate();
    }

}
