import java.util.Scanner;
public class testwork3 {
    public static void main(String[] args) {
        //This kata is about multiplying a given number by eight if it is an even number and by nine otherwise.
        // if even *8   if odd *9
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n == 0) {
            System.out.println("The number is zero,so it's multiplicated version is zero too");}
       else if (n % 2 == 0) {
                System.out.println("The typed number is even,so we should multiplicate it by 8" + "\nyour number is " + n + "\nThe multiplicated version is " + (n + " * " + 8) + "=" + n * 8);
            } else
                System.out.println("The typed number is odd,so we should multiplicate it by 9" + "\nyour number is " + n + "\nThe multiplicated version is " + (n + " * " + 9) + "=" + n * 9);
        }
    }


