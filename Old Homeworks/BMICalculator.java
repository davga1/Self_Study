import java.util.Scanner;

public class BMICalculator {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        double Weight = s.nextDouble();
        double Height = s.nextDouble();
  double c = (Weight / (Height * Height) * 10000);
  //  * 10000, 'cause  he real value is kg / m * m.but in my calculator i can't type f.e 1.82.so.i decided to use cantimeters and multiplicate at 10000(1 m = 100cm;m*m)
        System.out.println(c);
        if (c <= 18.5) {
            System.out.println("Underweight");
        } else if ((c > 18.5)&& (c <= 25)){
            System.out.println("Normal");
        } else if (c > 25 && c <= 30){
            System.out.println("Overweight");
        } else if (c > 30){
            System.out.println("Obese");
        }
    }
}