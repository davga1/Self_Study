import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int i;
        int a= s.nextInt();
        System.out.println("Enter the number limit (f.e. 15-final num is \"number\" *15");
        int b = s.nextInt();
        for (i = 1;i<= b;i++) {
            System.out.println(a  + "*" +  i + "=" + a*i);
        }

    }
}