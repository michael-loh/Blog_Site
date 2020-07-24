package com.example.blog_site.service;

import com.example.blog_site.model.User;

import java.util.ArrayList;
import java.util.HashMap;

public class CreateAccount {

    public static boolean validateUser(String email, String username, String password1, String password2, DB database){

        if( validateEmail(email, database) &&
                validateUsername(username, database) &&
                validatePasswords(password1, password2)){
            User newUser = new User(username, email, password1);
            database.addUsers(newUser);
            System.out.println("True");
            System.out.println(newUser.toString());
            return true;
        }
        System.out.println("False");
        return false;
    }

    private static boolean validateEmail(String email, DB database){
        if(email == null || email.length()==0) { return false; }
        HashMap<String, User> users = database.getUsers();
        if(users.containsKey(email)){ return false;}

        return true;
    }

    private static boolean validateUsername(String username, DB database){
        if(username == null || username.length()==0){ return false; }
        HashMap<String, User> users = database.getUsers();
        for(String key:users.keySet()){
            if(username.equals(users.get(key).getUsername())){ return false; }
        }
        return true;
    }

    private static boolean validatePasswords(String password1, String password2){
        if(password1 == null || password2 == null){ return false; }
        if( !password1.equals(password2) ){ return false;}
        if( password1.length() < 8 || password1.length() > 15){ return false;}

        return true;
    }

}



