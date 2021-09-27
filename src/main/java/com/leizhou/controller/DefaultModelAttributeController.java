package com.leizhou.controller;

import com.leizhou.beans.Login;
import com.leizhou.beans.User;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Arrays;
import java.util.List;

@ControllerAdvice
public class DefaultModelAttributeController {

    @ModelAttribute("newuser")
    public User getDefaultUser(){
        return new User();
    }

    @ModelAttribute("genderItems")
    public List<String> getGenderItems(){
        return Arrays.asList("Male", "Female", "Other");
    }

    @ModelAttribute("login")
    public Login getLogin(){
        return new Login();
    }
}
