package org.example.registrationLogin.useCase;

import org.example.oshibki.Hash256Util;
import org.example.registrationLogin.entity.Player;
import org.example.registrationLogin.entity.User;
import org.example.registrationLogin.utils.Utils;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class PlayerRegistrationUseCase {
    public static User registration() {//??????????
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        String truePassword = "";

        try {
            do {
                System.out.println("Enter Login:");
            } while (!player.setLogin(scanner.nextLine()));
            do {
                System.out.println("Enter Password:");
                truePassword = scanner.nextLine();
            } while (truePassword.length() > 8);
            do {
                System.out.println("Enter Email:");
            } while (!player.setEmail(scanner.nextLine()));
            do {
                System.out.println("Enter Phone:");
            } while (!player.setPhone(scanner.nextLine()));
            do {
                System.out.println("Enter Age:");
            } while (!player.setAge(scanner.nextInt()));

        } catch (NoSuchElementException _) {
            System.out.println("NoSuchElementException");
        } catch (IllegalStateException _) {
            System.out.println("IllegalStateException");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        player.setPassword(Hash256Util.hash(truePassword));

        System.out.println(player.getLogin());
        System.out.println(player.getPassword());
        System.out.println(player.getEmail());
        System.out.println(player.getPhone());
        System.out.println(player.getAge());

        Utils.jsonSerialization(player);

        return player;
    }
}
