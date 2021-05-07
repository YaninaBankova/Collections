package edu.smg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ContriesAndCapitals {

	public static void main(String[] args) {
		Map<String, String> contryAndCapitalMap = new HashMap<String, String>(){{
			put("Bulgaria", "Sofia");
			put("Germany", "Berlin");
			put("Italy", "Rome");
			put("Spain", "Madrid");
			put("Portugal", "Lisabon");
			put("Russia", "Moscow");
			put("Czechia", "Prague");
			put("France", "Paris");
		}};
		
		int points = 0;
		Scanner sc = new Scanner(System.in);
		
		List<String> keys = new ArrayList<String>(contryAndCapitalMap.keySet());
		Collections.shuffle(keys);
		for(String country: keys) {
			System.out.println("What is the capital of " + country + "?");
			String answer = sc.nextLine();
			if(answer.equals(contryAndCapitalMap.get(country))) {
				System.out.println("Right!");
				points++;
			} else {
				System.out.println("Wrong. The capital of " + country + " is " + contryAndCapitalMap.get(country));
				points--;
			}
		}
		sc.close();
		System.out.println("You have " + points + " points!");
	}

}
