package com.example.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class PlanItController {

    @GetMapping("/login")
    public String showLoginSite(Model m){
        return "login";
    }

    @GetMapping("/register")
    public String showRegister(){
        return "register";
    }
}
