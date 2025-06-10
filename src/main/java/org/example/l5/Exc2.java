package org.example.l5;

import java.util.Scanner;

/**
 * Посчитать НОД, НОК.
 * Алгоритм Евклида:
 * Иногда, особенно для больших чисел, удобнее использовать алгоритм Евклида для нахождения НОД. Он основан на последовательном делении с остатком:
 * Делим большее число на меньшее.
 * Если остаток равен 0, то меньшее число является НОД.
 * Если остаток не равен 0, то меньшее число становится делителем, а остаток — делимым, и продолжаем деление до тех пор, пока остаток не станет 0.
 * Например, чтобы найти НОД(12, 18) алгоритмом Евклида:
 * 18 / 12 = 1 (остаток 6)
 * 12 / 6 = 2 (остаток 0)
 * НОД(12, 18) = 6
 **/

public class Exc2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1, num2;

        System.out.println("Vvedite 2 chisla dlya vichisleniya NOD, NOK:");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        int _num1 = num1;
        int _num2 = num2;

        while (num2 != 0) {
            num1 %= num2;
            int temp = num1;
            num1 = num2;
            num2 = temp; //swap(num1, num2)
        }

        int NOD = num1;
        int NOK = _num1 * _num2 / NOD;

        System.out.printf("NOD: %d\n", NOD);
        System.out.printf("NOK: %d\n", NOK);

    }

}
