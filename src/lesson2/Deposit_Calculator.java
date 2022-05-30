package lesson2;

import java.util.Scanner;

public class Deposit_Calculator {
    public static void main(String[] args) {
        double money, procent, years;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько денег вы хотите положить?");
        money = Double.parseDouble(scanner.nextLine());
        System.out.println("Под какой процент?");
        procent = Double.parseDouble(scanner.nextLine());
        System.out.println("На сколько лет?");
        years = Double.parseDouble(scanner.nextLine());
        procent = procent / 100;
        double nakop = 0;
        for (int i = 1; i <= years; i++) {
            nakop = money * (Math.pow((1 + procent / 12), (double) 12 * i));
            System.out.println("За " + i + " год ваша сума будет: " + nakop);
        }


    }
}

