import java.util.Scanner;

public class consecutive {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = {s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt()};
        for (int i = 0; i <= arr.length; i++) {
            if (arr[i+1] - arr[i] != 1) {
                System.out.println("Your consencutive number is " + arr[i+1]);
                break;
            }
        }
    }
}
