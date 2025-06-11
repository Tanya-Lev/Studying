package org.example.registrationLogin.useCase;

import org.example.oshibki.Hash256Util;
import org.example.registrationLogin.ROLE;
import org.example.registrationLogin.entity.Admin;
import org.example.registrationLogin.entity.Player;
import org.example.registrationLogin.entity.User;
import org.example.registrationLogin.utils.Utils;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class AdminRegistrationUseCase {
    public static User registration() {//??????????
        Scanner scanner = new Scanner(System.in);
        Admin admin = new Admin();
        ROLE[] roles;
        String truePassword = "";

        try {
            do {
                System.out.println("Enter Login:");
            } while (!admin.setLogin(scanner.nextLine()));
            do {
                System.out.println("Enter Password:");
                truePassword = scanner.nextLine();
            } while (truePassword.length() > 8);
            while (true) {
                System.out.println("Enter Role (Select role by number):");
                roles = ROLE.values();
                int choise = 0;
                for (int i = 0; i < roles.length; i++) {
                    System.out.println((i + 1) + ". " + roles[i]);
                }
                if (scanner.hasNext()) {
                    choise = scanner.nextInt();
                    if (choise >= 1 && choise <= roles.length) {
                        admin.setRole(roles[choise]);
                        break;
                    } else System.out.println("Invalid number. Try again!");
                } else {
                    System.out.println("Invalid input. Enter a number!");
                    scanner.next();
                }
            }

        } catch (NoSuchElementException _) {
            System.out.println("NoSuchElementException");
        } catch (IllegalStateException _) {
            System.out.println("IllegalStateException");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        admin.setPassword(Hash256Util.hash(truePassword));

        System.out.println(admin.getLogin());
        System.out.println(admin.getPassword());
        System.out.println(admin.getRole());

        Utils.jsonSerialization(admin);

        return admin;
    }
}
