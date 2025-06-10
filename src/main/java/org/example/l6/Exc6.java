package org.example.l6;

import java.util.Arrays;

/**
 * Найти среднее арифметическое массива чисел
 **/

public class Exc6 {
    public static void main(String[] args) {
        int[] array = {12, 7, 0, 3, 1, 48, 2, 6, 2, 3, 1, 1, 0, 1, 27, 2, 3}; //17
        int sum = 0;
        double arithmeticMean;

        for (int i : array) {
            sum = sum + i;
        }

        arithmeticMean = (double) sum / array.length;

        System.out.println("\n" + Arrays.toString(array));
        System.out.println("Arithmetic mean: " + arithmeticMean);

    }

}

