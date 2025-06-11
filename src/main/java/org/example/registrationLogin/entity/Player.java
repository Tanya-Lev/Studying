package org.example.registrationLogin.entity;

public class Player extends User {

    private String email;
    private String phone;
    private int age;

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
