package org.example.registrationLogin.entity;

import java.io.Serializable;

public class User implements Serializable {

    String login;
    String password;


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


}
