package edu.smg;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class VowelsAndConsonants {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\Yaniiiiiii\\11e\\Collection_8\\src\\edu\\smg\\InfixToPostfix.java");
		if(file.exists()) {
			countVowels(file);
		} else {
			System.out.println("The file does not exist.");
		}
		
	}
	
	public static void countVowels(File file) throws Exception {
		Character[] vowels = {'A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u', };
		Set<Character> vowelsSet = new HashSet<Character>(Arrays.asList(vowels));
		int countVowels = 0;
		int countConsonants = 0;
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		int c = 0;
		while((c = br.read()) != -1) {
			char character = (char) c;
			if(character > 'a' && character < 'z' || character > 'A' && character < 'Z') {
				if (vowelsSet.contains(character)){
					countVowels++;
				} else {
					countConsonants++;
				}
			}
		}
		br.close();
		System.out.println("Vowels: " + countVowels + "\nConsonants: " + countConsonants);
	}

}
