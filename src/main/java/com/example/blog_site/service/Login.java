package com.example.blog_site.service;

import com.example.blog_site.model.User;

import java.util.HashMap;

public class Login {
    public static boolean validateUser(String email, String password, DB database){
        HashMap<String, User> users = database.getUsers();

        if(!users.containsKey(email)){ return false; }

        if( !password.equals( users.get( email ).getPassword() ) ){ return false; }

        return true;
    }


}
