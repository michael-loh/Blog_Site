package com.example.blog_site.model;

import com.example.blog_site.model.User;

public class Blog {

    private final int id;
    private final User user;
    private String title;
    private String body;

    public Blog(int id, User user, String title, String body){
        this.id = id;
        this.user = user;
        this.title = title;
        this.body = body;

    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return user.getUsername();
    }

    public String getBody(){
        return body;
    }

    public String toString(){
        return title + " " + user.getUsername();
    }


}
