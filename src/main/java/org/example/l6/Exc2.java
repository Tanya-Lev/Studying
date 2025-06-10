package org.example.l6;

import java.util.Arrays;

/**
 * Найти нужный эл-т массива. Если такого эл-та нет, то вывести -1
 **/

public class Exc2 {
    public static void main(String[] args) {

        int[] numbers = {12, 7, 0, 3, 1, 48, 2, 6, 2, 3, 1, 1, 0, 1, 27, 2, 3};

        int searchNum = 49;

        System.out.println("\n" + Arrays.toString(numbers));


        boolean isContains = false;
        int findedNumber = -99999;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == searchNum){
                isContains = true;
                findedNumber = numbers[i];
                break;
            }
        }
        if(isContains)
            System.out.println(findedNumber);
        else
            System.out.println("-1");

        //--------------ИЛИ-------------


        int findedNumber_ = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == searchNum) {
                findedNumber_ = numbers[i];
                break;
            }
        }
        System.out.println(findedNumber_);


//        boolean resultSearchNumber = Arrays.stream(numbers).anyMatch( currentNumber -> currentNumber == searchNum);
//        if(resultSearchNumber == true)
//            System.out.println(resultSearchNumber);
//        else
//            System.out.println("-1");

    }
}
