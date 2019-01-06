package strings;

// Examples of manipulating strings in Java
// The Character & String classes are filled with helpful methods you can use

public class String205 {
	// Example of isLetter method
	static String justLetters(String s) {
		String ret = "";
		
		for (int ii = 0;ii<s.length();ii++) {
			if(Character.isLetter(s.charAt(ii))) {
				ret += s.charAt(ii);
			}
		}
		return ret;
	}

	// Prints the "words" in a string.  
	static void individualWords(String s) {
		String[] words = s.split(" ");       // Split sentence into words
		for (int ii = 0; ii<words.length; ii++) {
			System.out.print("[ " + ii + ":" + words[ii] + " ]");
		}
		System.out.println();
	}

	// Return a string with the vowels removed
	static String noVowels(String s) {
		String ret = "";
		for (char c : s.toCharArray()) {
			if (!isVowel(c)) {
				ret += c;
			}
		}
		return ret;
	}
	
	static boolean isVowel(Character c) {
		boolean ret = false;

		switch(Character.toLowerCase(c)) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				ret = true;
				break;
			default:
				ret = false;
		}	
		return ret;
	}
	
}
