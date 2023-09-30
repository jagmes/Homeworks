//Строков Владимир

package com.jagmes;

import java.util.Random;
import java.util.Scanner;

public class Main {

    //функция суммы

    static void sumRes(int a,int b){
        int s= a+b;
        System.out.println("результат сложения: "+s);

    }
            //функция разность
    static void diff(int a, int b){
        int d= a-b;
        System.out.println("Результат вычетания: "+d);
    }
           // функция умножения
    static void multiply(int a, int b){
        int m=a*b;
        System.out.println(":результат умножения: "+m);
    }
        // функция деления
    static void division(int a, int b){
        int div = a/b;
        System.out.println("результат деления: " +div);
    }

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
               System.out.println("\n------------");

            System.out.println("\nВведите первое целое число.");
            int a = insert.nextInt();
            System.out.println("Введите второе целое число.");
            int b = insert.nextInt();
            System.out.println("выберите операцию: 1: +, 2: -, 3: *, 4: /.");
            char operation = (char) insert.nextInt();



            switch (operation) {
                case 1:
                       sumRes(a,b);

                  //  System.out.printf("Сложение: %d + %d = %d", x, y, );
                    break;
                case 2:
                  diff(a,b);
                    break;
                case 3:
                   multiply(a,b);
                    break;
                case 4:
                   division(a,b);
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
               // обход ошибки с делением на ноль.
                if(sum!=0){
                aver = sum/array[i];}
            }
            System.out.println("\nКоличество отрицательных элементов: "+neg);

            System.out.println("Количество положительных элементов: " +pos);

            System.out.println("Количество нулей: "+x);

            System.out.println("Среднее по массиву:  " +aver);

        }


    }
}
