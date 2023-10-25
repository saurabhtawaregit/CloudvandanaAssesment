/**
* @author : Saurabh Taware
* @description : Solution Class for Java Problem 
                 C)Check if the input is pangram or not. (Pangram is a sentence that contains all the alphabet
                   from a-z)
*/

import java.util.Scanner;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        scanner.close();

        boolean isPangram = isPangram(sentence);
        if (isPangram) {
            System.out.println("The sentence is a pangram.");
        } else {
            System.out.println("The sentence is not a pangram.");
        }
    }

    public static boolean isPangram(String sentence) {
        boolean[] alphabet = new boolean[52]; // Array to keep track of each alphabet (uppercase and lowercase)

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                alphabet[ch - 'A'] = true;
            } else if (ch >= 'a' && ch <= 'z') {
                alphabet[ch - 'a' + 26] = true;
            }
        }

        // Check if all letters from 'A' to 'Z' and 'a' to 'z' have been encountered
        for (int i = 0; i < 26; i++) {
            if (!(alphabet[i] && alphabet[i + 26])) {
                return false; // If any letter is missing, it's not a pangram
            }
        }

        return true; // All letters have been encountered
    }
}
