package ru.Butcher.api.HomeWork3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

//Пусть дан произвольный список целых чисел.
//
//        1) Нужно удалить из него чётные числа
//        2) Найти минимальное значение
//        3) Найти максимальное значение
//        4) Найти среднее значение


public class Task3 {

    public static void main(String[] args){
        ArrayList<Integer> myRandArr1 = myArray();
        ArrayList<Integer> myRandArr2 = myArray();
        evenNums(myRandArr1);
        minMax(myRandArr2);
    }
    static Random random = new Random();
    static ArrayList<Integer> myArray(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        int size = random.nextInt(10, 21);
        for (int i =0; i < size; i++){
            arrayList.add(random.nextInt(1, 51));
        }
        return arrayList;
    }
    static void evenNums(ArrayList<Integer> array){
        System.out.println("\nПроизвольный список целых чисел: \n " + array);
        for (int i = array.size() - 1; i >= 0; i--) {
            int even = array.get(i) % 2;
            if (even == 0) {
                array.remove(i);
            }
        }
        Collections.sort(array);
        System.out.println("Список с удаленными четными числами: \n " + array + "\n");
    }

    static void minMax(ArrayList<Integer> array){
        System.out.println("\nПроизвольный список целых чисел: \n " + array + "\n");
        int min = array.get(0);
        int max = array.get(0);
        float sum = 0;
        for (int i = 0; i < array.size(); i++) {
            int num = array.get(i);
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
            sum += num;
        }
        float average = sum / array.size();
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее значение: " + average);
    }
}