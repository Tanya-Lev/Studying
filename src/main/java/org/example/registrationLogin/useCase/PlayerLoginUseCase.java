package org.example.registrationLogin.useCase;

import org.example.oshibki.Hash256Util;

import org.example.registrationLogin.entity.User;
import org.example.registrationLogin.exception.IncorrectLoginException;
import org.example.registrationLogin.exception.IncorrectPasswordException;
import org.example.registrationLogin.utils.Utils;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class PlayerLoginUseCase {
    public static void login() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String inputLogin;
            String inputPassword;
            try {
                System.out.println("Enter Login:");
                inputLogin = scanner.nextLine();
                List<User> users = Utils.jsonDeserialization();
                boolean isLoginCorrect = users.stream().anyMatch(user -> inputLogin.equals(user.getLogin()));
                if (!isLoginCorrect) throw new IncorrectLoginException();

                System.out.println("Enter Password:");
                inputPassword = scanner.nextLine();
                String hashedPassword = Hash256Util.hash(inputPassword);
                boolean isPasswordCorrect = users.stream().anyMatch(user -> hashedPassword.equals(user.getPassword()));
                if (!isPasswordCorrect) throw new IncorrectPasswordException();
                System.out.println("LOGIN SUCCESSFUL!!!");
                break;


            } catch (NoSuchElementException _) {
                System.out.println("NoSuchElementException");
            } catch (IllegalStateException _) {
                System.out.println("IllegalStateException");
            } catch (IncorrectLoginException | IncorrectPasswordException e) {
                System.out.println(e.getClass().getSimpleName() + ": Incorrect input. Try again.");
            }
        }
    }
}

