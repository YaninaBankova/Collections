package edu.smg;

import java.util.Arrays;
import java.util.PriorityQueue;

public class PriorityQueueTest {

	public static void main(String[] args) { 
		PriorityQueue<String> q1 = new PriorityQueue<>(Arrays.asList( 
				"George" , "Jim" , "John" , "Blake" , "Kevin" , "Michael"));
		PriorityQueue<String> q2 = new PriorityQueue<>(Arrays.asList(
				"George" , "Katie" , "Kevin" , "Michelle" , "Ryan"));
		
		PriorityQueue<String> union = new PriorityQueue<>(q1);
		union.addAll(q2);
		
		PriorityQueue<String> intersection = new PriorityQueue<>(q1);
		intersection.retainAll(q2);
		
		PriorityQueue<String> difference = new PriorityQueue<>(union);
		difference.removeAll(intersection);
		
		System.out.println("Union: " + union);
		System.out.println("Intersection: " + intersection);
		System.out.println("Difference: " + difference);
		
		
	}

}
