package org.example.l6;

import java.util.Arrays;

/**
 * Найти сумму всех элементов массива
 **/

public class Exc1 {
    public static void main(String[] args) {

        int[] array = {12, 7, 0, 3, 1, 48, 2, 6, 2, 3, 1, 1, 0, 1, 27, 2, 3};
        int sum = 0;

        for (int i : array) {
            sum = sum + i;
        }

        System.out.println("\n" + Arrays.toString(array));
        System.out.println("Sum: " + sum);

    }
}
