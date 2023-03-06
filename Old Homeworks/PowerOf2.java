import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int counter = 1;
        for (int i = 1; i <= n ; i++) {
            System.out.print(  2 * counter + " ");
            counter +=counter;
        }
    }
}
