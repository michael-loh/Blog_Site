package com.example.blog_site.api;

import com.example.blog_site.model.Blog;
import com.example.blog_site.service.CreateAccount;
import com.example.blog_site.service.DB;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
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
        return "/static/login.jsp";
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
        return "/static/create_account.jsp";
    }

    /*
    @RequestMapping("/homepage")
    public String homepage(ModelMap model){
        ArrayList<String> test = new ArrayList<>();
        test.add("test1");
        test.add("test2");
        model.addAttribute("test", test);
        model.addAttribute("blogs", database.getBlogs());
        model.addAttribute("user", database.getUsers().get("michael.99.loh@gmail.com"));
        return "static/homepage.jsp";
    }
    */


    @RequestMapping("/homepage")
    public ModelAndView homepage(){
         ModelAndView mav = new ModelAndView("/static/homepage.jsp");

         List<String> test = new ArrayList<>();
         test.add("test1");
         test.add("test2");
         mav.addObject("user", database.getUsers().get("michael.99.loh@gmail.com"));
         mav.addObject("test", test);

         List<Blog> blogs = database.getBlogs();
         mav.addObject("blogs", blogs);
         return mav;
     }


}
