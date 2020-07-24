package com.example.blog_site.api;

import com.example.blog_site.service.CreateAccount;
import com.example.blog_site.service.DB;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
        return "/static/test.jsp";
    }

    @RequestMapping("/addUser")
    public String addUser(@RequestParam("email") String email,
                          @RequestParam("username")String username,
                          @RequestParam("password1") String password1,
                          @RequestParam("password2") String password2){
        CreateAccount.validateUser(email, username, password1, password2, database);
        return "/static/create_account.jsp";
    }
}
