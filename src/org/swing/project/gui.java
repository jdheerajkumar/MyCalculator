package org.swing.project;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
class gui{
    public static void main(String args[]){
    	//Creating the Frame
    	
        
        JFrame f=new JFrame("Calculator");  
        
        
        JTextField calculator_text;  
        calculator_text=new JTextField();  
        

        CalculatorActionListener calc = new CalculatorActionListener(calculator_text);
        JButton button_percentage=new JButton("%");  
        
        button_percentage.setBounds(5,120,60,40);  
        JButton button_square=new JButton("/");  
        button_square.setBounds(75,120,60,40);
        JButton button_x_square=new JButton("x^2");  
        button_x_square.setBounds(145,120,60,40);
        JButton button_by_x=new JButton("1/x");  
        button_by_x.setBounds(215,120,60,40);
        
        JButton button_ce=new JButton("CE");  
        button_ce.setBounds(5,170,60,40);  
        JButton button_c=new JButton("C");  
        button_c.setBounds(75,170,60,40);
        JButton button_backspace=new JButton("<");  
        button_backspace.setBounds(145,170,60,40);
        JButton button_div=new JButton("*/.");  
        button_div.setBounds(215,170,60,40);
        
        JButton button_seven=new JButton("7");  
        button_seven.setBounds(5,220,60,40);  
        JButton button_eight=new JButton("8");  
        button_eight.setBounds(75,220,60,40);
        JButton button_nine=new JButton("9");  
        button_nine.setBounds(145,220,60,40);
        JButton button_multiply=new JButton("X");  
        button_multiply.setBounds(215,220,60,40);
        
        JButton button_four=new JButton("4");  
        button_four.setBounds(5,270,60,40);  
        JButton button_five=new JButton("5");  
        button_five.setBounds(75,270,60,40);
        JButton button_six=new JButton("6");  
        button_six.setBounds(145,270,60,40);
        JButton button_minus=new JButton("-");  
        button_minus.setBounds(215,270,60,40);
        
        
        JButton button_one=new JButton("1");  
        button_one.setBounds(5,320,60,40);  
        JButton button_two=new JButton("2");  
        button_two.setBounds(75,320,60,40);
        JButton button_three=new JButton("3");  
        button_three.setBounds(145,320,60,40);
        JButton button_plus=new JButton("+");  
        button_plus.setBounds(215,320,60,40);
        
        JButton button_negate=new JButton("+-");  
        button_negate.setBounds(5,320,60,40);  
        JButton button_zero=new JButton("0");  
        button_zero.setBounds(75,320,60,40);
        JButton button_dot=new JButton(".");  
        button_dot.setBounds(145,320,60,40);
        JButton button_equalto=new JButton("=");  
        button_equalto.setBounds(215,320,60,40);
        
        f.add(calculator_text);
        
        f.add(button_percentage);  
        f.add(button_square);  
        f.add(button_x_square);  
        f.add(button_by_x);  

        f.add(button_ce);  
        f.add(button_c);  
        f.add(button_backspace);  
        f.add(button_div);  
        
        f.add(button_seven);  
        f.add(button_eight);  
        f.add(button_nine);  
        f.add(button_multiply);  
        
        f.add(button_four);  
        f.add(button_five);  
        f.add(button_six);  
        f.add(button_minus);
        
        f.add(button_one);  
        f.add(button_two);  
        f.add(button_three);  
        f.add(button_plus);
        
        f.add(button_negate);  
        f.add(button_zero);  
        f.add(button_dot);  
        f.add(button_equalto);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        f.setSize(300,430);  
        f.setLayout(null);  
        f.setVisible(true);  
        f.setResizable(false);
       
    }
    
    public void button_action(JButton button,String text) {
		button.addActionListener(new ActionListener(){  
        	public void actionPerformed(ActionEvent e){  
        		//calculator_text.setText(text);  
			}  
        });  
	}
}