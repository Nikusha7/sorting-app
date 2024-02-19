package ge.nika.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter 10 integer numbers: ");
        Scanner scanner = new Scanner(System.in);
        int[] values = new int[10];
        for (int i = 0; i < 10; i++) {
            values[i] = scanner.nextInt();
        }

        Sorter sorter = new Sorter();

        System.out.println("Sorted Values:");
        System.out.println(Arrays.toString(sorter.sort(values)));
    }


}