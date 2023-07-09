package ru.Butcher.api.HomeWork2;

import java.io.IOException;
import java.util.logging.*;
import java.util.Random;

public class Task2_2 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(Task2_2.class.getName());
        FileHandler fh = new FileHandler("Log.xml");
        logger.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);
        logger.info("Sort Array");
        Random rand = new Random();
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++){
            array[i] = rand.nextInt(100);
            System.out.print(array[i] + " ");
        }
        lib.printArrayInt(array);
        int[] newArr = listSort(array);
        System.out.printf("\n Отсортированный массив: \n");
        lib.printArrayInt(newArr);
    }
    public static int[] listSort(int [] arr){
        for(int i = 0; i < arr.length-1; i++) {

            for (int j = 0; j < arr.length - i-1; j++){
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
