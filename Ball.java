package edu.smg;

import java.awt.Color;


class Ball {
	int x = 0;
	int y = 0;
	int dx = (int) (1 + Math.random() * 3); // Increment on ball's x-coordinate
	int dy = (int) (1 + Math.random() * 3); // Increment on ball's y-coordinate
	int radius = 5; // Ball radius
	Color color = new Color((int) (Math.random() * 256), 
			(int) (Math.random() * 256), (int) (Math.random() * 256));
	
}