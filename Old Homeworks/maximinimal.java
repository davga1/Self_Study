import java.util.Scanner;

public class maximinimal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = {s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt()};
        int maxNum = arr[0];
        int minNum = arr[0];
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxNum) {
                maxNum = arr[i];
            } if (arr[i] < minNum) {
                minNum = arr[i];
            }
        }System.out.println("Max number is " + maxNum);
        System.out.println("Min number is " + minNum);
        for (int i = 0; i < arr.length; i++) {
            counter += arr[i];
        }  System.out.println(counter - maxNum - minNum);
    }
}
