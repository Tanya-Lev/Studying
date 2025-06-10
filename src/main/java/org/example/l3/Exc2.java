package org.example.l3;

import java.util.Scanner;

/**Введите стоимость товара и кол-во рублей, которые есть у вас. Выведете сколько вы сможете купить товара.**/

public class Exc2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int inputMoney;
        int inputCondomCost;

        System.out.println("Here you can set the price for 1 condom and then find out how much you can afford with your worthless pennies.\n");

        System.out.print("Enter the amount of money: ");
        inputMoney = scanner.nextInt();

        System.out.print("Enter the cost of 1 condom: ");
        inputCondomCost = scanner.nextInt();


        System.out.printf("With your worthless %d rubles you can buy %d condoms.", inputMoney, getAffordableQuantity(inputMoney,inputCondomCost));


    }

    static int getAffordableQuantity (int money, int condomCost){
        return money / condomCost;
    }
}
