package patternlock;

import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

import javax.swing.JLabel;


public class Lives extends JLabel {
	//Class Variables
	  int randomNum2 = (int)(Math.random()*10);
	  

	  ImageIcon img = new ImageIcon("images/lives.png");

	 
	  public Lives() {
		//Set the size
		setBounds(500, 100, 30, 25);
		//Resizes the image to 75 wide and 75 high
		img = new ImageIcon(img.getImage().getScaledInstance(getWidth(),getHeight(), Image.SCALE_SMOOTH));
	  }
	 
	  public void paintComponent(Graphics g){
		//Draw the image
		g.drawImage(img.getImage(), 0, 0, this);
	  }
}
