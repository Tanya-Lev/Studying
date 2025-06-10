package org.example.l2;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Задание 2: Конвертер валют Доллар к Рублю и к Евро (1$ = 84RUB, 1$ = 0.91EUR)
 **/

public class Exc2upd2 {

    private enum CurrencyKey{
        RUB,EUR,USD
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int inputDollar;


        System.out.println("--------------WELCOME TO THE CURRENCY CONVERTER!-------------");
        System.out.println("Here you can convert dollars to rubles (RUB) and euros (EUR).");
        System.out.print("Enter the amount of dollars (USD): ");
        inputDollar = scanner.nextInt();

        HashMap<Exc2upd2.CurrencyKey,Double>  convertedCurrencies = convertDollarsToRubAndEur(inputDollar);

        System.out.printf("%d USD = RUB %f \n",inputDollar,convertedCurrencies.get(Exc2upd2.CurrencyKey.RUB));
        System.out.printf("%d USD = EUR %f",inputDollar,convertedCurrencies.get(Exc2upd2.CurrencyKey.EUR));
    }


    static HashMap<Exc2upd2.CurrencyKey,Double> convertDollarsToRubAndEur (int dollar) {
        HashMap<Exc2upd2.CurrencyKey,Double> convertedCurrencies = new HashMap<>();
        double rub = dollar * 84.0;
        double eur = dollar * 0.91;
        convertedCurrencies.put(Exc2upd2.CurrencyKey.RUB,rub);
        convertedCurrencies.put(Exc2upd2.CurrencyKey.EUR,eur);
        return convertedCurrencies;
    }

}
