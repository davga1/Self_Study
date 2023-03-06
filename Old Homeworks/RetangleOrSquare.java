import java.util.Scanner;
public class RetangleOrSquare {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        if ( a*2 != b*2){
            int perimeter = a*2 + b*2;
            System.out.println(perimeter);
        }else if (a*2 == b*2){
            int area = a * a;
            System.out.println(area);}
    }
}
