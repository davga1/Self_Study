package CodeWars;


//Write a function that accepts an array of 10 integers (between 0 and 9), that returns a string of those numbers in the form of a phone number.
//
//Example
//createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // => returns "(123) 456-7890"
public class Exercise4 {
    public static void main(String[] args) {

        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println(createPhoneNumber(num));
    }

    static String createPhoneNumber(int[] num) {
        return "(" + num[0] + num[1] + num[2] + ")" + " " + num[3] + num[4] + num[5] + "-" + num[6] + num[7] + num[8] + num[9];
    }
}
