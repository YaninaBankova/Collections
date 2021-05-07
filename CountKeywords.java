package edu.smg;

import java.util.*;
import java.io.*;

public class CountKeywords {
	public static void main(String[] args) throws Exception {
		File file = new File("C:\\Users\\Yaniiiiiii\\11e\\Maps_10\\src\\edu\\smg\\ContriesAndCapitals.java");
		if (file.exists()) {
			countKeywords(file);
		} else {
			System.out.println("File does not exist");
		}

	}

	public static void countKeywords(File file) throws Exception {
// Array of all Java keywords + true, false and null
		String[] keywordString = { "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class",
				"const", "continue", "default", "do", "double", "else", "enum", "extends", "for", "final", "finally",
				"float", "goto", "if", "implements", "import", "instanceof", "int", "interface", "long", "native",
				"new", "package", "private", "protected", "public", "return", "short", "static", "strictfp", "super",
				"switch", "synchronized", "this", "throw", "throws", "transient", "try", "void", "volatile", "while",
				"true", "false", "null" };
		Set<String> keywordSet = new HashSet<String>(Arrays.asList(keywordString));
		Map<String, Integer> keywordsMap = new TreeMap<String, Integer>();
		Scanner input = new Scanner(file);
		while (input.hasNext()) {
			String word = input.next();
			if (keywordSet.contains(word)) {
				if (!keywordsMap.containsKey(word)) {
					keywordsMap.put(word, 1);
					
				} else {
					int value = keywordsMap.get(word);
					value++;
					keywordsMap.put(word, value);
				}
			}
		}
		input.close();
		Set<Map.Entry<String, Integer>> entrySet = keywordsMap.entrySet();
				for (Map.Entry<String, Integer> entry : entrySet)
					System.out.println(entry.getKey() + "\t" + entry.getValue());
	}
}