package patternlock;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import javax.swing.JLabel;


public class Square1 extends JLabel {
	//Class Variables
	  ImageIcon img = new ImageIcon("images/square1.jpg");
	 
	  public Square1() {
		//Set the size
		setBounds(0,0,120,120);
		//Resizes the image to 75 wide and 75 high
		img = new ImageIcon(img.getImage().getScaledInstance(getWidth(),getHeight(), Image.SCALE_SMOOTH));
	  }
	 
	  public void paintComponent(Graphics g){
		//Draw the image
		g.drawImage(img.getImage(), 0, 0, this);
	  }

}