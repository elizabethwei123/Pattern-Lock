package patternlock;

import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

public class WinFrame extends JFrame{
	//Class variables
		private WinFrame frame;
		private JPanel contentPane;
		private JButton mainMenuButton;
		private JButton btnInstructions;
	  	private JButton btnExit;
		private JButton btnStart;
		private JLabel Text;
		private Win youWin = new Win();
		//PlayFrame Default Constructor
		public WinFrame() {
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
			this.setSize(new Dimension(800, 600));
	    	this.setTitle("GameOver Frame");
	    	
	    	//Setup the contentPane
			contentPane = (JPanel)this.getContentPane();
			contentPane.setLayout(null);
			//Setup a background picture
			// which must be available in the pictures folder as part of the project
			
	     	
	    	//Main Menu button
			mainMenuButton = new JButton("Main Menu");
			mainMenuButton.setFocusable(false);  //Remove the focus from the button
			//Setup the button to listen and function
			mainMenuButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					//Makes an instance of the InstructionFrame
			      	MainMenu menuFrame = new MainMenu();
			      	//Set properties of the frame
			      	menuFrame.setSize(800,600);
			      	menuFrame.setLocation(100, 100);
			      	menuFrame.setResizable(false);  //No adjusting the sizing
			      	//Makes the current frame invisible
			      	frame.setVisible(false);
			      	//Makes the new frame visible
			      	menuFrame.setVisible(true);
				}
			});
			mainMenuButton.setBounds(8, 7, 118, 30);
			contentPane.add(mainMenuButton);  //Become part of the contentPane
	    	
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
			btnInstructions.setBounds(126, 7, 118, 30);
			contentPane.add(btnInstructions);  //Become part of the contentPane
			btnStart = new JButton("Play Again");
			btnStart.setFocusable(false);  
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
			btnStart.setBounds(300, 400, 186, 100);
			contentPane.add(btnStart);  //Become part of the contentPane
				
			//Exit Button
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
			btnExit.setBounds(244, 7, 118, 30);
			contentPane.add(btnExit);  
			
			youWin.setLocation(0, 0);
			contentPane.add(youWin);  
			contentPane.updateUI();
	  	}
	}
