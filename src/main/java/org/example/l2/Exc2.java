package org.example.l2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Задание 2: Конвертер валют Доллар к Рублю и к Евро (1$ = 84RUB, 1$ = 0.91EUR)
 **/

public class Exc2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int inputDollar;
        ArrayList<Integer> convertedCurrencies;


        System.out.println("--------------WELCOME TO THE CURRENCY CONVERTER!-------------");
        System.out.println("Here you can convert dollars to rubles (RUB) and euros (EUR).");
        System.out.print("Enter the amount of dollars (USD): ");
        inputDollar = scanner.nextInt();

        convertedCurrencies = convertDollarsToRubAndEur(inputDollar);

        System.out.printf("%d USD = RUB %d \n",inputDollar,convertedCurrencies.get(0));
        System.out.printf("%d USD = EUR %d\n",inputDollar,convertedCurrencies.get(1));

    }
    static ArrayList<Integer> convertDollarsToRubAndEur (int dollar) {
        ArrayList<Integer> convertedCurrencies = new ArrayList<Integer>();
        int rub = dollar * 84;
        double eur = dollar * 0.91;
        convertedCurrencies.add(rub);
        convertedCurrencies.add((int)eur);
        return convertedCurrencies;
    }
}
