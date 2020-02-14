package com.example.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;

@Controller
public class PlanItController {

    AllUsers allUsers;

    public PlanItController(AllUsers allUsers) {
        this.allUsers = allUsers;
    }

    @GetMapping("/login")
    public String showLoginSite(){
        //System.out.println(allUsers.getAllUsers().size());
        //System.out.println(allUsers.getAllUsers());
        return "login";
    }

    @PostMapping("/login")
    public String login(Model m, HttpSession session,@RequestParam String username , @RequestParam String password,  HttpSession s) throws WrongUserNameAndPasswordException {

        for (User user : allUsers.getAllUsers()) {
            System.out.println(user.getUsername());
            if (username.equals(user.getUsername()) && password.equals(user.getPassword())) {
                session.setAttribute("logger", username);
                return "dash";
            }
        }
        //throw new WrongUserNameAndPasswordException();
return "login";
    }


    @GetMapping("/dashboard")
    public String showDash(){
        return "dash";
    }

    @ExceptionHandler(WrongUserNameAndPasswordException.class)
    String inValidNumber(Model model){
        model.addAttribute("invalidUser", "Invalid Username or password");
        return"login";
    }
}
