import java.util.Scanner;

public class testWork2 {
    public static void main(String[] args) {
        //Because Nathan knows it is important to stay hydrated, he drinks 0.5 litres of water per hour of cycling.
        //You get given the time in hours and you need to return the number of litres Nathan will drink, rounded to the smallest value.
        //For example:
        //time = 3 ----> litres = 1
        //time = 6.7---> litres = 3
        //time = 11.8--> litres = 5
        Scanner s = new Scanner(System.in);

        double litres = 0.5;
        int n = s.nextInt();
        System.out.println( (int)(n * litres));
    }
}
