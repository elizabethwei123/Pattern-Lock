package patternlock;

import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

import javax.swing.JLabel;


public class picture2 extends JLabel {
	//Class Variables
	  int randomNum2 = (int)(Math.random()*5 + 6);

	  ImageIcon img = new ImageIcon("images/image"+ randomNum2 +".jpg");

	 
	  public picture2() {
		//Set the size
		setBounds(325, 350, 160, 160);
		//Resizes the image to 75 wide and 75 high
		img = new ImageIcon(img.getImage().getScaledInstance(getWidth(),getHeight(), Image.SCALE_SMOOTH));
	  }
	 
	  public void paintComponent(Graphics g){
		//Draw the image
		g.drawImage(img.getImage(), 0, 0, this);
	  }
	  public int numb1(){
		  return randomNum2;
	  }
}