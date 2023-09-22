//Строков Владимир

package com.jagmes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner insert = new Scanner(System.in);
        System.out.println("Вас приветстует калькулятор Т-1000.");
        System.out.println("Введте первое целое число.");
        int x = insert.nextInt();
        System.out.println("Введте второе целое число.");
        int y = insert.nextInt();
        //складываем
          int sum = x+y;
          // вычетаем
         int z= x-y;
         // multyply
        int m =x*y;
        // делим
        int d = x/y;
        System.out.println("Результаты операций на числами:");
        System.out.printf("Сложение: %d + %d = %d", x, y , sum);
        System.out.printf("\n Вычетание: %d - %d = %d", x, y , z);
        System.out.printf("\n Умножение: %d * %d = %d", x, y , m);
        System.out.printf("\n Деление: %d / %d = %d", x, y , d);
    }
}
