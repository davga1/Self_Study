import java.util.Scanner;

public class FromCelsiusTo {
public static void main(String [] args){
Scanner s = new Scanner(System.in);
System.out.println("Enter your value"); 
double c = s.nextDouble();
System.out.println("In Fahrenheits it equals");
double e = (c *9/5 + 32);
System.out.print(e + "F"); 
}
}