package lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class Smallest_Array_Number_Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер масива: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
        Arrays.sort(array);
        System.out.println("Минимальный  елемент масива = " + array[0]);

    }
}
