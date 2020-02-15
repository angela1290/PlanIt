package com.example.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;


@Controller
public class RegisterController {

    AllUsers allUsers;

    public RegisterController(AllUsers allUsers) {
        this.allUsers = allUsers;

    }


    @GetMapping("/register")
    public String showRegister(Model m, @ModelAttribute User user){
        m.addAttribute("allUser", allUsers.getAllUsers());
            m.addAttribute("tempRegisterUser", user);

        return "register";
    }

    @PostMapping("/register")
    public String registerNewUser(Model m, @ModelAttribute User user, @RequestParam String password, @RequestParam String password2) throws WrongPasswordException {
        if(!password.equals(password2)){
            allUsers.addNewUser(user);
            m.addAttribute("tempRegisterUser", user);
            throw new WrongPasswordException();
        }
        allUsers.addNewUser(user);
        m.addAttribute("allUser", allUsers.getAllUsers());

        return "login";
    }
    @ExceptionHandler(WrongPasswordException.class)
    String inValidNumber(Model model){
        model.addAttribute("tempRegisterUser", allUsers.getTempararyUser());
        model.addAttribute("invalidPassword", "Password doesn't match");
        allUsers.removeTempararyUser();
        return"register";
    }


}
