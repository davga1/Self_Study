package CodeWars;

import java.util.Arrays;

//Encrypt
//The first letter must be converted to its ASCII code.
//The second letter must be switched with the last letter
public class Exercise10 {
    public static void main(String[] args) {
        System.out.println(encryptThis("Hello"));
    }

    public static String encryptThis(String text) {
        // Implement me! :)
        int ascii = text.charAt(0);
        String word = "";
        for (int i = 1; i < text.length(); i++) {
            word += text.charAt(i);
        }
        System.out.println(word);
        char firstLetter = word.charAt(0);
        System.out.println(firstLetter);
        String newText = text.replace(text.charAt(0), text.charAt(text.length() - 1));
        newText = newText.replace(newText.charAt(text.length() - 1), firstLetter);
        String finText = ascii + newText;
        return finText;
    }
}
