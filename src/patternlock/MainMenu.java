package patternlock;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

//Make this class a JFrame
public class MainMenu extends JFrame {
	//Class variables
	private JFrame frame;
	private JPanel contentPane;
	private JButton btnInstructions;
	private JButton btnStart;
	private JButton btnExit;
	private JTextField jTextField;
	private JLabel lblPatternLock;
	private Chain chain = new Chain();
	//MenuFrame Default Constructor
	public MainMenu() {
    	try {
    		//Close this frame when leaving the frame
    		setDefaultCloseOperation(EXIT_ON_CLOSE);
    		//Call the initialize method
    		initialize();
    	}
    	catch (Exception exception) {
      		exception.printStackTrace();
    	}
  	}
		
	//Setup the contents of the frame
	private void initialize() {
		//Initialize this JFrame
		frame = this;
		this.setBounds(100, 100, 450, 300);
		this.setSize(800, 600);
    	this.setTitle("Main Menu");
    	
    	//Setup the contentPane
		contentPane = (JPanel)this.getContentPane();
		contentPane.setLayout(null);
		contentPane.setBackground(Color.WHITE);
		
		//Text for the screen
    	jTextField = new JTextField();
    	
    	//PatternLock
    	JLabel lblPatternLock = new JLabel("Pattern Lock");
    	lblPatternLock.setFont(new Font("Traditional Arabic", Font.PLAIN, 35));
    	lblPatternLock.setBounds(300, 10, 186, 65);
		frame.getContentPane().add(lblPatternLock);

    	
    	jTextField.setBounds(10, 251, 0, 0);
    	contentPane.add(jTextField);  //Become part of the contentPane
    			
		//Instructions button
    	btnInstructions = new JButton("Instructions");
    	btnInstructions.setFocusable(false);  //Remove the focus from the button
		//Setup the button to listen and function
    	btnInstructions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Makes an instance of the InstructionFrame
		      	InstructionFrame introFrame = new InstructionFrame();
		      	//Set properties of the frame
		      	introFrame.setSize(800,600);
		      	introFrame.setLocation(100, 100);
		      	introFrame.setResizable(false);  //No adjusting the sizing
		      	//Makes the current frame invisible
		      	frame.setVisible(false);
		      	//Makes the new frame visible
		      	introFrame.setVisible(true);
			}
		});
		btnInstructions.setBounds(145, 445, 150, 75);
		contentPane.add(btnInstructions);  //Become part of the contentPane
		
		//Play button
		btnStart = new JButton("Play");
		btnStart.setFocusable(false);  //Remove the focus from the button
		//Setup the button to listen and function
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//get difficulty from user
			    String [] options = {"Easy","Hard"};
			    String choice = JOptionPane.showInputDialog(new JPanel(),
			   			"Please select a difficulty","Difficulty",2,null,options,0) + "";
			    if(choice.equals("Easy")){
			    	//makes instance of the HowToPlayFrame
			    	Play playFrame = new Play();
			    	//set properties of the frame
			    	playFrame.setSize(800,600);
			    	playFrame.setLocation(100, 100);
			    	playFrame.setResizable(false);
			    	//makes this frame invisible
			    	frame.setVisible(false);
			    	//sets new frame so that its visible
			    	playFrame.setVisible(true);
		    	}
		    	
		    	//Medium , 21
		    	else if(choice.equals("Hard")){
		    		//makes instance of the HowToPlayFrame
			    	PlayHard playFrame2 = new PlayHard();
			    	//set properties of the frame
			    	playFrame2.setSize(800,600);
			    	playFrame2.setLocation(100, 100);
			    	playFrame2.setResizable(false);
			    	//makes this frame invisible
			    	frame.setVisible(false);
			    	//sets new frame so that its visible
			    	playFrame2.setVisible(true);
		    	}
			}
		});
		btnStart.setBounds(300, 300, 186, 100);
		contentPane.add(btnStart);  //Become part of the contentPane
		
		//Exit button
		btnExit = new JButton("Exit");
		btnExit.setFocusable(false);  //Remove the focus from the button
		//Setup the button to listen and function
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Get rid of the current frame
				frame.dispose();
				//Goodbye
		    	System.exit(0);
			}
		});
		btnExit.setBounds(490, 445, 150, 75);
		contentPane.add(btnExit);  //Become part of the contentPane
		//picture
		chain.setLocation(0,0);
		contentPane.add(chain);  //Become part of the contentPane
		contentPane.updateUI();
	}
}
