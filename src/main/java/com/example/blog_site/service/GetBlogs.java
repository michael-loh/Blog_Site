package com.example.blog_site.service;

import com.example.blog_site.model.Blog;
import com.example.blog_site.model.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GetBlogs {

    public static List<Blog> getBlogsFromUser(String username, DB database){

        List<Blog> blogs = new ArrayList<>();

        for(Blog blog: database.getBlogs()){
            if(blog.getAuthor().equals(username))
                blogs.add(blog);
        }
        Collections.reverse(blogs);
        return blogs;
    }

    public static List<Blog> getMostRecentBlogs(DB database){

        List<Blog> blogs = new ArrayList<>();

        int size = database.getBlogs().size()-1;
        int i = size;
        while( i > size-10 && i >= 0){
            blogs.add(database.getBlogs().get(i));
            i--;
        }

        return blogs;
    }
}
