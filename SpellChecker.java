import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class SpellChecker {
	private static ArrayList<String> dictionary = new ArrayList<String>();
	
	public static void main(String args[]) throws FileNotFoundException {
		System.out.println("Welcome to our spell checker!");
		File dictionaryFile = new File ("words.txt");
		Scanner scanner = new Scanner(dictionaryFile);
		while (scanner.hasNextLine()) {
			String word = scanner.nextLine().toUpperCase();
			dictionary.add(word);
		}
		scanner.close();
		System.out.println("Dictionary is loaded and ready for use.");
		System.out.println("Please edit the file 'spellcheckme.txt' with the text"
				+ " you would like checked (the file can be found in "
				+ "the same directory as this spell checker). When you have finished editing the file "
				+ "come back to this window and press 'Enter' to continue.");
		Scanner input = new Scanner(System.in);
		input.nextLine();
		input.close();
		File spellCheckFile = new File("spellcheckme.txt");
		Scanner spellCheckScanner = new Scanner(spellCheckFile);
		while (spellCheckScanner.hasNextLine()) {
			String[] line = spellCheckScanner.nextLine().split("\\s+");
			for (int i=0; i<line.length; i++) {
				String cleanedString = line[i].replaceAll("[^A-Za-z0-9.']", "").toUpperCase();
				if (!dictionary.contains(cleanedString) && 
						!(cleanedString.endsWith("S") && dictionary.contains(cleanedString.substring(0, cleanedString.length()-1)))) {
					System.out.println("Word '" + line[i] + "' is misspelled!");
				}
			}
		}
		spellCheckScanner.close();
		System.out.println("Spell check with us again soon.");
	}
}