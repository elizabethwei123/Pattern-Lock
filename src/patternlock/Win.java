package patternlock;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import javax.swing.JLabel;


public class Win extends JLabel {
	//Class Variables
	  ImageIcon img = new ImageIcon("images/YouWin.png");
	 
	  public Win() {
		//Set the size
		setBounds(0,0,800,600);
		//Resizes the image to 75 wide and 75 high
		img = new ImageIcon(img.getImage().getScaledInstance(getWidth(),getHeight(), Image.SCALE_SMOOTH));
	  }
	 
	  public void paintComponent(Graphics g){
		//Draw the image
		g.drawImage(img.getImage(), 0, 0, this);
	  }

}