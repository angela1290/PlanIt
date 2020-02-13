package com.example.webapp;

public class User {
    private String username;
    private String password;
    private String email;
    private String firstname;
    private String lastname;
    private int phone;

    public User(String username, String password, String email, String firstname, String lastname, int phone) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
    }
}
