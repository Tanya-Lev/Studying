package org.example.l5;

import java.util.Scanner;

//Вывести матрицу: *****
//                 *****
//                 *****

public class ExcYra1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int column; //колонка
        int row; //строка

        System.out.println("Enter Height and Width:");
        row = scanner.nextInt();
        column = scanner.nextInt();

        String currentString = "";

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                currentString += "*";
            }
            currentString += "\n";
        }
        System.out.println(currentString);


    }
}
