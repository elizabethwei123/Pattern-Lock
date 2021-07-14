package patternlock;

import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

import javax.swing.JLabel;


public class picture5 extends JLabel {
	//Class Variables
	  int randomNum5 = (int)(Math.random()*5 + 21);

	  ImageIcon img = new ImageIcon("images/image"+ randomNum5 +".jpg");

	 
	  public picture5() {
		//Set the size
		setBounds(100, 325, 160, 160);
		//Resizes the image to 75 wide and 75 high
		img = new ImageIcon(img.getImage().getScaledInstance(getWidth(),getHeight(), Image.SCALE_SMOOTH));
	  }
	 
	  public void paintComponent(Graphics g){
		//Draw the image
		g.drawImage(img.getImage(), 0, 0, this);
	  }
	  public int numb1(){
		  return randomNum5;
	  }
}