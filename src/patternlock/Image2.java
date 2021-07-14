package patternlock;

import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

import javax.swing.JLabel;


public class Image2 extends JLabel {
	//Class Variables
	  int randomNum2 = (int)(Math.random()*10 + 11);
	  //Check1 checkimage1 = new Check1(randomNum2);
	 // Image1 imag1 = new Image1();

	  ImageIcon img = new ImageIcon("images/image"+ randomNum2 +".jpg");

	 
	  public Image2() {
		//Set the size
		setBounds(310, 200, 180,180);
		//Resizes the image to 75 wide and 75 high
		img = new ImageIcon(img.getImage().getScaledInstance(getWidth(),getHeight(), Image.SCALE_SMOOTH));
	  }
	 
	  public void paintComponent(Graphics g){
		//Draw the image
		g.drawImage(img.getImage(), 0, 0, this);
	  }
	  public int numb2(){
		  return randomNum2;
	  }
}
