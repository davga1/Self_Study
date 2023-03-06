import java.util.Scanner;

public class firstString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String word = s.next();
        int num = s.nextInt();

        for (int i = 1;i <=num;i++){
            System.out.print(word + " ");
        }
    }
}
