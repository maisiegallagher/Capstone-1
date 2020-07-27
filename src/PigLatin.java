import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		String input;

		do {
			System.out.println("Enter a word to be translated to Pig Latin:");
			String word = scnr.nextLine().toLowerCase();

			if (containsVowels(word.substring(0, 1))) {
				System.out.println(word + "way");
			} else {
				if (containsVowels(word)) {
					System.out.println(word.substring(1, word.length()) + word.substring(0, 1) + "ay");
				} else
					System.out.println("INVALID");
			}
			System.out.println("Would you like to translate another word? (y/n)");
			input = scnr.nextLine();

		} while (input.equalsIgnoreCase("y"));

		System.out.println("Goodbye!");
		scnr.close();

	}

	public static boolean containsVowels(String word) {
		String[] vowels = { "a", "e", "i", "o", "u" };
		for (int i = 0; i < vowels.length; i++) {
			if (word.contains(vowels[i]) || word.contains(vowels[i].toLowerCase()))
				return true;
		}
		return false;
	}
}
