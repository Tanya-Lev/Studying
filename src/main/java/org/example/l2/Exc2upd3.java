package org.example.l2;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Задание 2: Конвертер валют Доллар к Рублю и к Евро (1$ = 84RUB, 1$ = 0.91EUR)
 **/

public class Exc2upd3 {

    /**
     * словарь КЛЮЧ-ЗНАЧЕНИЕ, где Currency это тип данных для ключа (класс enum с перечислением конвертирований),
     * а Double это тип данных для значения (в методе updateCurrency мы добавляем (.put) в эту HashMap множитель для дальнейшего умножения его на введённое значение (inputDollar))
     **/
    private static HashMap<Currency,Double> convertedCurrencies;

    public static void main(String[] args) {
        convertedCurrencies = new HashMap<>();

        updateCurrency();

        Scanner scanner = new Scanner(System.in);
        int inputDollar;



        System.out.println("--------------WELCOME TO THE CURRENCY CONVERTER!-------------");
        System.out.println("Here you can convert dollars to rubles (RUB) and euros (EUR).");
        System.out.print("Enter the amount of dollars (USD): ");
        inputDollar = scanner.nextInt();

        System.out.printf("%d USD = RUB %f \n",inputDollar,convertCurrency(inputDollar,convertedCurrencies.get(Currency.USD_RUB)));
        System.out.printf("%d USD = EUR %f\n",inputDollar,convertCurrency(inputDollar,convertedCurrencies.get(Currency.USD_EUR)));

    }


    static double convertCurrency (double value,double currency) {
        return value * currency;
    }

    private static void updateCurrency() {
        convertedCurrencies.put(Currency.RUB_USD,1.0);
        convertedCurrencies.put(Currency.RUB_EUR,2.0);
        convertedCurrencies.put(Currency.USD_RUB,3.0);
        convertedCurrencies.put(Currency.USD_EUR,4.0);
        convertedCurrencies.put(Currency.EUR_USD,5.0);
        convertedCurrencies.put(Currency.EUR_RUB,6.0);
    }
}
