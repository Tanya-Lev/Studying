package org.example.registrationLogin.controller;

import org.example.registrationLogin.useCase.AdminRegistrationUseCase;
import org.example.registrationLogin.useCase.PlayerLoginUseCase;
import org.example.registrationLogin.useCase.PlayerRegistrationUseCase;

import java.util.Scanner;

public class RegistrationController {
    public static void startRegistration(Scanner scanner){
        System.out.println("Enter scenario: 1-Admin Register, 2-Player Register");
        int choose = scanner.nextInt();
        while (choose != 1 && choose != 2) {
            choose = scanner.nextInt();
        }
        switch (choose) {
            case 1 -> AdminRegistrationUseCase.registration();
            case 2 -> PlayerRegistrationUseCase.registration();
        }

    }
}
