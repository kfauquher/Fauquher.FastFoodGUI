//Author Name: Kylie Fauquher
//Date: 02/27/2022

package fastfood;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;

import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class fastfoodGUI extends JFrame implements ActionListener {

	
	//Creates my checkboxes, buttons and labels for JFrame
	JCheckBox checkbox1;
	JCheckBox checkbox2;
	JCheckBox checkbox3;
	JCheckBox checkbox4;
    JCheckBox checkbox5;
	JCheckBox checkbox6;
	JButton button;
	JLabel label;
	
	
	fastfoodGUI() {
		
		//Establishes the size and layout of my 'menu' pop-up
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600,800);
		this.setTitle("Online Menu");
		this.setLayout(null);
		this.setVisible(true);
		
		//My title's name and position on panel
		label = new JLabel("Luigi's Pizza Online Menu");
		label.setBounds(200,100,200,50);
		
		//Food option name and position on panel
		checkbox1 = new JCheckBox("Cheese Pizza: $6");
		checkbox1.setBounds(200,200,300,50);
		
		checkbox2 = new JCheckBox("Pepperoni Pizza: $7");
		checkbox2.setBounds(200,250,300,50);
		
		checkbox3 = new JCheckBox("Meat Lovers Pizza: $10");
		checkbox3.setBounds(200,300,300,50);
		
		checkbox4 = new JCheckBox("Veggie Lovers Pizza: $8");
		checkbox4.setBounds(200,350,300,50);
		
		checkbox5 = new JCheckBox("Garlic Sticks: $4");
		checkbox5.setBounds(200,400,300,50);
		
		checkbox6 = new JCheckBox("Drink: $2");
		checkbox6.setBounds(200,450,300,50);
		
		//My place order button
		button = new JButton("Place Order");
		button.setBounds(175,600,200,50);
		
		//You NEED this for the JOptions panel to actually work as intended
		button.addActionListener(this);
		
		
		
		this.add(checkbox1);
		this.add(checkbox2);
		this.add(checkbox3);
		this.add(checkbox4);
		this.add(checkbox5);
		this.add(checkbox6);
		this.add(button);
		this.add(label);
		
	}


@Override

//The method for selecting your food options and having it show up on a receipt
	public void actionPerformed(ActionEvent args0) {		
		float amount = 0;
		String message = " ";
		
		if(checkbox1.isSelected()) {
			amount += 6;
			message += "Cheese Pizza: $6 \n";
		}
		 
		 if(checkbox2.isSelected()) {
			amount += 7;
			message += "Pepperoni Pizza: $7 \n";
		}
		
		 if(checkbox3.isSelected()) {
			amount += 10;
			message += "Meat Lovers Pizza: $10 \n";

		}
		
		 if(checkbox4.isSelected()) {
			amount += 8;
			message += "Veggie Lovers Pizza: $8 \n";
	
		}
		
		 if(checkbox5.isSelected()) {
			amount += 4;
			message += "Garlic Sticks: $4 \n";

		}
		
		 if(checkbox6.isSelected()) {
			amount += 2;
			message += "Drink: $2 \n";

		}
		 

		JOptionPane.showMessageDialog(this, message + "-----------------\nTotal: " + amount); //Finally displaying the prices
		}

	
//Displays code!
public static void main(String[] args) {	
	new fastfoodGUI();
}	
}





