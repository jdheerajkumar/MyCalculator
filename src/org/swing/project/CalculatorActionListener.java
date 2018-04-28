package org.swing.project;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class CalculatorActionListener implements ActionListener {
	private JTextField calculator_text;
	public CalculatorActionListener(JTextField calculator_text) {
		this.calculator_text = calculator_text;
		this.calculator_text.setBounds(7,40, 270,60);  
		this.calculator_text.setHorizontalAlignment(SwingConstants.TRAILING);
        Font font1 = new Font("SansSerif", Font.BOLD, 25);
        this.calculator_text.setFont(font1);
	}
	
	

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		
	}	
	
}
