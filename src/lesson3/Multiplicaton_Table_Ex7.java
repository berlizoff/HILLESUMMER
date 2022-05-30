package lesson3;

import java.util.Scanner;

public class Multiplicaton_Table_Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvedite chislo ");
        int x = scanner.nextInt();
        for (int i = 0; i < 10; i++) {

            System.out.println(x + "*" + i + "=" + x * i);

        }
    }
}
