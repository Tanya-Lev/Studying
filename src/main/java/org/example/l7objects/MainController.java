package org.example.l7objects;

import org.example.l7objects.entity.Cat;

public class MainController {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Sam",5,7,10);
        Cat cat2 = new Cat("Bim", 1,2,3);
        Cat cat3 = new Cat("Kiki",6,8,10);

        System.out.println(cat1.fight(cat3));
        System.out.println(cat3.fight(cat1));
        System.out.println(cat2.fight(cat3));
    }
}
