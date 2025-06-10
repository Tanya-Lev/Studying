package org.example.l5;

import org.example.l1.Main;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

//Вывести матрицу: * o o o *
//                 o * o * o
//                 o o * o o
//                 o * o * o
//                 * o o o *

public class ExcYra2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int column; //колонка
        int row; //строка


        while (true) {
            System.out.println("Enter Height and Width (H=W; odd numbers):");

            try {
                column = scanner.nextInt();
                row = scanner.nextInt();
                if (column != row) {
                    System.out.println("Numbers must be equal!");
                } else if (row <= 0 || column <= 0) {
                    System.out.println("Numbers must be positive and ≠0!");
                } else if (row % 2 == 0 || column % 2 == 0)
                    System.out.println("Numbers must not be even!");
                else
                    break;

            } catch (InputMismatchException mismatchExc) {
                System.out.println("Need a Number!");
            } catch (NoSuchElementException noSuchElementExc) {
                System.out.println("Input is exhausted");
            } catch (IllegalStateException illegalStateException) {
                System.out.println("Scanner is closed");
            } catch (Exception e) {
                e.printStackTrace();
            }

        }


        String currentString = "";

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < column; j++) {
                if (i == j || i + j == row - 1) {
                    currentString += "X";
                } else
                    currentString += "o";

            }
            currentString += "\n";
        }
        System.out.print(currentString);
    }
}
