package CodeWars;

//In this kata, you are asked to square every digit of a number and concatenate them.
//
//For example, if we run 9119 through the function, 811181 will come out, because 9^2 is 81 and 1^2 is 1. (81-1-1-81)
//
//Example #2: An input of 765 will/should return 493625 because 7^2 is 49, 6^2 is 36, and 5^2 is 25. (49-36-25)
//
//Note: The function accepts an integer and returns an integer.
public class Exercise5 {
    public static void main(String[] args) {
        int num = 9119;
        System.out.println(func(num));
    }
    static int func(int num){
        int count = 1;
        while (num > 10){
            num /= 10;
            count++;
        }
        int[] arr = new int[count];
        for (int i = 0;i < arr.length;i++){
            arr[i] = num%10;
            num /= 10;
        }
        return count;
    }
}
