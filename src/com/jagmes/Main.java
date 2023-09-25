//Строков Владимир

package com.jagmes;

import java.io.Console;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner insert = new Scanner(System.in);
        System.out.println("Вас приветстует калькулятор Т-1000.");
        System.out.println("Вы хотите воспользоваться калькулятором? 1-д, 2-н");
         int ans = insert.nextInt();
        if (ans == 1) {
            System.out.println("Введите первое целое число.");
            int x = insert.nextInt();
            System.out.println("Введите второе целое число.");
            int y = insert.nextInt();
            System.out.println("выберите операцию: 1: +, 2: -, 3: *, 4: /.");
            char operation = (char) insert.nextInt();
            switch (operation) {
                case 1:
                    int sum = x + y;
                    System.out.printf("Сложение: %d + %d = %d", x, y, sum);
                    break;
                case 2:
                    int z = x - y;
                    System.out.printf(" Вычетание: %d - %d = %d", x, y, z);
                    break;
                case 3:
                    int m = x * y;
                    System.out.printf(" Умножение: %d * %d = %d", x, y, m);
                    break;
                case 4:
                    int d = x / y;
                    System.out.printf(" Деление: %d / %d = %d", x, y, d);
                    break;
                default:
                    return;
            }
        }
        else  {
            System.exit(0);
        }










    }
}
