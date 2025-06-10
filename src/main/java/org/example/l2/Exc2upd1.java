package org.example.l2;

import java.util.Scanner;

/**
 * Задание 2: Конвертер валют Доллар к Рублю и к Евро (1$ = 84RUB, 1$ = 0.91EUR)
 **/

public class Exc2upd1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int inputDollar;



        System.out.println("--------------WELCOME TO THE CURRENCY CONVERTER!-------------");
        System.out.println("Here you can convert dollars to rubles (RUB) and euros (EUR).");
        System.out.print("Enter the amount of dollars (USD): ");
        inputDollar = scanner.nextInt();


        System.out.printf("%d USD = RUB %f\n",inputDollar,convertDollarsToRub(inputDollar));
        System.out.printf("%d USD = EUR %f\n",inputDollar,convertDollarsToEur(inputDollar));

    }
    static double convertDollarsToRub(int dollar) {
        return dollar * 84.0;
    }

    static double convertDollarsToEur(int dollar) {
        return dollar * 0.91;
    }

}
