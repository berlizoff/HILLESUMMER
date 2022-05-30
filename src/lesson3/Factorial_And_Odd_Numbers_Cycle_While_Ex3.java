package lesson3;

import java.util.Scanner;

public class Factorial_And_Odd_Numbers_Cycle_While_Ex3 {
    public static void main(String[] args) {
        int i = 1; //Задание №1
        while (i <= 100) {
            System.out.println(i);
            i = i + 2;
        }
        Scanner scanner = new Scanner(System.in); //Задание №2
        System.out.println("Vvedite chislo");
        int n = scanner.nextInt();
        int fact = 1;
        int c = 1;
        while (c <= n) {
            fact = fact * c;
            c++;
        }
        System.out.println(fact);
    }
}