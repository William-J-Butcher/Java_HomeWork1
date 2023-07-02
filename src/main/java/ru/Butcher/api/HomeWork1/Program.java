package ru.Butcher.api.HomeWork1;


import java.util.Scanner;

public class Program {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            System.out.println("Укажите номер задачи: ");
            System.out.println("1 - Зфдача № 1");
            System.out.println("2 - Задача № 2");
            System.out.println("3 - Задача № 3");
            System.out.println("4 - Задача № 4");
            System.out.println("0 - Завершить работу");
            int num = Integer.parseInt(scanner.nextLine());

            switch (num) {

                case 1:
                    task1();
                    break;
                case 2:
                    task2();
                    break;
                case 3:
                    task3();
                    break;
                case 4:
                    task4();
                    break;
                case 0:
                    System.out.println("Завершение работы приложения.");
                    flag = false;
                    break;
                default:
                    System.out.println("Некорректный номер задачи. Повторите попытку ввода.");
            }


        }
    }

    //  Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
    public static void task1() {
        System.out.printf("\nВведите число n: ");
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int sum = 0;
        int multi = 1;
        for (int i = 1; i <= n; i++) {
            sum += i;
            multi *= i;
        }
        System.out.printf("Сумма чисел от 1 до %d: %d%n", n, sum);
        System.out.printf("Произведение чисел от 1 до %d: %d%n\n", n, multi);
    }
    //  Вывести все простые числа от 1 до 1000
    public static void task2(){
        for(int i = 1; i <= 1000; i++){
            boolean isPrime = true;
            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(i);
            }
        }
    }
    //  Реализовать простой калькулятор
    public static void task3 (){
        System.out.print("Введите первое число: ");
        double x = Double.parseDouble(scanner.nextLine());

        System.out.print("Введите операцию (+ - / *): ");
        char operation = scanner.nextLine().charAt(0);

        System.out.print("Введите второе число: ");
        double y = Double.parseDouble(scanner.nextLine());

        if (operation == '+'){
            System.out.printf("\n%.2f + %.2f = %.2f\n\n", x, y, plus(x, y));
        }
        if (operation == '-'){
            System.out.printf("\n%.2f - %.2f = %.2f\n\n", x, y, minus(x, y));
        }
        if (operation == '*'){
            System.out.printf("\n%.2f * %.2f = %.2f\n\n", x, y, multi(x, y));
        }
        if (operation == '/'){
            System.out.printf("\n%.2f / %.2f = %.2f\n\n", x, y, div(x, y));
        }
    }
    static double plus(double a, double b){
        return a + b;
    }
    static double minus(double a, double b){
        return a - b;
    }
    static double multi(double a, double b){
        return a * b;
    }
    static double div(double a, double b){
        return a / b;
    }


//    (дополнительное задание) Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком
//    вопроса, например, 2? + ?5 = 69. Требуется восстановить выражение до верного равенства. Предложить хотя бы одно
//    решение или сообщить, что его нет.
    public static void task4() {

        System.out.println("\nЗадано выражение: 2? + ?5 = 69 . Восстановить выражение до верного равенства.");
        int count = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (20 + i + j * 10 + 5 == 69) {
                    count += 1;
                    System.out.println(count + ") 2" + i + " + " + j + "5" + " = 69");
                }
            }
        }
        System.out.println("\n");
        if (count == 0) {
            System.out.println("Решений нет\n");
        }
    }
}