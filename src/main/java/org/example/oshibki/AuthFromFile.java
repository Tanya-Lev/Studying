package org.example.oshibki;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class AuthFromFile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String fullFileLineString;

        String[] splitStringsArray = new String[0];
        String userLogin;
        String userPass;


        try {
            Path filePath = Paths.get("src/main/java/org/example/oshibki/file.txt");
            fullFileLineString = Files.readString(filePath);
            splitStringsArray = fullFileLineString.split(":");


        } catch (FileNotFoundException _) {
            System.out.println("FileNotFoundException");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Enter login and password:");
        try {
            userLogin = scanner.nextLine();
            userPass = scanner.nextLine();
            if (userLogin.equals(splitStringsArray[0])) {
                if (userPass.equals(splitStringsArray[1])) {
                    System.out.println("Success!");
                } else throw new IncorrectPasswordException();
            } else throw new IncorrectLoginException();
        } catch (NoSuchElementException _) {
            System.out.println("NoSuchElementException");

        } catch (IllegalStateException _) {
            System.out.println("IllegalStateException");

        } catch (IncorrectLoginException _) {
            System.out.println("IncorrectLoginException");

        } catch (IncorrectPasswordException _) {
            System.out.println("IncorrectPasswordException");

        } catch (Exception e) {
            e.getMessage();
        }
    }
}
