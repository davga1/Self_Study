package CodeWars;

import java.util.Arrays;

public class Exercise1 {
    public static void main(String[] args) {
        String[] arr = {"a", "b", "c", "d"};
        String[] a = new String[arr.length];
        int counter = 1;
        for (String x : arr) {
            System.out.println(counter + ":" + x);
            a[counter - 1] = (counter + ":" + x);
            counter++;
        }
        System.out.println(Arrays.toString(a));
    }
}
