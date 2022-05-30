package lesson3;

public class Odd_Numbers_From_Array_Ex8 {
    public static void main(String[] args) {
        int[] array = new int[20];
        for (int i = 1; i < array.length; i++) {
            array[i]= i;
            System.out.print(array[i]+", ");
            i=i+1;
        }

    }
}
