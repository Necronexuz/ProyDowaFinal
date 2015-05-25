package com.dowa.springmvc.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dowa.springmvc.model.User;
import com.dowa.springmvc.service.UserService;

/**
 * Created by nexuz on 24/05/15.
 */

@Controller
@RequestMapping("/")
public class AppController {

    @Autowired
    UserService service;

    /**
     * This methos will list all existing users
     */
    @RequestMapping(value = {"/", "/list"}, method = RequestMethod.GET)
    public String listUsers(ModelMap model){
        List<User> users = service.findAllUsers();
        model.addAttribute("users",users);
        return "allusers";
    }

    /**
     * This method will provide the medium to add a new user.
     */
    @RequestMapping(value = {"/new"}, method = RequestMethod.GET)
    public String newUser(ModelMap model){
        User user = new User();
        model.addAttribute("user", user);
        return "registration";
    }

    /**
     * This method will be called on form submission, handling POST request for
     * saving user in database. It also validates the user input
     */
    @RequestMapping(value = {"/new"}, method = RequestMethod.POST)
    public String saveUser(@Valid User user, BindingResult result, ModelMap model){
        if(result.hasErrors()){
            return "registration";
        }
        service.saveUser(user);

        model.addAttribute("success", "User " + user.getName() + " registred successfully");
        return "success";
    }

    /**
     * This method will delete an user by it's ssn value
     */
    @RequestMapping(value = {"/delete-{ssn}-user"}, method = RequestMethod.GET)
    public String deleteUser(@PathVariable String ssn){
        service.deleteUserBySsn(ssn);
        return "redirect:/list";
    }

}











