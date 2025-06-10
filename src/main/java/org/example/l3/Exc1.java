package org.example.l3;

import java.util.HashMap;
import java.util.Scanner;

/**Введите общее кол-во секунд, и получите часы, минуты и оставшиеся секунды**/

public class Exc1 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Here you can express time in seconds!");
        System.out.println("-------------------------------------");
        System.out.print("Enter the number of seconds: ");

        int inputSeconds = scanner.nextInt();

        int sec = inputSeconds % 60;
        int min = inputSeconds / 60 % 60;
        int hour = inputSeconds / 3600 % 24;
        int day = inputSeconds / 86400;

        System.out.printf("Days: %d\nHours: %d\nMinutes: %d\nSeconds: %d\n", day, hour, min, sec);

    }
}


