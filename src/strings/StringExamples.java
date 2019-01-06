package strings;

// Examples of manipulating strings
import java.util.Scanner;

public class StringExamples {

	public static void main(String[] args) {
		
	    String str1 = "The sooner you get behind in your work, the more time you have to catch up.";
	    String str2 = "The speed of a non-working program is irrelevant.";

	    // Examples of string operations
	    System.out.println("Original String 1: " + str1);
	    System.out.println("   Letters only: " + String205.justLetters(str1));
	    System.out.println("   Vowels removed: " + String205.noVowels(str1));
	    System.out.print("   Individual words: ");
	    String205.individualWords(str1);
	    System.out.println();

	    System.out.println("\nOriginal String 2: " + str2);
	    System.out.println("   Letters only: " + String205.justLetters(str2));
	    System.out.println("   Vowels removed: " + String205.noVowels(str2));
	    System.out.print("   Individual words: ");
	    String205.individualWords(str2);
	    System.out.println();
	}

}
