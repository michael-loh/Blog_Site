package com.example.blog_site.model;

public class User {

    private String username;
    private final String email;
    private String password;

    public User(String username, String email, String password){
        this.username = username;
        this.email = email;
        this.password = password;
    }

}

