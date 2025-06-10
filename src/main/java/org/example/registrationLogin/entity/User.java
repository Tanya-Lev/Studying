package org.example.registrationLogin.entity;

import java.io.Serializable;

public class User implements Serializable {

    private String login;
    private String password;
    private String email;
    private String phone;
    private int age;


    public String getLogin() {
        return login;
    }

    public boolean setLogin(String login) {
        if (login.length() > 4) {
            this.login = login;
            return true;
        } else
            return false;
    }

    public String getPassword() {
        return password;
    }

    public boolean setPassword(String password) {
        if (password.length() == 64) {
            this.password = password;
            return true;
        } else
            return false;

    }

    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
            return true;
        } else
            return false;
    }

    public String getPhone() {
        return phone;
    }

    public boolean setPhone(String phone) {
        this.phone = phone;
        return true;
    }

    public int getAge() {
        return age;
    }

    public boolean setAge(int age) {
        if (age > 0) {
            this.age = age;
            return true;
        } else
            return false;

    }
}
