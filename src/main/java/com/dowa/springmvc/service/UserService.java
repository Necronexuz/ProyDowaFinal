package com.dowa.springmvc.service;

import java.util.List;

import com.dowa.springmvc.model.User;

import java.util.List;

/**
 * Created by nexuz on 24/05/15.
 */
public interface UserService {

    void saveUser(User user);

    List<User> findAllUsers();

    void deleteUserBySsn(String ssn);
}
