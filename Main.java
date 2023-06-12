package ua.foxminded.javaspring.anagram;

import java.util.Scanner;

public class Main {
    public static void main( String[] args ) {
    	Anagram anagram = new Anagram();
        String text = readText();
        String reversedText = anagram.reverseText(text);
        System.out.println(reversedText);
    }
    
    public static String readText() {
        Scanner scaner = new Scanner(System.in);
        return scaner.nextLine();
    }
    
    public static String MainTest(String str) {
    	return str;
    }
}
