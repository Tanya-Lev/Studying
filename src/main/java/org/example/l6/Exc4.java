package org.example.l6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Найти число, повторяющееся большее количество раз
 **/

public class Exc4 {
    public static void main(String[] args) {

//        int[] numbers = {1, 1, 2, 2, 2, 3, 5, 7};
//        Arrays.sort(numbers);
//
//        int mostFrequent = numbers[0];
//        int maxCount = 1;
//        int currentCount = 1;
//
//        for (int i = 0; i < numbers.length - 1; i++) {
//            if (numbers[i] == numbers[i + 1]) {
//                currentCount++;
//            } else currentCount = 1;
//
//            if (currentCount > maxCount) {
//                maxCount = currentCount;
//                mostFrequent = numbers[i];
//            }
//        }
//        System.out.println(mostFrequent);

        //----------------------ИЛИ--------------------

        Integer[] numbers2 = {12, 7, 0, 3, 1, 48, 2, 6, 2, 3, 1, 1, 0, 1, 27, 2, 3};
        Map<Integer, Integer> numToCount = new HashMap<>();

        for (int i = 0; i < numbers2.length; i++) {
            numToCount.put(numbers2[i], 0);
        }

        for (int i = 0; i < numbers2.length; i++) {
            numToCount.put(numbers2[i], numToCount.get(numbers2[i] + 1));
        }
        int max = Integer.MIN_VALUE;

//        for (Integer value : numToCount.values()) {
//            if (value > max)
//                max = value;
//        }
//        System.out.println(max);



    }
}
