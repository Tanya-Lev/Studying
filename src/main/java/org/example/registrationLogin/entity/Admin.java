package org.example.registrationLogin.entity;

import org.example.registrationLogin.ROLE;

public class Admin extends User{
    private ROLE role;

    public ROLE getRole() {
        return role;
    }

    public void setRole(ROLE role) {
        this.role = role;
    }
}
