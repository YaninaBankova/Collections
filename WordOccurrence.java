package edu.smg;


public class WordOccurrence implements Comparable<WordOccurrence>{
	
	public String word;
	public int occurrence;
	
	public WordOccurrence() {
		
	}
	
	public WordOccurrence(String word, int occurrence) {
		this.word = word;
		this.occurrence = occurrence;
	}
	

	public int compareTo(WordOccurrence w1) {
		if(this.occurrence > w1.occurrence)
			return 1;
		else if(this.occurrence < w1.occurrence)
			return -1;
		else
			return 0;
	}

}
