package Lesson6;

import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
           // For9. Даны два целых числа A и B (A < B). Найти сумму квадратов всех целых
//чисел от A до B включительно.
        Scanner in = new Scanner (System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        double c = 0;
        for (int i = a; i<=b; i++){
            c = c+Math.pow(i,2);
        }
        System.out.println(c);

       /* For10. Дано целое число N (> 0). Найти сумму
        1/1 + 1/2 + 1/3 + . . . + 1/N (вещественное число).
        */
/*
        Scanner in = new Scanner (System.in);
        int N = in.nextInt();
        double sum = 0;
        for (double i = 1; i <= N; i++){
            sum = sum + 1/i;
        }
        System.out.println(sum);
        */

        }
}

