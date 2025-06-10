package org.example.l6;

import java.util.Arrays;

/**
 * Сортировка пузырьком
 **/

public class Exc3 {
    public static void main(String[] args) {
        int[] array = {12, -7, 48, 2, 6, 0, 1, 27};

        for (int i = array.length - 1; i > 0; i--) {

            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }

        }

        System.out.println(Arrays.toString(array));
    }

}
