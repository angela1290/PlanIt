package com.example.webapp;

public class User {
    private String username;
    private String password;
    private String email;
    private String firstname;
    private String lastname;



    public User(String username, String password, String email, String firstname, String lastname) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstname = firstname;
        this.lastname = lastname;

    }

    @Override
    public String toString() {
        return " Username: " + username  +
                " Password: " + password  +
                " Email: " + email  +
                " Firstname: " + firstname +
                " Lastname: "  + lastname;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getUsername() {
        return username;
    }
}
