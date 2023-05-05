package CodeWars;

public class Exercise8 {
    public static void main(String[] args) {
        System.out.println(dnaToRna("SITTTTTTTTTTTTTTTT"));
    }

    static String dnaToRna(String dna) {
        return dna.replaceAll("T","U");  // Do your magic!
    }
}
