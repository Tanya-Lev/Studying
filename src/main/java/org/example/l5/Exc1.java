package org.example.l5;

import java.math.BigInteger;
import java.util.Scanner;

/** Вывести таблицу значений степеней 2, n-раз.**/

public class Exc1 {
    public static void main(String[] args) {

        final int n = 20;
        int result = 1;

        for (int i = 0; i <= n; i++) {
            if (i != 0) {
                result = result * 2;
            }
            System.out.printf("2^%d = %d\n", i, result);
        }
    }
}
