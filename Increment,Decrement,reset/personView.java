package brian.loveapple;


import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;





class personView{
	JFrame screen = new JFrame("calculator");
	JButton incrementBtn,decrementBtn,resetBtn;
	TextField text ;
	int number = 0;
	
	
	
	public void view(){
		
		
		
		
		screen.setVisible(true);
		screen.setLayout(null);
		screen.setResizable(false);
		screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		screen.setSize(390,300);
		screen.getContentPane().setBackground(new Color(123,123,123));
		
		
		incrementBtn = new JButton("Increment");
		incrementBtn.setBounds(20, 190, 100,50);
		screen.add(incrementBtn);
		
		
		
		
		
		
		
		
		decrementBtn = new JButton("Decrement");
		decrementBtn.setBounds(140, 190, 100,50);
		screen.add(decrementBtn);
		
		
		resetBtn = new JButton("Reset");
		resetBtn.setBounds(260, 190, 100,50);
		screen.add(resetBtn);
		
		text = new TextField(String.valueOf(number));
		text.setBounds(140,50,80,50);
		screen.add(text);
		
		
		
		
		
	}
	
	
	
	
	
}