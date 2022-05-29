package lesson2;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        int sum = 0;
        double avg = 0;
        System.out.println("Введите количество чисел");
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < number; i++) {
            System.out.println("Введите число ");
            int chislo = Integer.parseInt(scanner.nextLine());
            sum = sum + chislo;

        }
        avg = (double) sum / number;

        System.out.println("Среднее арфметическое число " + number + " чисел = " + avg);
    }
}
