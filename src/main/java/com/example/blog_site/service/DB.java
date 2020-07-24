package com.example.blog_site.service;

import com.example.blog_site.model.Blog;
import com.example.blog_site.model.Likes;
import com.example.blog_site.model.User;

import java.util.ArrayList;
import java.util.HashMap;

public class DB {


    private ArrayList<Blog> blogs;
    private ArrayList<Likes> likes;

    private HashMap<String, User> users;

    public DB(){
        users = new HashMap<>();
        blogs = new ArrayList<>();
        likes = new ArrayList<>();
    }

    public HashMap<String, User> getUsers(){
        return users;
    }

    public void addUsers(User user){
        users.put(user.getEmail(), user);
    }
}
