import java.util.Scanner;

public class Doubler {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int r = 0;
        System.out.println("Выберите число");
        int p = s.nextInt();
        System.out.println("Выберите до какой цифры хотите удвоить полученный результат");
        int l = s.nextInt();
        while (p <=l) {
            System.out.print(p + " ");
            p *= 2;
            r++;
        }
            System.out.println("\nЦифра была удвоена" + " " + r + "раз");
    }
}
