package lesson3;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvedite chislo x");
        int x = scanner.nextInt();
        System.out.println("Vvedite chislo n");
        int n = scanner.nextInt();

        System.out.println("Степень от числа х = "+Math.pow(x,n));
    }
}
