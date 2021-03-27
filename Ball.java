package edu.smg;

import java.awt.Color;


class Ball implements Comparable<Ball>{
	int x = 0;
	int y = 0;
	
	int dx = (int) (1 + Math.random() * 4);{ // Increment on ball's x-coordinate
	if(Math.random() < 0.5)
		dx *= -1;}
	
	int dy = (int) (1 + Math.random() * 4); {// Increment on ball's y-coordinate
	if(Math.random() < 0.5)
		dy *= -1;
	}
	
	int radius = (int)(Math.random() * 19) + 2; // Ball radius
	Color color = new Color((int) (Math.random() * 256), 
			(int) (Math.random() * 256), (int) (Math.random() * 256));
	public Ball(int height, int width) {
		x = (int)(Math.random() * width + 1);
		y = (int)(Math.random() * height + 1);
	}
	
	@Override
	public int compareTo(Ball arg0) {
		return radius - arg0.radius;
//		if(radius - arg0.radius > 0) {
//			return 1;
//		} else if(radius - arg0.radius < 0) {
//			return -1;
//		} else {
//			return 0;
//		}
	}
}