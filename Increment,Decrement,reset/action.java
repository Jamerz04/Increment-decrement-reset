package brian.loveapple;


import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;




class action extends personView{
	
	
	public void actionView(){
		view();
		
		
	incrementBtn.addActionListener(new ActionListener(){
		@Override
		
		public void actionPerformed(ActionEvent e){
			number++;
			
			text.setText(String.valueOf(number));
			
			
			
			
		}
		
		
		
		
		
		
	});
	
	
	
	
	
	decrementBtn.addActionListener(new ActionListener(){
		@Override
		
		public void actionPerformed(ActionEvent e){
			number--;
			
			text.setText(String.valueOf(number));
			
			
			
			
		}
		
		
		
		
		
		
	});
	
	
	
	
	
	resetBtn.addActionListener(new ActionListener(){
		@Override
		
		public void actionPerformed(ActionEvent e){
			number = 0;
			
			text.setText(String.valueOf(number));
			
			
			
			
		}
		
		
		
		
		
		
	});
	
	
	
	}
	
	
	
}