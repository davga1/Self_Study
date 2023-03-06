import java.util.Scanner;

public class _54321 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        System.out.print("[");
        for (int i = n; i >0 ; i--) {
            System.out.print(i + " ");
        }
        System.out.println("]");
    }
}
