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

    public String getUsername(){
        return username;
    }

    public String getEmail(){
        return email;
    }

    public String getPassword(){
        return password;
    }

    public String toString(){
        return email + " : " + username + " : " + password;
    }

}

