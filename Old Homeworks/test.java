import java.util.Scanner;

// Գրենք ծրագիր, որը կտպի 1ից մինջև ինփութ արած թվերի  կենտ ու զույգ թվերի գումարը առանձին առանձին
public class test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = 1;
        int sum = 0;
        int summ = 0;
        System.out.print("Zuyg:");
        for (int i = 0; i <= n; i = i + 2) {
            int c = a * i;
            System.out.print(c + " ");
            sum += c;
        }
        System.out.println("Summ=" + sum);
        System.out.println();
        System.out.print("Kent:");
        for (int i = 1; i <= n; i = i + 2) {
            int c = a * i;
            System.out.print(c + " ");
            summ += c;
        }
        System.out.println("Summ=" + summ);
    }
}