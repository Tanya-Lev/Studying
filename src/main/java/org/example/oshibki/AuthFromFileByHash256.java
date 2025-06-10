package org.example.oshibki;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class AuthFromFileByHash256 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String fullFileLine = "";
        String hashedPass;

        String userLogin;
        String userPass;
        String Login = "TanyaLev_2001";


        try {
            Path filePath = Paths.get("src/main/java/org/example/oshibki/fileHashed.txt");
            fullFileLine = Files.readString(filePath);

        } catch (FileNotFoundException _) {
            System.out.println("FileNotFoundException");
        } catch (InvalidPathException _) {
            System.out.println("InvalidPathException");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Enter login and password:");
        try {
            userLogin = scanner.nextLine();
            userPass = scanner.nextLine();
            for (int i = 1; i <= 5; i++) {
                hashedPass = Hash256Util.hash(userPass);
                userPass = hashedPass;
            }
            if (userLogin.equals(Login)) {
                if (userPass.equals(fullFileLine)) {
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
        }
        catch (NullPointerException e) {
            System.out.println("Ошибка: объект оказался `null`!");
        }
        catch (Exception e) {
            e.getMessage();
        }
    }
}
