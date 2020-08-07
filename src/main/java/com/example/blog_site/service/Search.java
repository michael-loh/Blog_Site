package com.example.blog_site.service;

import com.example.blog_site.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Search {
    String search;

    public static List<String> genSearchResults(String search, DB database){
        List<String> listUsernames = new ArrayList<>();
        HashMap<String, User> users = database.getUsers();
        List<String> result = new ArrayList<>();

        for (String key: users.keySet()){
            listUsernames.add(users.get(key).getUsername());
        }

        for (String username : listUsernames){
            if(username.contains(search)){
                result.add(username);
            }
        }

        return result;

    }

    public static void main(String[]args){
        DB database = Test.database();
        System.out.println( genSearchResults("user1", database).toString() );
    }



}
