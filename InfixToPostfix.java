package edu.smg;

import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfix {
	public static void main(String[] args) {
		System.out.println("Enter an expression: ");
		Scanner sc = new Scanner(System.in);
		String expression = sc.nextLine();
		sc.close();
		try {
			System.out.println(infixToPostfix(expression));
		} catch (Exception ex) {
			System.out.println("Wrong expression: " + args[0]);
		}

	}

	public static String infixToPostfix(String expression) {
		expression = insertBlanks(expression);
		Stack<Character> operatorStack = new Stack<Character>();
		//Extract operands and operators
		String[] tokens = expression.split(" ");
		String result = "";
		char c;
		//Phase 1: Scan tokens
		for (String token : tokens) {
			if (token.length() == 0) // Blank space
				continue; // Back to the while loop to extract the next token
			else if (token.charAt(0) == '+' || token.charAt(0) == '-') {
				while (!operatorStack.isEmpty() && (operatorStack.peek() == '+' || operatorStack.peek() == '-'
						|| operatorStack.peek() == '*' || operatorStack.peek() == '/' || operatorStack.peek() == '^')) {
					c = operatorStack.pop();
					result += c + " ";
				}
				operatorStack.push(token.charAt(0));
			} else if (token.charAt(0) == '*' || token.charAt(0) == '/') {
				while (!operatorStack.isEmpty() && (operatorStack.peek() == '*' || 
						operatorStack.peek() == '/' || operatorStack.peek() == '^')) {
					c = operatorStack.pop();
					result += c + " ";
				}
				operatorStack.push(token.charAt(0));
			} else if (token.trim().charAt(0) == '(') {
				operatorStack.push('(');
			} else if (token.trim().charAt(0) == ')') {
				while (operatorStack.peek() != '(') {
					c = operatorStack.pop();
					result += c + " ";
				}
				operatorStack.pop(); // Pop the '(' symbol from the stack
			} else if (token.charAt(0) == '^') {
				operatorStack.push(token.charAt(0));			
			} else { // An operand scanned
				result += token.charAt(0) + " ";
			}
		}
		while(!operatorStack.isEmpty()) {
			c = operatorStack.pop();
			result += c + " ";
		}
		//Return the result
		return result;

	}

	public static String insertBlanks(String s) {
		String result = "";
		for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == '(' || s.charAt(i) == ')' || s.charAt(i) == '+' || s.charAt(i) == '-'
					|| s.charAt(i) == '*' || s.charAt(i) == '/' || s.charAt(i) == '^')
				result += " " + s.charAt(i) + " ";
			else
				result += s.charAt(i);
		}
		return result;
	}
}