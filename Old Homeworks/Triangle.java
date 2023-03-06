import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first angle");
        int alfa = s.nextInt();
        System.out.println("Enter second angle");
        int beta = s.nextInt();
        int gamma = 180 - alfa - beta;

        System.out.println("Your third angle of the Triangle is " + gamma);
    }
}
