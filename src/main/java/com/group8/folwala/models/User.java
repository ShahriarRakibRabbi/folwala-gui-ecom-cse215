package com.group8.folwala.models;

public class User {
    private String name;
    private String phone;
    private String password;
    private String address;
    private boolean isAdmin;

    public User(String name, String phone, String password, String address, boolean isAdmin) {
        this.name = name;
        this.phone = phone;
        this.password = password;
        this.address = address;
        this.isAdmin = isAdmin;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getPassword() {
        return password;
    }

    public String getAddress() {
        return address;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public boolean validatePassword(String password) {
        return this.password.equals(password);
    }

}