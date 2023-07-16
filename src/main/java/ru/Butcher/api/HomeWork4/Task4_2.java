package ru.Butcher.api.HomeWork4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

/*
 * Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя.
 */
public class Task4_2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,2,3,4,5));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввод элемента:");
        enqueue(list, scanner.nextInt());
        System.out.println(list);
        System.out.println(dequeue(list));
        System.out.println(list);
        System.out.println(first(list));
        System.out.println(list);
        scanner.close();
    }
    public static void enqueue(LinkedList<Integer> list, int element){
        list.add(element);
    }
    public static int dequeue(LinkedList<Integer> list){
        int a = list.getFirst();
        list.removeFirst();
        return a;
    }
    public static int first(LinkedList<Integer> list){
        return list.getFirst();
    }
}
