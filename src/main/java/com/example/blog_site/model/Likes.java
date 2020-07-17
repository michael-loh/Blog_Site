package com.example.blog_site.model;

public class Likes {

    private final User user;
    private final Blog blog;

    public Likes(User user, Blog blog){
        this.user = user;
        this.blog = blog;
    }

}
