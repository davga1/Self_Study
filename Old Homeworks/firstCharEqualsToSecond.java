

import java.util.Scanner;
//Check to see if a string has the same amount of 'x's and 'o's. The method must return a boolean and be case insensitive. The string can contain any char.
public class firstCharEqualsToSecond {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int counter1 = 0;
        int counter2 = 0;
        System.out.println("Enter first character");
        char firstChar = s.next().charAt(0);
        System.out.println("Enter second character");
        char secondChar = s.next().charAt(0);
        System.out.println("Enter your array");
        char[] arr = {s.next().charAt(0),s.next().charAt(0)};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == firstChar)counter1++;
            if (arr[i] == secondChar)counter2++;
        }
        boolean firstEqualsSecond = counter1 == counter2;
        System.out.println("\"" + firstChar +"\" " + "in your array is equal to" + " \"" + secondChar  + "\":" + firstEqualsSecond);

    }
}
