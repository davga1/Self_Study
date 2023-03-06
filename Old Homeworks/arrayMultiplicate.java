import java.util.Scanner;

public class arrayMultiplicate {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNumber = s.nextInt();
        System.out.println("Enter second number");
        int secondNumber = s.nextInt();
        System.out.println("Your array is");
        for (int i = 1; i <= secondNumber; i++) {
            int c = firstNumber * i;
            if (firstNumber < 0 || firstNumber == 0) {
                System.out.print("nothing,please enter numbers greater than 0");
                System.exit(1);
            }
            System.out.print(c + " ");
        }
    }
}

