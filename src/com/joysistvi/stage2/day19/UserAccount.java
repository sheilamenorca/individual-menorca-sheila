package com.joysistvi.stage2.day19;

public class UserAccount {

    private String firstName;
    private String middleName;
    private String lastName;
    private String address;
    private String email;
    private String password;

    public UserAccount(String firstName, String middleName, String lastName, String address, String email, String password) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.address = address;

        setEmail(email);
        setPassword(password);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Invalid email format.");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() >= 8) {
            this.password = password;
        } else {
            throw new IllegalArgumentException("Password must be at least 8 characters.");
        }
    }
}
