import java.util.Scanner;

public class century {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.println((num % 100 == 0) ? (num = num / 100) : (num = (num / 100) + 1));
    }
}
