package com.dowa.springmvc.dao;

import java.util.ArrayList;
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
    @Override
    public List<User> findAllUsers() {
        Criteria criteria = getSession().createCriteria(User.class);
        return (List<User>) criteria.list();
    }


    @Override
    public void deleteUserById(int id_user) {
        Query query = getSession().createSQLQuery("DELETE FROM user WHERE id_user = :id_user"); // TO DO: maybe change it
        query.setInteger("id_user", id_user);
        query.executeUpdate();
    }

    public User getUser(String username) {
        List<User> userList = new ArrayList<User>();
        Query query = getSession().createQuery("from User u where u.username = :username");
        query.setParameter("username", username);
        userList = query.list();
        if (userList.size() > 0)
            return userList.get(0);
        else
            return null;
    }

}
