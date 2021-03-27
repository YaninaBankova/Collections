package edu.smg;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

public class BracketsChecker {

	public static void main(String[] args) {
		Stack<Character> brackets = new Stack<>();
		//File myFile = new File("C:\\Eclipse\\11e\\Collection_7\\src\\edu\\smg\\BallPanel.java");
		File myFile = new File("src/edu/smg/EvaluateExpression.java");
		FileReader r1;
		try {
			r1 = new FileReader(myFile);
			BufferedReader br = new BufferedReader(r1);
			int c = 0;
			boolean conflict = false;
			while((c = br.read()) != -1) {
				char character = (char) c;
				if(character == '(' || character == '{' || character == '[') {
					brackets.add(character);
				} else if (character == ')') {
					conflict = (brackets.pop() != '(');
				} else if (character == '}') {
					conflict = (brackets.pop() != '{');
				} else if (character == ']') {
					conflict = (brackets.pop() != '[');
				}
				
				if(conflict)
					break;
			}
			br.close();
			if(conflict || !brackets.isEmpty()) {
				System.out.println("Missmatched brackets!");
			} else {
				System.out.println("No missmatched brackets!");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
