package CodeWars;

import java.util.Scanner;

//In this kata you get the start number and the end number of a region and should return the count of all numbers except numbers with a 5 in it. The start and the end number are both inclusive!
//
//Examples:
//
//1,9 -> 1,2,3,4,6,7,8,9 -> Result 8
//4,17 -> 4,6,7,8,9,10,11,12,13,14,16,17 -> Result 12
//The result may contain fives. ;-)
//The start number will always be smaller than the end number. Both numbers can be also negative!
public class Exercise3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number");
        int start = s.nextInt();
        System.out.println("Enter last number");
        int end = s.nextInt();
        System.out.println(dontGiveMeFive(start, end));
    }

    static int dontGiveMeFive(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            String N = i + "";
            if (!N.contains("5")) {
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.print("\nResult:");
        return count;
    }
}
