package lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class Swap_Largest_And_Smallest_Elements_Of_Array_Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер масива: ");
        int n = scanner.nextInt();
        int[] array= new int[n];
        System.out.println("Начальный массив ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }
        int max = array[0];
        int min = array[0];
        int maxInd = 0;
        int minInd = 0;
        for (int i = 0; i < array.length; i++) {
            if (max > array[i]) {
                maxInd = i;
                max = array[i];
            }
            if (min < array[i]) {
                minInd = i;
                min = array[i];
            }
        }
        System.out.println(" ");
        System.out.println("Измененный масив ");

        int temp = array[minInd];
        array[minInd] = array[maxInd];
        array[maxInd] = temp;
        Arrays.stream(array).forEach(e-> System.out.print(e+" "));


    }

}

