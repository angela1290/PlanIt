package com.example.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class RegisterController {

    AllUsers allUsers = new AllUsers();

    @GetMapping("/register")
    public String showRegister(Model m){

        m.addAttribute("allUser", allUsers.getAllUsers());


        return "register";
    }

    @PostMapping("/register")
    public String registerNewUser(Model m, @ModelAttribute User user){

       allUsers.addNewUser(user);
       
        m.addAttribute("allUser", allUsers.getAllUsers());

        return "register";
    }

}
