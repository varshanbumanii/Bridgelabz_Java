package Viva1;

import java.util.Scanner;
import java.util.Arrays;

public class Alternatives {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr1 = new int[5];
        int[] arr2 = new int[5];

        System.out.print("Enter array 1: ");
        for (int i = 0; i < 5; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter array 2: ");
        for (int i = 0; i < 5; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] result = new int[10];
        int index = 0;

        for (int i = 0; i < 5; i++) {
            result[index++] = arr1[i];
            result[index++] = arr2[i];
        }

        System.out.println(Arrays.toString(result));
        sc.close();
    }
}

