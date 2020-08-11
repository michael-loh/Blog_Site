package com.example.blog_site.api;

import com.example.blog_site.model.Blog;
import com.example.blog_site.model.User;
import com.example.blog_site.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Controller
public class AppController {

    private DB database = new DB();


    @RequestMapping("/")
    public String start(){
        return "/static/login.jsp";
    }

    @RequestMapping("/login")
    public String login(){
                 //****TESTING METHOD CALL*****
        return "/static/login.jsp";
    }

    @RequestMapping("/login_user")
    public String login_user(@RequestParam("email") String email,
                                   @RequestParam("password") String password,
                                   HttpSession session,
                                   ModelMap modelMap){

        if(Login.validateUser(email, password, database)){
            User user = database.getUsers().get(email);
            session.setAttribute("user", user);
            return "/homepage";
        }

        return "/login";
    }

    @RequestMapping("/create_account")
    public String create_account(){
        return "/static/create_account.jsp";
    }

    @RequestMapping("/test")
    public String test(){
        return "/static/index.jsp";
    }

    @RequestMapping("/addUser")
    public String addUser(@RequestParam("email") String email,
                          @RequestParam("username")String username,
                          @RequestParam("password1") String password1,
                          @RequestParam("password2") String password2){
        CreateAccount.validateUser(email, username, password1, password2, database);
        return "/login";
    }

    @RequestMapping("/homepage")
    public ModelAndView homepage(HttpSession session){
         ModelAndView mav = new ModelAndView("/static/homepage.jsp");
         List<Blog> blogs = GetBlogs.getMostRecentBlogs(database);
         mav.addObject("blogs", blogs);
         return mav;
    }

    @RequestMapping("/create_blog")
    public String create_blog(HttpSession session){
        if(session.getAttribute("user")==null) {
            return "/login";
        }
        return "static/create_blog.jsp";
    }

    @RequestMapping("/postBlog")
    public String postBlog(@RequestParam("blog_title") String title,
                            @RequestParam("blog_body") String body,
                            HttpSession session){
         User user = (User) session.getAttribute("user");
         if(CreateBlog.validateBlog(title, body, user, database)){
             return "/homepage";
         }
         return "/create_blog";
    }

    @RequestMapping("/blogs")
    public ModelAndView blogs(@RequestParam("username") String username){



        ModelAndView mav = new ModelAndView("/static/blogs.jsp");

        List<Blog> blogs = GetBlogs.getBlogsFromUser(username, database);
        mav.addObject("username", username);
        mav.addObject("blogs", blogs);

        return mav;
    }

    @RequestMapping("/myBlogs")
    public ModelAndView myBlog(HttpSession session){

        if(session.getAttribute("user")==null) {
            return new ModelAndView("/login");
        }

        ModelAndView mav = new ModelAndView("/static/blogs.jsp");

        User user = (User) session.getAttribute("user");
        String username = user.getUsername();

        List<Blog> blogs = GetBlogs.getBlogsFromUser(username, database);
        mav.addObject("username", username);
        mav.addObject("blogs", blogs);

        return mav;
    }


    @RequestMapping("/search_page")
    public String search_page(){
        return "/static/searchpage.jsp";
    }

    @RequestMapping("/search")
    public ModelAndView search(@RequestParam("search") String search){

        System.out.println("here");
        ModelAndView mav = new ModelAndView("/static/searchpage.jsp");

        List<String> searchResults = Search.genSearchResults(search, database);
        Collections.sort(searchResults);

        System.out.println(searchResults.toString());

        mav.addObject("users", searchResults);
        return mav;
    }


}
