package com.example.blog_site.service;

import com.example.blog_site.model.Blog;
import com.example.blog_site.model.User;

public class CreateBlog {

    public static boolean validateBlog(String title, String body, User user , DB database){
        if(title.length() > 30){ return false;}

        if(body.length() > 1000){ return false;}

        if(!database.containsUser(user)){ return false; }

        int id = database.getBlogs().size();
        Blog blog = new Blog(id, user, title, body);
        database.addBlog(blog);
        return true;
    }
}
