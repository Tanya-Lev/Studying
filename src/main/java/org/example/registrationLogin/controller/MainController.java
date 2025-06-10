package org.example.registrationLogin.controller;


import org.example.registrationLogin.useCase.LoginUseCase;
import org.example.registrationLogin.useCase.RegistrationUseCase;

import java.util.Scanner;

public class MainController {
    public static void main(String[] args) {
        System.out.println("Enter scenario: 1-Login, 2-Register");
        Scanner scanner = new Scanner(System.in);
        int choose = scanner.nextInt();
        while (choose != 1 && choose != 2) {
            choose = scanner.nextInt();
        }
        switch (choose) {
            case 1 -> LoginUseCase.login();
            case 2 -> RegistrationUseCase.registration();
        }
    }
}
