import java.util.Scanner;
public class VolumeCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your cuboids length");
        double length = s.nextDouble();
        System.out.println("Enter your cuboids width");
        double width = s.nextDouble();
        System.out.println("Enter your cuboids height");
        double height = s.nextDouble();

        double volume = length * width * height;
        if (volume % 1 == 0)
            System.out.println("Your cuboids volume is " + (int)volume);
        else System.out.println("Your cuboids volume is " + volume);
    }
}
