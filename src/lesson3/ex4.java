package lesson3;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        int i = 1; //Задание №1
        do {
            System.out.println(i);
            i = i + 2;
        } while (i <= 100);

        Scanner scanner = new Scanner(System.in); //Задание №2
        System.out.println("Vvedite chislo");
        int n = scanner.nextInt();
        int c = 1;
        int fact = 1;
        do {
            fact = fact * c;
            c++;
        } while (c <= n);
        System.out.println("Факториал = "+ fact);

    }
}
