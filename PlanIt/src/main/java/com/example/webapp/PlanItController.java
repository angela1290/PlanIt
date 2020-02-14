package com.example.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Controller

public class PlanItController {

    @GetMapping("/login")
    public String showLoginSite(){
        return "login";
    }

    @PostMapping("/login")
    public String login(Model m, HttpSession session, @RequestParam String username, @RequestParam String password, HttpSession s) throws WrongUserNameAndPasswordException {
        if (username.equals("admin") && password.equals("admin")) {
            session.setAttribute("logger", username);
            return "dash";
        } else {
                throw new WrongUserNameAndPasswordException();
            }
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
