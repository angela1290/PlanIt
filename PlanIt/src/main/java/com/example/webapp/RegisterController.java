package com.example.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;


@Controller
public class RegisterController {

    AllUsers allUsers;

    public RegisterController(AllUsers allUsers) {
        this.allUsers = allUsers;
    }

    @GetMapping("/register")
    public String showRegister(Model m){
        m.addAttribute("allUser", allUsers.getAllUsers());

        return "register";
    }

    @PostMapping("/register")
    public String registerNewUser(Model m, @ModelAttribute User user){
        allUsers.addNewUser(user);
        m.addAttribute("allUser", allUsers.getAllUsers());

        return "login";
    }

}
