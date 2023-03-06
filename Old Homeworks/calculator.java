import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your first number");
        double cal1 = s.nextDouble();
        String act = s.next();
        switch (act) {
            case "+":
                System.out.println("Enter your second number");
                double cal2 = s.nextDouble();
                System.out.println((int) cal1 + "+" + (int) cal2 + "=" + (int) (cal1 + cal2));
                break;
            case "-":
                System.out.println("Enter your second number");
                cal2 = s.nextDouble();
                System.out.println((int) cal1 + "-" + (int) cal2 + "=" + (int) (cal1 - cal2));
                break;
            case "*":
                System.out.println("Enter your second number");
                cal2 = s.nextDouble();
                System.out.println((int) cal1 + "*" + (int) cal2 + "=" + (int) (cal1 * cal2));
                break;
            case "/":
                System.out.println("Enter your second number");
                cal2 = s.nextDouble();
                if (cal1/cal2 % 1 == 0 ) {
                        System.out.println((int) cal1 + "/" + (int)cal2 + "=" + (int)(cal1 / cal2));

                    }else System.out.println((int) cal1 + "/" + (int)cal2 + "=" + (cal1 / cal2));
                }
        }
    }
