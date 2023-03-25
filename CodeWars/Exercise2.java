package CodeWars;

import java.util.Scanner;
import java.util.ArrayList;

//The number
//89
//89 is the first integer with more than one digit that fulfills the property partially introduced in the title of this kata.
// What's the use of saying "Eureka"? Because this sum gives the same number:89=8^1+9^2
//The next number in having this property is 135
//See this property again:
//135=1^1+3^2+5^3
//Task
//We need a function to collect these numbers, that may receive two integers
//[a,b] (inclusive) and outputs a list of the sorted numbers in the range that fulfills the property described above.
//Examples
//Let's see some cases (input -> output):
//
//1, 10  --> [1, 2, 3, 4, 5, 6, 7, 8, 9]
//1, 100 --> [1, 2, 3, 4, 5, 6, 7, 8, 9, 89]
//If there are no numbers of this kind in the range
//[a,b]
//[a,b] the function should output an empty list.
public class Exercise2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter startNumber");
        int a = s.nextInt();
        System.out.println("Enter endNumber");
        int b = s.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = a; i <= b; i++) {
            if (i == Eureka(i)) arr.add(i);
        }
        System.out.println("numbers that match the requirement:" + arr);
    }

    static int Eureka(int num) {
        String NUM = num + "";
        int e = NUM.length();
        if (num < 10) return num;
        return (int) Math.pow(num % 10, e) + Eureka(num / 10);
    }
}