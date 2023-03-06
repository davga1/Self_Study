import java.util.Scanner;

public class testreverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = { s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt()};
        for (int i = arr.length-1;i>=0;i--){
            System.out.print(arr[i] + " ");
        }
    }
}
