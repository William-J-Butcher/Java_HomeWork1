package ru.Butcher.api.HomeWork4;

import java.util.LinkedList;
import java.util.Random;

public class Task4_1 {
    public static void main(String[] args) {
        LinkedList<Integer> lst = new LinkedList<>();
        rand_add_list(10, 100, lst);
        System.out.println("\nИсходный список: " + lst);

        LinkedList<Integer> reverse_lst = new LinkedList<>();
        reverse_list(lst, reverse_lst);
        System.out.println("\nПеревернутый список: " + reverse_lst);

    }

    public static void rand_add_list(int count, int maxValue, LinkedList<Integer> list) {
        Random rand = new Random();
        for (int i = 0; i < count; i++) {
            list.add(rand.nextInt(maxValue));
        }
    }

    public static LinkedList<Integer> reverse_list(LinkedList<Integer> list, LinkedList<Integer> new_list) {
        for (int i = 0; i < list.size(); i++) {
            new_list.add(list.peekLast());
            list.removeLast();
            i--;
        }
        return new_list;
    }
}