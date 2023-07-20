package ru.Butcher.api.HomeWork6;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Cat> catSet = new HashSet<>();

        Cat cat1 = new Cat("Том", 3);
        Cat cat2 = new Cat("Васька", 2);
        Cat cat3 = new Cat("Том", 3);
        Cat cat4 = new Cat("Мурзик", 5);

        catSet.add(cat1);
        catSet.add(cat2);
        catSet.add(cat3);
        catSet.add(cat4);

        System.out.println("Original Set:");
        for (Cat cat : catSet) {
            System.out.println(cat);
        }

    }
}
