package com.example.webapp;

import java.util.ArrayList;
import java.util.List;

public class AllUsers {

    private List<User> allUsers;

    public AllUsers() {
        allUsers = new ArrayList<>();
    }

    public List<User> getAllUsers() {
        return allUsers;
    }

    public void addNewUser(User user){

        allUsers.add(user);


    }
}
