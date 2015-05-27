package com.dowa.springmvc.dao;

import java.util.List;

import com.dowa.springmvc.model.User;

/**
 * Created by nexuz on 24/05/15.
 */
public interface UserDao {
    void saveUser(User user);

    List<User> findAllUsers();

    void deleteUserById(int id_user);

    public User getUser(String username);

}
