package work;
//A pangram is a sentence that contains every single letter of the alphabet at least once.
// For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram, because it uses the letters A-Z at least once (case is irrelevant).
//Given a string, detect whether it is a pangram. Return True if it is, False if not. Ignore numbers and punctuation.

import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your sentence");
        String word = s.nextLine();
        String[] w = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        int counter1 = 0;
        int counter2 = 0;
        for (int i = 0; i < w.length; i++) {
            if (word.equalsIgnoreCase(w[i]))
                counter1++;
            for (int j = w.length-1; j >= 0 ; j--) {
                if (w[i].equalsIgnoreCase(w[j]))
                    counter2--;
            }
        }counter1 -= counter2;
        System.out.println(counter1 == 26);
    }
}