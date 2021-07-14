package patternlock;

import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

import javax.swing.JLabel;


public class Image1 extends JLabel {
	//Class Variables
	  int randomNum1 = (int)(Math.random()*10 + 1);;
	  ImageIcon img;
	  public Image1() {
		img = new ImageIcon("images/image"+randomNum1+".jpg");
		//Set the size
		setBounds(65, 200, 180,180);
		//Resizes the image to 75 wide and 75 high
		img = new ImageIcon(img.getImage().getScaledInstance(getWidth(),getHeight(), Image.SCALE_SMOOTH));
	  }
	 
	  public void paintComponent(Graphics g){
		//Draw the image
		g.drawImage(img.getImage(), 0, 0, this);
	  }
	  public int numb1(){
		  return randomNum1;
	  }
}
