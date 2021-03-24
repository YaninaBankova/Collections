package edu.smg;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUI_List {

	public static void main(String[] args) {
		LinkedList<Integer> numbers = new LinkedList<>();
		
		JFrame frame = new JFrame("Numbers");
		frame.setSize(310, 250);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.setLayout(null);
		
		JLabel enterNumber = new JLabel("Enter a number: ");
		panel.add(enterNumber);
		enterNumber.setBounds(50, 20, 100, 15);
		
		JTextField newNumber = new JTextField();
		panel.add(newNumber);
		newNumber.setBounds(160, 17, 100, 21);
		
		JTextArea numbersList = new JTextArea();
		panel.add(numbersList);
		numbersList.setBounds(50, 50, 200, 100);
		numbersList.setEditable(false);
		
	    
		newNumber.addActionListener(new ActionListener( ) {
			public void actionPerformed(ActionEvent e) {
				Integer number = Integer.parseInt(newNumber.getText());
				if(!numbers.contains(number)) {
					numbers.add(number);
				}
				newNumber.setText("");
				numbersList.setText(numbers.toString());
			}
		});
		
		JButton sortButton = new JButton("Sort");
		panel.add(sortButton);
		sortButton.setVisible(true);
		sortButton.setBounds(20, 170, 60, 20);
		sortButton.addActionListener(new ActionListener( ) {
			public void actionPerformed(ActionEvent e) {
				Collections.sort(numbers);
				numbersList.setText(numbers.toString());
			}
		});
		
		JButton shuffleButton = new JButton("Shuffle");
		panel.add(shuffleButton);
		shuffleButton.setVisible(true);
		shuffleButton.setBounds(90, 170, 80, 20);
		shuffleButton.addActionListener(new ActionListener( ) {
			public void actionPerformed(ActionEvent e) {
				Collections.shuffle(numbers);
				numbersList.setText(numbers.toString());
			}
		});
		
		JButton reverseButton = new JButton("Reverse");
		panel.add(reverseButton);
		reverseButton.setVisible(true);
		reverseButton.setBounds(180, 170, 90, 20);
		reverseButton.addActionListener(new ActionListener( ) {
			public void actionPerformed(ActionEvent e) {
				Collections.sort(numbers, Collections.reverseOrder());
				numbersList.setText(numbers.toString());
			}
		});
	}

}

