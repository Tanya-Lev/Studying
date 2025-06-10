package org.example.l5;

//Вывести матрицу: *
//                 **
//                 ***
//                 ****


import java.util.Scanner;

public class Exc3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n;
        String currentString = "";

        System.out.println("Enter the number:");
        n = scanner.nextInt();

        for (int i = 0; i < n; i++) { //строка
            for (int j = 0; j <= i; j++) { //столбец
                currentString+="*";
            }
            currentString+="\n";
        }

        System.out.println(currentString);
    }
}
