package lesson2;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        double money, procent, years;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько денег вы хотите положить?");
        money = Double.parseDouble(scanner.nextLine());
        System.out.println("Под какой процент?");
        procent = Double.parseDouble(scanner.nextLine());
        System.out.println("На сколько лет?");
        years = Double.parseDouble(scanner.nextLine());
        procent = procent/100;
        double messyacov = 12*years;
        double nakop= money*(Math.pow((1+procent/12),messyacov));
        System.out.println(nakop);



    }
}
