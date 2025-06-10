package org.example.l2;


import java.util.Objects;
import java.util.Scanner;

/**
 * Задание 1: Преобразование температуры по Цельсию к Фаренгейту и обратно  °F = (°C × 1.8) + 32   °C = (°F − 32) × 0.5
 **/

public class Exc1 {
    public static void main(String[] args) throws IllegalArgumentException {

        Scanner scanner = new Scanner(System.in);
        double inputTemperature;
        String result = "";

        System.out.println("---------------WELCOME TO THE TEMPERATURE CONVERTER!-------------");
        System.out.print("Choose temperature scale (C - Celsius, F - Fahrenheit): ");
        String choice = scanner.nextLine().toUpperCase().strip();

        System.out.print("Enter degrees: ");
        inputTemperature = scanner.nextDouble();

        if (Objects.equals(choice, "C")) {
            result = String.format("%.1f Celsius = %.1f Fahrenheit",inputTemperature,toCelsius(inputTemperature));
        }else if (Objects.equals(choice,"F")) {
            result = String.format("%.1f Fahrenheit = %.1f Celsius",inputTemperature,toFahrenheit(inputTemperature));
        }else
            throw new IllegalArgumentException("Enter one of the suggested letters!");

        System.out.println(result);
    }



    static double toFahrenheit(double temperatureC){
        return (temperatureC * 1.8) + 32;
    }

    static double toCelsius(double temperatureF){
        return (temperatureF - 32) * 0.5;
    }
}