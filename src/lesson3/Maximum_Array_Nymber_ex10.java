package lesson3;

import java.util.Arrays;
import java.util.Collections;
import java.util.OptionalInt;
import java.util.Scanner;

public class Maximum_Array_Nymber_ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер масива: ");
        int n = scanner.nextInt();
        Integer array[] = new Integer[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");

        Arrays.sort(array,Collections.reverseOrder());


        System.out.println("Максимальный елемент масива = " +array[0]);

    }
}
