package org.example.registrationLogin.useCase;

import org.example.oshibki.Hash256Util;
import org.example.registrationLogin.entity.User;
import org.example.registrationLogin.utils.Utils;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class RegistrationUseCase {
    public static User registration() {
        Scanner scanner = new Scanner(System.in);
        User user = new User();
        String truePassword = "";

        try {
            do {
                System.out.println("Enter Login:");
            } while (!user.setLogin(scanner.nextLine()));
            do {
                System.out.println("Enter Password:");
                truePassword = scanner.nextLine();
            } while (truePassword.length() > 8);
            do {
                System.out.println("Enter Email:");
            } while (!user.setEmail(scanner.nextLine()));
            do {
                System.out.println("Enter Phone:");
            } while (!user.setPhone(scanner.nextLine()));
            do {
                System.out.println("Enter Age:");
            } while (!user.setAge(scanner.nextInt()));

        } catch (NoSuchElementException _) {
            System.out.println("NoSuchElementException");
        } catch (IllegalStateException _) {
            System.out.println("IllegalStateException");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        user.setPassword(Hash256Util.hash(truePassword));

        System.out.println(user.getLogin());
        System.out.println(user.getPassword());
        System.out.println(user.getEmail());
        System.out.println(user.getPhone());
        System.out.println(user.getAge());

        Utils.jsonSerialization(user);

        return user;
    }
}
