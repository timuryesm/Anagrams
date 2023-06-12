package ua.foxminded.javaspring.anagram;

import java.util.StringJoiner;

public class Anagram {
    
    private static final String DELIMITER = " ";

    public String reverseText(String text) {
	String[] words = text.split(DELIMITER);
        StringJoiner result = new StringJoiner(DELIMITER);

        for (String word : words) {
            result.add(reverseWord(word));
        }

        return result.toString();
    }

    private String reverseWord(String word) {
        char[] letters = word.toCharArray();
        for (int i = 0, j = letters.length - 1; i < j; ) {
            if (!Character.isAlphabetic(letters[i]))
                i++;
            else if (!Character.isAlphabetic(letters[j]))
                j--;
            else {
                swapSymbols(letters, i, j);
                i++;
                j--;
            }
        }
        return String.valueOf(letters);
    }

    public void swapSymbols(char[] letters, int i, int j) {
        char current = letters[i];
        letters[i] = letters[j];
        letters[j] = current;
    }
}
