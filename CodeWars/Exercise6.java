package CodeWars;

import java.util.Arrays;
import java.util.Scanner;

//Given a set of numbers, return the additive inverse of each. Each positive becomes negatives, and the negatives become positives.
//
//invert([1,2,3,4,5]) == [-1,-2,-3,-4,-5]
//invert([1,-2,3,-4,5]) == [-1,2,-3,4,-5]
//invert([]) == []
public class Exercise6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your array size");
        int size = s.nextInt();
        int[] arr1 = new int[size];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Enter a number");
            arr1[i] = s.nextInt();
        }
        System.out.println(Arrays.toString(func(arr1)));
    }

    static int[] func(int[] arr) {
        int[] arrFinal = new int[arr.length];
        for (int i = 0; i < arrFinal.length; i++) {
            arrFinal[i] = arr[i] * -1;
        }
        return arrFinal;
    }
}
