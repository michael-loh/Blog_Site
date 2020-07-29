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
        populate();
    }

    public HashMap<String, User> getUsers(){
        return users;
    }

    public void addUsers(User user){
        users.put(user.getEmail(), user);
    }
    
    public boolean containsUser(User user){
        if( users.containsKey( user.getEmail() ) ) { return true; }
        return false;
    }

    public ArrayList<Blog> getBlogs(){
        return blogs;
    }

    public void addBlog(Blog blog){
        blogs.add(blog);
    }

    /**
     * This method is for testing purposes
     */
    public void populate(){
        User u1 = new User("michael", "michael.99.loh@gmail.com", "12345678");
        addUsers(u1);
        Blog b1 = new Blog(0, u1, "TEST TITLE1", "TEST BODY1--------------------------------------------------------");
        addBlog(b1);

        Blog b2 = new Blog(1, u1, "TEST TITLE2", "TEST BODY2------------------");
        addBlog(b2);
    }
}
