package Viva1;
import java.util.Arrays;
import java.util.Scanner;

public class altvera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array 1 size::");
        int n = sc.nextInt();
        System.out.println("Enter Array 2 size::");
        int m = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        System.out.println("Enter Array 1 elements::");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter Array 2 elements::");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        int[] results = new int[n+m];
        int index = 0;
        int maxLen = Math.max(n, m);

        for (int i = 0; i < maxLen; i++) {
            if (i < n) {
                results[index++] = arr1[i];
            }
            if (i < m) {
                results[index++] = arr2[i];
            }
        }
        System.out.println(Arrays.toString(results));
    }
}
