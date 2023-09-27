//Строков Владимир

package com.jagmes;

import java.io.Console;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] array = new int [50];
        Random random = new Random();

        Scanner insert = new Scanner(System.in);
        System.out.println("Вас приветстует калькулятор Т-1000.");
        System.out.println("Калькулятор - 1 , 2- рандомайзер");
         int ans = insert.nextInt();
        if (ans == 1) {
            //Калькулятор
            while(true){
                System.out.println("\n-----Выход: q-------");
                // На будущее...
               // if("q".equals(insert)){
                //    System.exit(0); //Выход при нажатии q
               // }
            System.out.println("\nВведите первое целое число.");
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
        }

        else  {
            // рандомайзер
            int neg = 0;
            int pos =0;
            int x=0;
            int sum = 0;
            int aver =0;
            System.out.println("Заполнили массив случайными числами:");
            for( int i=0; i <array.length-1; i++) {

              array[i] = random.nextInt(101)-50;

              System.out.print(array[i] + ";  " );
              if (array[i]<0){
                  neg += 1;
              }

              if (array[i]>0){
                  pos += 1;
              }
              if(array[i]==0){
                  x +=1;
              }

              sum += array[i];

                aver = sum/array[i];
            }
            System.out.println("\nКоличество отрицательных элементов: "+neg);


            System.out.println("Количество положительных элементов: " +pos);


            System.out.println("Количество нулей: "+x);

            System.out.println("Среднее по массиву:  " +aver);




        }










    }
}
