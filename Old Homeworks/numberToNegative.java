import java.util.Scanner;

public class numberToNegative {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int RandomNumber = s.nextInt();
        if (RandomNumber > 0) {
            int FinalNumber = RandomNumber * -1;
            System.out.println("Your number is " + RandomNumber + "," + "So,we make it negative and now it is " + FinalNumber);
        } else if (RandomNumber == 0) {
            System.out.println("Your number is  0,so we did nothing.Take your" + " " + 0 + " " + "Back");
        } else
            System.out.println("Your number is already negative,so we did nothing.Take your " + " " + RandomNumber + " " + "Back");
    }
}
