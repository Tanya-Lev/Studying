package org.example.registrationLogin.controller;


import org.example.registrationLogin.useCase.AdminLoginUseCase;
import org.example.registrationLogin.useCase.PlayerLoginUseCase;

import java.util.Scanner;

public class MainController {
    public static void main(String[] args) {
        System.out.println("Enter scenario: 1-Register, 2-Player Login, 3-Admin Login");
        Scanner scanner = new Scanner(System.in);
        int choose = scanner.nextInt();
        while (choose != 1 && choose != 2) {
            choose = scanner.nextInt();
        }
        switch (choose) {
            case 1 -> RegistrationController.startRegistration(scanner);
            case 2 -> PlayerLoginUseCase.login();
            case 3 -> AdminLoginUseCase.login();
        }
    }
}
