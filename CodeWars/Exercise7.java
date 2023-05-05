package CodeWars;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your array size");
        int size = s.nextInt();
        int[] arr1 = new int[size];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Enter a number");
            arr1[i] = s.nextInt();
        }
        System.out.println(Arrays.toString(countPositivesSumNegatives(arr1)));
    }

    public static int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) return new int[]{};
        int positiveCount = 0;
        int negativeSum = 0;
        for (int j : input) {

            if (j > 0) {
                positiveCount++;
            }
            if (j < 0) {
                negativeSum += j;
            }
        }
        return new int[]{positiveCount, negativeSum};
    }
}
