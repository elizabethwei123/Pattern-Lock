package patternlock;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

//Make this class a JFrame
public class InstructionFrame extends JFrame {
	

	//Class variables
	private JFrame frame;
	private JPanel contentPane;
	private JButton mainMenuButton;
	private JButton btnStart;
	private JButton btnExit;
	private JTextField jTextField;
	private JLabel Linstruction;
	private JLabel jlabel1;
	private JLabel jlabel2;
    private JLabel title;
    private Lock lock = new Lock();
	//InstructionFrame Default Constructor
	public InstructionFrame() {
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
    	this.setTitle("Instruction");
    	
    	//Setup the contentPane
		contentPane = (JPanel)this.getContentPane();
		contentPane.setLayout(null);
		//Setup a background picture
		// which must be available in the pictures folder as part of the project
		//picture = new ImageIcon(picture.getImage( ).getScaledInstance(800, 600, Image.SCALE_SMOOTH));
		//JLabel background = new JLabel();
		//background.setIcon(picture);
		//background.setSize(800, 600);
				    	
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
		
		//Play button
		btnStart = new JButton("Play");
		btnStart.setFocusable(false);  //Remove the focus from the button
		//Setup the button to listen and function
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//get difficulty from user
			    String [] options = {"Easy","Hard"};
			    String choice = JOptionPane.showInputDialog(new JPanel(),
			   			"Please select a difficulty","Difficulty",2,null,options,0) + "";
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
		});
		btnStart.setBounds(126, 7, 118, 30);
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
		contentPane.add(btnExit);  //Become part of the contentPane
		//Title
		JLabel title = new JLabel("Instruction");
		title.setBounds(325, 100, 186, 65);
		title.setBounds(new Rectangle(310, 90, 500, 27));
		title.setFont(new Font("Traditional Arabic", Font.PLAIN, 30));
		frame.getContentPane().add(title);
		//0	
		JLabel Linstruction = new JLabel(" Memorize the shapes on the screen");
		Linstruction.setBounds(205, 220, 186, 65);
		frame.getContentPane().add(Linstruction);
		Linstruction.setBounds(new Rectangle(190, 213, 500, 27));
		//1
		JLabel jlabel1 = new JLabel(" and use the mouse to redraw the shape ");
		jlabel1.setBounds(190, 245, 186, 65);
		frame.getContentPane().add(jlabel1);
		jlabel1.setBounds(new Rectangle(190, 243, 500, 27));
		//2
		JLabel jlabel2 = new JLabel("that the game asks for.");
		jlabel2.setBounds(210, 270, 186, 65);
		frame.getContentPane().add(jlabel2);
		jlabel2.setBounds(new Rectangle(195, 273, 500, 27));
		//all
		Linstruction.setFont(new Font("Traditional Arabic", Font.PLAIN, 25));
		jlabel1.setFont(new Font("Traditional Arabic", Font.PLAIN, 25));
		jlabel2.setFont(new Font("Traditional Arabic", Font.PLAIN, 25));

    	
    	//The order which you add components is very IMPORTANT!!!!!
    	//Put your background on last so other components will show
		lock.setLocation(450,350);
		contentPane.add(lock);  //Become part of the contentPane
		contentPane.updateUI();
	}
}