package CodeWars;

import java.util.Arrays;

public class Exercise9 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(digitize(0)));
    }
    public static int[] digitize(long n) {
        if (n == 0){
            return new int[]{0};
        }
        String f = n + "";

        int[] arr = new int[f.length()];
        for (int i = 0;i <f.length();i++){
            arr[i] = (int) (n%10);
            n /= 10;
        }
        return arr;
    }
}
