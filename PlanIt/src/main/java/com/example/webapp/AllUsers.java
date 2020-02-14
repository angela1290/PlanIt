package com.example.webapp;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AllUsers {

    private List<User> allUsers;

    public AllUsers() {
        allUsers = new ArrayList<>();
        allUsers.add(new User("krisAnd","admin", "krister.andersson@med.lu.se", "Krister", "Andersson", 45500505));
    }

    public List<User> getAllUsers() {
        return allUsers;
    }

    public void addNewUser(User user){

        allUsers.add(user);


    }
}
