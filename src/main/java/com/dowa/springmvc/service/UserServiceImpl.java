package com.dowa.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dowa.springmvc.dao.UserDao;
import com.dowa.springmvc.model.User;

/**
 * Created by nexuz on 24/05/15.
 * NEXUZ NOTES:
 * @Transactional which starts a transaction on each method start, and commits it on each method exit ( or rollback
 * if method was failed due to an error). Note that since the transaction are on method scope, and inside method we
 * are using DAO, DAO method will be executed within same transaction.
 */

@Service
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao dao;


    public void saveUser(User user) {
        dao.saveUser(user);
    }


    public List<User> findAllUsers() {
        return dao.findAllUsers();
    }

    public void deleteUserById(int id_user) {
        dao.deleteUserById(id_user);
    }
}
