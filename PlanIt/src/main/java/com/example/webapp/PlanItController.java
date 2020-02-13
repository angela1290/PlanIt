package com.example.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller

public class PlanItController {

    @GetMapping("/login")
    public String showLoginSite(){
        return "login";
    }

    @PostMapping("/login")
    public String login(Model m, HttpSession session, @RequestParam String username, @RequestParam String password, HttpSession s){
        if (username.equals("admin") && password.equals("admin")){
            session.setAttribute("logger",username);
            return "dash";
        }
        return "login";


    }

    @GetMapping("/register")
    public String showRegister(){
        return "register";
    }

    @PostMapping("/register")
    public String newUser(Model m, @ModelAttribute User user){
        

    }

    @GetMapping("/dashboard")
    public String showDash(){
        return "dash";
    }
}
