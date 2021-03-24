package edu.smg;

import java.util.LinkedList;

public class EfficiencyTest {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>();
		for(int i = 0; i < 5_000_000; i++) {
			list.add(i);
		}
		
		int a = 0;
		for(Integer number: list)
			a = number;
		System.out.println(a);
		
//		for(int i = 0; i < 50_000; i++) {
//			a = list.get(i);
//		}
//		System.out.println(a);
	}

}
