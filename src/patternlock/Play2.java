package patternlock;

import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

import java.awt.BorderLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

//Make this class a JFrame
public class Play2 extends JFrame {
	
	//Class variables
	private JFrame frame;
	private JPanel contentPane;
	private JButton mainMenuButton;
	private JButton btnInstructions;
  	private JButton btnExit;
  	private JButton btnSubmit;
  	//test
  	private JButton btnTest;
  	private JTextField jTextField;
  	private JLabel number1;
  	private JLabel label;
	private Image1 image1 = new Image1();
	private Image2 image2 = new Image2();
	private Image3 image3 = new Image3();
    //answer
  	private JButton Lose;
  	private JLabel question1;
  	private JLabel question2;
  	private JButton correct;
  	private Lives heart1 = new Lives();
  	private Lives heart2 = new Lives();
  	private Lives heart3 = new Lives();
  	private Lives heart4 = new Lives();
  	private Lives heart5 = new Lives();

  	private JLabel number2;
  	private JLabel number3;

	private JButton grid1;
	private JButton grid2;
	private JButton grid3;
	private JButton grid4;
	private JButton grid5;
	private JButton grid6;
	private JButton grid7;
	private JButton grid8;
	private JButton grid9;

  	private Square1 square1 = new Square1();
  	private int[] pattern= new int[9];
  	private int i = 0;
	//PlayFrame Default Constructor
	public Play2() {
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
    	this.setTitle("Play Frame");
    	
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
		//numbers
		//p1
		JLabel number1 = new JLabel("1");
		number1.setFont(new Font("Traditional Arabic", Font.PLAIN, 35));
		number1.setBounds(155, 400, 50, 50);
		frame.getContentPane().add(number1);
		JLabel number2 = new JLabel("2");
		number2.setFont(new Font("Traditional Arabic", Font.PLAIN, 35));
		number2.setBounds(400, 400, 50, 50);
		frame.getContentPane().add(number2);
		
		
		showPictures();
		countDown();
		//getContentPane().removeAll();
		
		
  	}
	
	public void showPictures(){
		//1st position
		image1.setLocation(65, 200);
		contentPane.add(image1);  //Become part of the contentPane
		contentPane.updateUI();
		image2.setLocation(310, 200);
		contentPane.add(image2);  //Become part of the contentPane
		contentPane.updateUI();
	}


	public void countDown(){
		    
		    label=new JLabel("");
		    frame.add(label,BorderLayout.CENTER);
		    label.setFont(new Font("Traditional Arabic", Font.PLAIN, 35));
			label.setBounds(655, 60, 50, 50);
		    frame.setVisible(true);
		    int j=10;
		    final long end=System.currentTimeMillis()+j*1000;
		    final Timer timer=new Timer();
		    timer.schedule(new TimerTask() {
		    	public void run() {
		    		long sub=end-System.currentTimeMillis() + 150;
		    		if(sub<0){
		    			//return;
		    			getContentPane().removeAll();
		    			timer.cancel();
		    			frame.repaint();
		    			
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
						
						//lives
						//heart1
						heart1.setLocation(575, 10);
						contentPane.add(heart1);  
						contentPane.updateUI();
						//heart2
						heart2.setLocation(620, 10);
						contentPane.add(heart2);  
						contentPane.updateUI();
						//heart3
						heart3.setLocation(665, 10);
						contentPane.add(heart3);  
						contentPane.updateUI();
						//heart4
						heart4.setLocation(710, 10);
						contentPane.add(heart4);  
						contentPane.updateUI();
						//heart5
						heart5.setLocation(755, 10);
						contentPane.add(heart5);  
						contentPane.updateUI();
						
						//ask
						final int ask = (int)(Math.random()*2 + 1);
						JLabel question1 = new JLabel("PLEASE DRAW ");
						question1.setFont(new Font("Traditional Arabic", Font.PLAIN, 25));
						question1.setBounds(30, 150, 220, 70);
						frame.getContentPane().add(question1);
						
						JLabel question2 = new JLabel("THE SHAPE OF ");
						question2.setFont(new Font("Traditional Arabic", Font.PLAIN, 25));
						question2.setBounds(30, 220, 220, 70);
						frame.getContentPane().add(question2);
						
						JLabel question3 = new JLabel("#" + ask + " PATTERN ");
						question3.setFont(new Font("Traditional Arabic", Font.PLAIN, 25));
						question3.setBounds(30, 290, 220, 70);
						frame.getContentPane().add(question3);
						
						JLabel question4 = new JLabel("LOCK");
						question4.setFont(new Font("Traditional Arabic", Font.PLAIN, 25));
						question4.setBounds(65, 360, 220, 70);
						frame.getContentPane().add(question4);
						
						
						
						
						grid1 = new JButton(new ImageIcon("images/square1.jpg"));
						grid1.setFocusable(false);  //Remove the focus from the button
						//Setup the button to listen and function
						grid1.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {

								pattern[i] = 1;
								contentPane.updateUI();
								switch(i){
								case 0: grid1.setIcon(new ImageIcon("images/starter.jpg"));
									break;
								case 1: 
									if(pattern[i-1] == 2){
										//grid1.setIcon(new ImageIcon("images/eTail.jpg"));
										grid2.setIcon(new ImageIcon("images/W2.jpg"));
										grid1.setIcon(new ImageIcon("images/e.jpg"));
									}
									if(pattern[i-1] == 5){
										//grid4.setIcon(new ImageIcon("images/neTail.jpg"));
										grid1.setIcon(new ImageIcon("images/sE.jpg"));
										grid5.setIcon(new ImageIcon("images/NW3.jpg"));
									}
									if(pattern[i-1] == 4){
										grid1.setIcon(new ImageIcon("images/s.jpg"));
										grid4.setIcon(new ImageIcon("images/N2.jpg"));
									}
									break;
								default: 
									if(pattern[i-1] == 2 && pattern [i - 2] == 3){
										//grid1.setIcon(new ImageIcon("images/eTail.jpg"));
										grid1.setIcon(new ImageIcon("images/e.jpg"));
										grid2.setIcon(new ImageIcon("images/eW.jpg"));
									}
									if(pattern[i-1] == 2 && pattern [i - 2] == 6){
										//grid1.setIcon(new ImageIcon("images/eTail.jpg"));
										grid1.setIcon(new ImageIcon("images/e.jpg"));
										grid2.setIcon(new ImageIcon("images/seW.jpg"));
									}
									if(pattern[i-1] == 2 && pattern [i - 2] == 5){
										//grid1.setIcon(new ImageIcon("images/eTail.jpg"));
										grid1.setIcon(new ImageIcon("images/e.jpg"));
										grid2.setIcon(new ImageIcon("images/sW2.jpg"));
									}
									if(pattern[i-1] == 2 && pattern [i - 2] == 4){
										//grid1.setIcon(new ImageIcon("images/eTail.jpg"));
										grid1.setIcon(new ImageIcon("images/e.jpg"));
										grid2.setIcon(new ImageIcon("images/swW.jpg"));
									}
									if(pattern[i-1] == 5 && pattern [i - 2] == 2){
										//grid1.setIcon(new ImageIcon("images/eTail.jpg"));
										grid1.setIcon(new ImageIcon("images/sE.jpg"));
										grid5.setIcon(new ImageIcon("images/nNW.jpg"));
									}
									if(pattern[i-1] == 5 && pattern [i - 2] == 3){
										//grid1.setIcon(new ImageIcon("images/eTail.jpg"));
										grid1.setIcon(new ImageIcon("images/sE.jpg"));
										grid5.setIcon(new ImageIcon("images/neNW.jpg"));
									}
									if(pattern[i-1] == 5 && pattern [i - 2] == 6){
										//grid1.setIcon(new ImageIcon("images/eTail.jpg"));
										grid1.setIcon(new ImageIcon("images/sE.jpg"));
										grid5.setIcon(new ImageIcon("images/eNW.jpg"));
									}
									if(pattern[i-1] == 5 && pattern [i - 2] == 9){
										//grid1.setIcon(new ImageIcon("images/eTail.jpg"));
										grid1.setIcon(new ImageIcon("images/sE.jpg"));
										grid5.setIcon(new ImageIcon("images/seNW.jpg"));
									}
									if(pattern[i-1] == 5 && pattern [i - 2] == 8){
										//grid1.setIcon(new ImageIcon("images/eTail.jpg"));
										grid1.setIcon(new ImageIcon("images/sE.jpg"));
										grid5.setIcon(new ImageIcon("images/sNW.jpg"));
									}
									if(pattern[i-1] == 5 && pattern [i - 2] == 7){
										//grid1.setIcon(new ImageIcon("images/eTail.jpg"));
										grid1.setIcon(new ImageIcon("images/sE.jpg"));
										grid5.setIcon(new ImageIcon("images/swNW.jpg"));
									}
									if(pattern[i-1] == 5 && pattern [i - 2] == 4){
										//grid1.setIcon(new ImageIcon("images/eTail.jpg"));
										grid1.setIcon(new ImageIcon("images/sE.jpg"));
										grid5.setIcon(new ImageIcon("images/wNW.jpg"));
									}
									if(pattern[i-1] == 4 && pattern [i - 2] == 2){
										//grid1.setIcon(new ImageIcon("images/eTail.jpg"));
										grid1.setIcon(new ImageIcon("images/s.jpg"));
										grid4.setIcon(new ImageIcon("images/neN.jpg"));
									}
									if(pattern[i-1] == 4 && pattern [i - 2] == 5){
										//grid1.setIcon(new ImageIcon("images/eTail.jpg"));
										grid1.setIcon(new ImageIcon("images/s.jpg"));
										grid4.setIcon(new ImageIcon("images/eN.jpg"));
									}
									if(pattern[i-1] == 4 && pattern [i - 2] == 8){
										//grid1.setIcon(new ImageIcon("images/eTail.jpg"));
										grid1.setIcon(new ImageIcon("images/s.jpg"));
										grid4.setIcon(new ImageIcon("images/seN.jpg"));
									}
									if(pattern[i-1] == 4 && pattern [i - 2] == 7){
										//grid1.setIcon(new ImageIcon("images/eTail.jpg"));
										grid1.setIcon(new ImageIcon("images/s.jpg"));
										grid4.setIcon(new ImageIcon("images/sN.jpg"));
									}
									
									
									break;
								
								}
								i++;
							}
						});
						grid1.setBounds(250, 100, 120, 120);
						contentPane.add(grid1);
						contentPane.updateUI();
						//grid2
						grid2 = new JButton(new ImageIcon("images/square1.jpg"));
						grid2.setFocusable(false);  //Remove the focus from the button
						//Setup the button to listen and function
						grid2.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								
								pattern[i] = 2;
								contentPane.updateUI();
								switch(i){
								case 0: grid2.setIcon(new ImageIcon("images/starter.jpg"));
									break;
								case 1: 
									if(pattern[i-1] == 1){
										//grid1.setIcon(new ImageIcon("images/eTail.jpg"));
										grid2.setIcon(new ImageIcon("images/w.jpg"));
										grid1.setIcon(new ImageIcon("images/E2.jpg"));
									}
									if(pattern[i-1] == 4){
										//grid4.setIcon(new ImageIcon("images/neTail.jpg"));
										grid2.setIcon(new ImageIcon("images/sW.jpg"));
										grid4.setIcon(new ImageIcon("images/NE3.jpg"));
									}
									if(pattern[i-1] == 5){
										grid2.setIcon(new ImageIcon("images/s.jpg"));
										grid5.setIcon(new ImageIcon("images/N2.jpg"));
									}
									if(pattern[i-1] == 6){
										grid2.setIcon(new ImageIcon("images/sE.jpg"));
										grid6.setIcon(new ImageIcon("images/NW3.jpg"));
									}
									if(pattern[i-1] == 3){
										grid2.setIcon(new ImageIcon("images/e.jpg"));
										grid3.setIcon(new ImageIcon("images/W2.jpg"));
									}
									break;
								default:
									if(pattern[i-1] == 1 && pattern[i-2] == 4){
										//grid1.setIcon(new ImageIcon("images/eTail.jpg"));
										grid2.setIcon(new ImageIcon("images/w.jpg"));
										grid1.setIcon(new ImageIcon("images/sE2.jpg"));
									}	
									if(pattern[i-1] == 1 && pattern[i-2] == 5){
										//grid1.setIcon(new ImageIcon("images/eTail.jpg"));
										grid2.setIcon(new ImageIcon("images/w.jpg"));
										grid1.setIcon(new ImageIcon("images/seE.jpg"));
									}
									if(pattern[i-1] == 4 && pattern[i-2] == 1){
										//grid4.setIcon(new ImageIcon("images/neTail.jpg"));
										grid2.setIcon(new ImageIcon("images/sW.jpg"));
										grid4.setIcon(new ImageIcon("images/nNE.jpg"));
									}
									if(pattern[i-1] == 4 && pattern[i-2] == 5){
										//grid4.setIcon(new ImageIcon("images/neTail.jpg"));
										grid2.setIcon(new ImageIcon("images/sW.jpg"));
										grid4.setIcon(new ImageIcon("images/eNE.jpg"));
									}
									if(pattern[i-1] == 4 && pattern[i-2] == 7){
										//grid4.setIcon(new ImageIcon("images/neTail.jpg"));
										grid2.setIcon(new ImageIcon("images/sW.jpg"));
										grid4.setIcon(new ImageIcon("images/sNE.jpg"));
									}
									if(pattern[i-1] == 4 && pattern[i-2] == 8){
										//grid4.setIcon(new ImageIcon("images/neTail.jpg"));
										grid2.setIcon(new ImageIcon("images/sW.jpg"));
										grid4.setIcon(new ImageIcon("images/seNE.jpg"));
									}
									if(pattern[i-1] == 5 && pattern[i-2] == 1){
										grid2.setIcon(new ImageIcon("images/s.jpg"));
										grid5.setIcon(new ImageIcon("images/nwN.jpg"));
									}
									if(pattern[i-1] == 5 && pattern[i-2] == 4){
										grid2.setIcon(new ImageIcon("images/s.jpg"));
										grid5.setIcon(new ImageIcon("images/wN.jpg"));
									}
									if(pattern[i-1] == 5 && pattern[i-2] == 7){
										grid2.setIcon(new ImageIcon("images/s.jpg"));
										grid5.setIcon(new ImageIcon("images/swN.jpg"));
									}
									if(pattern[i-1] == 5 && pattern[i-2] == 8){
										grid2.setIcon(new ImageIcon("images/s.jpg"));
										grid5.setIcon(new ImageIcon("images/sN.jpg"));
									}
									if(pattern[i-1] == 5 && pattern[i-2] == 9){
										grid2.setIcon(new ImageIcon("images/s.jpg"));
										grid5.setIcon(new ImageIcon("images/seN.jpg"));
									}
									if(pattern[i-1] == 5 && pattern[i-2] == 6){
										grid2.setIcon(new ImageIcon("images/s.jpg"));
										grid5.setIcon(new ImageIcon("images/eN.jpg"));
									}
									if(pattern[i-1] == 5 && pattern[i-2] == 3){
										grid2.setIcon(new ImageIcon("images/s.jpg"));
										grid5.setIcon(new ImageIcon("images/neN.jpg"));
									}
									if(pattern[i-1] == 6 && pattern[i-2] == 3){
										grid2.setIcon(new ImageIcon("images/sE.jpg"));
										grid6.setIcon(new ImageIcon("images/nNW.jpg"));
									}
									if(pattern[i-1] == 6 && pattern[i-2] == 5){
										grid2.setIcon(new ImageIcon("images/sE.jpg"));
										grid6.setIcon(new ImageIcon("images/wNW.jpg"));
									}
									if(pattern[i-1] == 6 && pattern[i-2] == 8){
										grid2.setIcon(new ImageIcon("images/sE.jpg"));
										grid6.setIcon(new ImageIcon("images/swNW.jpg"));
									}
									if(pattern[i-1] == 6 && pattern[i-2] == 9){
										grid2.setIcon(new ImageIcon("images/sE.jpg"));
										grid6.setIcon(new ImageIcon("images/sNW.jpg"));
									}
									if(pattern[i-1] == 3 && pattern[i-2] == 6){
										grid2.setIcon(new ImageIcon("images/e.jpg"));
										grid3.setIcon(new ImageIcon("images/sW2.jpg"));
									}
									if(pattern[i-1] == 3 && pattern[i-2] == 5){
										grid2.setIcon(new ImageIcon("images/e.jpg"));
										grid3.setIcon(new ImageIcon("images/swW.jpg"));
									}
									break;
								
								}
								i++;
								//grid2.setEnabled(false);
							}
						});
						grid2.setBounds(370, 100, 120, 120);
						contentPane.add(grid2);
						contentPane.updateUI();
						//grid3
						grid3 = new JButton(new ImageIcon("images/square1.jpg"));
						grid3.setFocusable(false);  //Remove the focus from the button
						//Setup the button to listen and function
						grid3.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {

								pattern[i] = 3;
								contentPane.updateUI();
								switch(i){
								case 0: grid3.setIcon(new ImageIcon("images/starter.jpg"));
									break;
								case 1: 
									if(pattern[i-1] == 2){
										//grid1.setIcon(new ImageIcon("images/eTail.jpg"));
										grid3.setIcon(new ImageIcon("images/w.jpg"));
										grid2.setIcon(new ImageIcon("images/E2.jpg"));
									}
									if(pattern[i-1] == 5){
										//grid4.setIcon(new ImageIcon("images/neTail.jpg"));
										grid3.setIcon(new ImageIcon("images/sW.jpg"));
										grid5.setIcon(new ImageIcon("images/NE3.jpg"));
									}
									if(pattern[i-1] == 6){
										grid3.setIcon(new ImageIcon("images/s.jpg"));
										grid6.setIcon(new ImageIcon("images/N2.jpg"));
									}
									break;
								default:
									if(pattern[i-1] == 2 && pattern[i-2] == 1){
										//grid1.setIcon(new ImageIcon("images/eTail.jpg"));
										grid3.setIcon(new ImageIcon("images/w.jpg"));
										grid2.setIcon(new ImageIcon("images/wE.jpg"));
									}
									if(pattern[i-1] == 2 && pattern[i-2] == 4){
										//grid1.setIcon(new ImageIcon("images/eTail.jpg"));
										grid3.setIcon(new ImageIcon("images/w.jpg"));
										grid2.setIcon(new ImageIcon("images/swE.jpg"));
									}
									if(pattern[i-1] == 2 && pattern[i-2] == 5){
										//grid1.setIcon(new ImageIcon("images/eTail.jpg"));
										grid3.setIcon(new ImageIcon("images/w.jpg"));
										grid2.setIcon(new ImageIcon("images/sE2.jpg"));
									}
									if(pattern[i-1] == 2 && pattern[i-2] == 6){
										//grid1.setIcon(new ImageIcon("images/eTail.jpg"));
										grid3.setIcon(new ImageIcon("images/w.jpg"));
										grid2.setIcon(new ImageIcon("images/seE.jpg"));
									}
									if(pattern[i-1] == 5 && pattern[i-2] == 2){
										//grid4.setIcon(new ImageIcon("images/neTail.jpg"));
										grid3.setIcon(new ImageIcon("images/sW.jpg"));
										grid5.setIcon(new ImageIcon("images/nNE.jpg"));
									}
									if(pattern[i-1] == 5 && pattern[i-2] == 1){
										//grid4.setIcon(new ImageIcon("images/neTail.jpg"));
										grid3.setIcon(new ImageIcon("images/sW.jpg"));
										grid5.setIcon(new ImageIcon("images/nwNE.jpg"));
									}
									if(pattern[i-1] == 5 && pattern[i-2] == 4){
										//grid4.setIcon(new ImageIcon("images/neTail.jpg"));
										grid3.setIcon(new ImageIcon("images/sW.jpg"));
										grid5.setIcon(new ImageIcon("images/wNE.jpg"));
									}
									if(pattern[i-1] == 5 && pattern[i-2] == 7){
										//grid4.setIcon(new ImageIcon("images/neTail.jpg"));
										grid3.setIcon(new ImageIcon("images/sW.jpg"));
										grid5.setIcon(new ImageIcon("images/swNE.jpg"));
									}
									if(pattern[i-1] == 5 && pattern[i-2] == 8){
										//grid4.setIcon(new ImageIcon("images/neTail.jpg"));
										grid3.setIcon(new ImageIcon("images/sW.jpg"));
										grid5.setIcon(new ImageIcon("images/sNE.jpg"));
									}
									if(pattern[i-1] == 5 && pattern[i-2] == 9){
										//grid4.setIcon(new ImageIcon("images/neTail.jpg"));
										grid3.setIcon(new ImageIcon("images/sW.jpg"));
										grid5.setIcon(new ImageIcon("images/seNE.jpg"));
									}
									if(pattern[i-1] == 5 && pattern[i-2] == 6){
										//grid4.setIcon(new ImageIcon("images/neTail.jpg"));
										grid3.setIcon(new ImageIcon("images/sW.jpg"));
										grid5.setIcon(new ImageIcon("images/eNE.jpg"));
									}
									if(pattern[i-1] == 6 && pattern[i-2] == 2){
										grid3.setIcon(new ImageIcon("images/s.jpg"));
										grid6.setIcon(new ImageIcon("images/nwN.jpg"));
									}
									if(pattern[i-1] == 6 && pattern[i-2] == 5){
										grid3.setIcon(new ImageIcon("images/s.jpg"));
										grid6.setIcon(new ImageIcon("images/wN.jpg"));
									}
									if(pattern[i-1] == 6 && pattern[i-2] == 8){
										grid3.setIcon(new ImageIcon("images/s.jpg"));
										grid6.setIcon(new ImageIcon("images/swN.jpg"));
									}
									if(pattern[i-1] == 6 && pattern[i-2] == 9){
										grid3.setIcon(new ImageIcon("images/s.jpg"));
										grid6.setIcon(new ImageIcon("images/sN.jpg"));
									}

									
									break;
								
								}
								i++;					}
						});
						grid3.setBounds(490, 100, 120, 120);
						contentPane.add(grid3);
						contentPane.updateUI();
						//grid4
						grid4 = new JButton(new ImageIcon("images/square1.jpg"));
						grid4.setFocusable(false);  //Remove the focus from the button
						//Setup the button to listen and function
						grid4.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {

								pattern[i] = 4;
								contentPane.updateUI();
								switch(i){
								case 0: grid4.setIcon(new ImageIcon("images/starter.jpg"));
									break;
								case 1: 
									if(pattern[i-1] == 1){
										//grid1.setIcon(new ImageIcon("images/eTail.jpg"));
										grid4.setIcon(new ImageIcon("images/n.jpg"));
										grid1.setIcon(new ImageIcon("images/S2.jpg"));
									}
									if(pattern[i-1] == 2){
										//grid4.setIcon(new ImageIcon("images/neTail.jpg"));
										grid4.setIcon(new ImageIcon("images/nE.jpg"));
										grid2.setIcon(new ImageIcon("images/SW3.jpg"));
									}
									if(pattern[i-1] == 5){
										grid4.setIcon(new ImageIcon("images/e.jpg"));
										grid5.setIcon(new ImageIcon("images/W2.jpg"));
									}
									if(pattern[i-1] == 8){
										grid4.setIcon(new ImageIcon("images/sE.jpg"));
										grid8.setIcon(new ImageIcon("images/NW3.jpg"));
									}
									if(pattern[i-1] == 7){
										grid4.setIcon(new ImageIcon("images/s.jpg"));
										grid7.setIcon(new ImageIcon("images/N2.jpg"));
									}
									break;
								default:
									if(pattern[i-1] == 1 && pattern[i-2] == 2){
										//grid1.setIcon(new ImageIcon("images/eTail.jpg"));
										grid4.setIcon(new ImageIcon("images/n.jpg"));
										grid1.setIcon(new ImageIcon("images/eS.jpg"));
									}
									if(pattern[i-1] == 1 && pattern[i-2] == 5){
										//grid1.setIcon(new ImageIcon("images/eTail.jpg"));
										grid4.setIcon(new ImageIcon("images/n.jpg"));
										grid1.setIcon(new ImageIcon("images/seS.jpg"));
									}
									if(pattern[i-1] == 2 && pattern[i-2] == 1){
										//grid4.setIcon(new ImageIcon("images/neTail.jpg"));
										grid4.setIcon(new ImageIcon("images/nE.jpg"));
										grid2.setIcon(new ImageIcon("images/wSW.jpg"));
									}
									if(pattern[i-1] == 2 && pattern[i-2] == 5){
										//grid4.setIcon(new ImageIcon("images/neTail.jpg"));
										grid4.setIcon(new ImageIcon("images/nE.jpg"));
										grid2.setIcon(new ImageIcon("images/sSW.jpg"));
									}
									if(pattern[i-1] == 2 && pattern[i-2] == 6){
										//grid4.setIcon(new ImageIcon("images/neTail.jpg"));
										grid4.setIcon(new ImageIcon("images/nE.jpg"));
										grid2.setIcon(new ImageIcon("images/seSW.jpg"));
									}
									if(pattern[i-1] == 2 && pattern[i-2] == 3){
										//grid4.setIcon(new ImageIcon("images/neTail.jpg"));
										grid4.setIcon(new ImageIcon("images/nE.jpg"));
										grid2.setIcon(new ImageIcon("images/eSW.jpg"));
									}
									if(pattern[i-1] == 5 && pattern[i-2] == 1){
										grid4.setIcon(new ImageIcon("images/e.jpg"));
										grid5.setIcon(new ImageIcon("images/nwW.jpg"));
									}
									if(pattern[i-1] == 5 && pattern[i-2] == 2){
										grid4.setIcon(new ImageIcon("images/e.jpg"));
										grid5.setIcon(new ImageIcon("images/nW2.jpg"));
									}
									if(pattern[i-1] == 5 && pattern[i-2] == 3){
										grid4.setIcon(new ImageIcon("images/e.jpg"));
										grid5.setIcon(new ImageIcon("images/neW.jpg"));
									}
									if(pattern[i-1] == 5 && pattern[i-2] == 6){
										grid4.setIcon(new ImageIcon("images/e.jpg"));
										grid5.setIcon(new ImageIcon("images/eW.jpg"));
									}
									if(pattern[i-1] == 5 && pattern[i-2] == 9){
										grid4.setIcon(new ImageIcon("images/e.jpg"));
										grid5.setIcon(new ImageIcon("images/seW.jpg"));
									}
									if(pattern[i-1] == 5 && pattern[i-2] == 8){
										grid4.setIcon(new ImageIcon("images/e.jpg"));
										grid5.setIcon(new ImageIcon("images/sW2.jpg"));
									}
									if(pattern[i-1] == 5 && pattern[i-2] == 7){
										grid4.setIcon(new ImageIcon("images/e.jpg"));
										grid5.setIcon(new ImageIcon("images/swW.jpg"));
									}
									if(pattern[i-1] == 8 && pattern[i-2] == 7){
										grid4.setIcon(new ImageIcon("images/sE.jpg"));
										grid8.setIcon(new ImageIcon("images/wNW.jpg"));
									}
									if(pattern[i-1] == 8 && pattern[i-2] == 5){
										grid4.setIcon(new ImageIcon("images/sE.jpg"));
										grid8.setIcon(new ImageIcon("images/nNW.jpg"));
									}
									if(pattern[i-1] == 8 && pattern[i-2] == 6){
										grid4.setIcon(new ImageIcon("images/sE.jpg"));
										grid8.setIcon(new ImageIcon("images/neNW.jpg"));
									}
									if(pattern[i-1] == 8 && pattern[i-2] == 9){
										grid4.setIcon(new ImageIcon("images/sE.jpg"));
										grid8.setIcon(new ImageIcon("images/eNW.jpg"));
									}
									if(pattern[i-1] == 7 && pattern[i-2] == 5){
										grid4.setIcon(new ImageIcon("images/s.jpg"));
										grid7.setIcon(new ImageIcon("images/neN.jpg"));
									}
									if(pattern[i-1] == 7 && pattern[i-2] == 8){
										grid4.setIcon(new ImageIcon("images/s.jpg"));
										grid7.setIcon(new ImageIcon("images/eN.jpg"));
									}
									
									break;
								
								}
								i++;					}
						});
						grid4.setBounds(250, 220, 120, 120);
						contentPane.add(grid4);
						contentPane.updateUI();
						//grid5
						grid5 = new JButton(new ImageIcon("images/square1.jpg"));
						grid5.setFocusable(false);  //Remove the focus from the button
						//Setup the button to listen and function
						grid5.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {

								pattern[i] = 5;
								contentPane.updateUI();
								switch(i){
								case 0: grid5.setIcon(new ImageIcon("images/starter.jpg"));
									break;
								case 1: 
									if(pattern[i-1] == 1){
										//grid1.setIcon(new ImageIcon("images/eTail.jpg"));
										grid5.setIcon(new ImageIcon("images/nW.jpg"));
										grid1.setIcon(new ImageIcon("images/SE3.jpg"));
									}
									if(pattern[i-1] == 2){
										//grid4.setIcon(new ImageIcon("images/neTail.jpg"));
										grid5.setIcon(new ImageIcon("images/n.jpg"));
										grid2.setIcon(new ImageIcon("images/S2.jpg"));
									}
									if(pattern[i-1] == 3){
										grid5.setIcon(new ImageIcon("images/nE.jpg"));
										grid3.setIcon(new ImageIcon("images/SW3.jpg"));
									}
									if(pattern[i-1] == 4){
										grid5.setIcon(new ImageIcon("images/w.jpg"));
										grid4.setIcon(new ImageIcon("images/E2.jpg"));
									}
									if(pattern[i-1] == 6){
										grid5.setIcon(new ImageIcon("images/e.jpg"));
										grid6.setIcon(new ImageIcon("images/W2.jpg"));
									}
									if(pattern[i-1] == 7){
										grid5.setIcon(new ImageIcon("images/sW.jpg"));
										grid7.setIcon(new ImageIcon("images/NE3.jpg"));
									}
									if(pattern[i-1] == 8){
										grid5.setIcon(new ImageIcon("images/s.jpg"));
										grid8.setIcon(new ImageIcon("images/N2.jpg"));
									}
									if(pattern[i-1] == 9){
										grid5.setIcon(new ImageIcon("images/sE.jpg"));
										grid9.setIcon(new ImageIcon("images/NW3.jpg"));
									}
									break;
								default:
									if(pattern[i-1] == 1 && pattern[i-2] == 2){
										//grid1.setIcon(new ImageIcon("images/eTail.jpg"));
										grid5.setIcon(new ImageIcon("images/nW.jpg"));
										grid1.setIcon(new ImageIcon("images/eSE.jpg"));
									}
									if(pattern[i-1] == 1 && pattern[i-2] == 4){
										//grid1.setIcon(new ImageIcon("images/eTail.jpg"));
										grid5.setIcon(new ImageIcon("images/nW.jpg"));
										grid1.setIcon(new ImageIcon("images/sSE.jpg"));
									}
									if(pattern[i-1] == 2 && pattern[i-2] == 4){
										//grid4.setIcon(new ImageIcon("images/neTail.jpg"));
										grid5.setIcon(new ImageIcon("images/n.jpg"));
										grid2.setIcon(new ImageIcon("images/swS.jpg"));
									}
									if(pattern[i-1] == 2 && pattern[i-2] == 1){
										//grid4.setIcon(new ImageIcon("images/neTail.jpg"));
										grid5.setIcon(new ImageIcon("images/n.jpg"));
										grid2.setIcon(new ImageIcon("images/wS.jpg"));
									}
									if(pattern[i-1] == 2 && pattern[i-2] == 3){
										//grid4.setIcon(new ImageIcon("images/neTail.jpg"));
										grid5.setIcon(new ImageIcon("images/n.jpg"));
										grid2.setIcon(new ImageIcon("images/eS.jpg"));
									}
									if(pattern[i-1] == 2 && pattern[i-2] == 6){
										//grid4.setIcon(new ImageIcon("images/neTail.jpg"));
										grid5.setIcon(new ImageIcon("images/n.jpg"));
										grid2.setIcon(new ImageIcon("images/seS.jpg"));
									}
									if(pattern[i-1] == 3 && pattern[i-2] == 2){
										grid5.setIcon(new ImageIcon("images/nE.jpg"));
										grid3.setIcon(new ImageIcon("images/wSW.jpg"));
									}
									if(pattern[i-1] == 3 && pattern[i-2] == 6){
										grid5.setIcon(new ImageIcon("images/nE.jpg"));
										grid3.setIcon(new ImageIcon("images/sSW.jpg"));
									}
									if(pattern[i-1] == 4 && pattern[i-2] == 1){
										grid5.setIcon(new ImageIcon("images/w.jpg"));
										grid4.setIcon(new ImageIcon("images/nE2.jpg"));
									}
									if(pattern[i-1] == 4 && pattern[i-2] == 2){
										grid5.setIcon(new ImageIcon("images/w.jpg"));
										grid4.setIcon(new ImageIcon("images/neE.jpg"));
									}
									if(pattern[i-1] == 4 && pattern[i-2] == 8){
										grid5.setIcon(new ImageIcon("images/w.jpg"));
										grid4.setIcon(new ImageIcon("images/seE.jpg"));
									}
									if(pattern[i-1] == 4 && pattern[i-2] == 7){
										grid5.setIcon(new ImageIcon("images/w.jpg"));
										grid4.setIcon(new ImageIcon("images/sE2.jpg"));
									}
									if(pattern[i-1] == 6 && pattern[i-2] == 3){
										grid5.setIcon(new ImageIcon("images/e.jpg"));
										grid6.setIcon(new ImageIcon("images/nW2.jpg"));
									}
									if(pattern[i-1] == 6 && pattern[i-2] == 2){
										grid5.setIcon(new ImageIcon("images/e.jpg"));
										grid6.setIcon(new ImageIcon("images/nwW.jpg"));
									}
									if(pattern[i-1] == 6 && pattern[i-2] == 8){
										grid5.setIcon(new ImageIcon("images/e.jpg"));
										grid6.setIcon(new ImageIcon("images/swW.jpg"));
									}
									if(pattern[i-1] == 6 && pattern[i-2] == 9){
										grid5.setIcon(new ImageIcon("images/e.jpg"));
										grid6.setIcon(new ImageIcon("images/sW2.jpg"));
									}
									if(pattern[i-1] == 7 && pattern[i-2] == 4){
										grid5.setIcon(new ImageIcon("images/sW.jpg"));
										grid7.setIcon(new ImageIcon("images/nNE.jpg"));
									}
									if(pattern[i-1] == 7 && pattern[i-2] == 8){
										grid5.setIcon(new ImageIcon("images/sW.jpg"));
										grid7.setIcon(new ImageIcon("images/eNE.jpg"));
									}
									if(pattern[i-1] == 8 && pattern[i-2] == 4){
										grid5.setIcon(new ImageIcon("images/s.jpg"));
										grid8.setIcon(new ImageIcon("images/nwN.jpg"));
									}
									if(pattern[i-1] == 8 && pattern[i-2] == 7){
										grid5.setIcon(new ImageIcon("images/s.jpg"));
										grid8.setIcon(new ImageIcon("images/wN.jpg"));
									}
									if(pattern[i-1] == 8 && pattern[i-2] == 6){
										grid5.setIcon(new ImageIcon("images/s.jpg"));
										grid8.setIcon(new ImageIcon("images/neN.jpg"));
									}
									if(pattern[i-1] == 8 && pattern[i-2] == 9){
										grid5.setIcon(new ImageIcon("images/s.jpg"));
										grid8.setIcon(new ImageIcon("images/eN.jpg"));
									}
									if(pattern[i-1] == 9 && pattern[i-2] == 6){
										grid5.setIcon(new ImageIcon("images/sE.jpg"));
										grid9.setIcon(new ImageIcon("images/nNW.jpg"));
									}
									if(pattern[i-1] == 9 && pattern[i-2] == 8){
										grid5.setIcon(new ImageIcon("images/sE.jpg"));
										grid9.setIcon(new ImageIcon("images/wNW.jpg"));
									}
									break;
								
								}
								i++;					}
						});
						grid5.setBounds(370, 220, 120, 120);
						contentPane.add(grid5);
						contentPane.updateUI();
						//grid6
						grid6 = new JButton(new ImageIcon("images/square1.jpg"));
						grid6.setFocusable(false);  //Remove the focus from the button

						grid6.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {

								pattern[i] = 6;
								contentPane.updateUI();
								switch(i){
								case 0: grid6.setIcon(new ImageIcon("images/starter.jpg"));
									break;
								case 1: 
									if(pattern[i-1] == 3){
										//grid1.setIcon(new ImageIcon("images/eTail.jpg"));
										grid6.setIcon(new ImageIcon("images/n.jpg"));
										grid3.setIcon(new ImageIcon("images/S2.jpg"));
									}
									if(pattern[i-1] == 2){
										//grid4.setIcon(new ImageIcon("images/neTail.jpg"));
										grid6.setIcon(new ImageIcon("images/nW.jpg"));
										grid2.setIcon(new ImageIcon("images/SE3.jpg"));
									}
									if(pattern[i-1] == 5){
										grid6.setIcon(new ImageIcon("images/w.jpg"));
										grid5.setIcon(new ImageIcon("images/E2.jpg"));
									}
									if(pattern[i-1] == 8){
										grid6.setIcon(new ImageIcon("images/sW.jpg"));
										grid8.setIcon(new ImageIcon("images/NE3.jpg"));
									}
									if(pattern[i-1] == 9){
										grid6.setIcon(new ImageIcon("images/s.jpg"));
										grid9.setIcon(new ImageIcon("images/N2.jpg"));
									}
									break;
								default:
									if(pattern[i-1] == 3 && pattern[i-2] == 2){
										//grid1.setIcon(new ImageIcon("images/eTail.jpg"));
										grid6.setIcon(new ImageIcon("images/n.jpg"));
										grid3.setIcon(new ImageIcon("images/wS.jpg"));
									}
									if(pattern[i-1] == 3 && pattern[i-2] == 5){
										//grid1.setIcon(new ImageIcon("images/eTail.jpg"));
										grid6.setIcon(new ImageIcon("images/n.jpg"));
										grid3.setIcon(new ImageIcon("images/swS.jpg"));
									}
									if(pattern[i-1] == 2 && pattern[i-2] == 5){
										//grid4.setIcon(new ImageIcon("images/neTail.jpg"));
										grid6.setIcon(new ImageIcon("images/nW.jpg"));
										grid2.setIcon(new ImageIcon("images/sSE.jpg"));
									}
									if(pattern[i-1] == 2 && pattern[i-2] == 1){
										//grid4.setIcon(new ImageIcon("images/neTail.jpg"));
										grid6.setIcon(new ImageIcon("images/nW.jpg"));
										grid2.setIcon(new ImageIcon("images/wSE.jpg"));
									}
									if(pattern[i-1] == 2 && pattern[i-2] == 4){
										//grid4.setIcon(new ImageIcon("images/neTail.jpg"));
										grid6.setIcon(new ImageIcon("images/nW.jpg"));
										grid2.setIcon(new ImageIcon("images/swSE.jpg"));
									}
									if(pattern[i-1] == 2 && pattern[i-2] == 3){
										//grid4.setIcon(new ImageIcon("images/neTail.jpg"));
										grid6.setIcon(new ImageIcon("images/nW.jpg"));
										grid2.setIcon(new ImageIcon("images/eSE.jpg"));
									}
									if(pattern[i-1] == 5 && pattern[i-2] == 3){
										grid6.setIcon(new ImageIcon("images/w.jpg"));
										grid5.setIcon(new ImageIcon("images/neE.jpg"));
									}
									if(pattern[i-1] == 5 && pattern[i-2] == 2){
										grid6.setIcon(new ImageIcon("images/w.jpg"));
										grid5.setIcon(new ImageIcon("images/nE2.jpg"));
									}
									if(pattern[i-1] == 5 && pattern[i-2] == 1){
										grid6.setIcon(new ImageIcon("images/w.jpg"));
										grid5.setIcon(new ImageIcon("images/nwE.jpg"));
									}
									if(pattern[i-1] == 5 && pattern[i-2] == 4){
										grid6.setIcon(new ImageIcon("images/w.jpg"));
										grid5.setIcon(new ImageIcon("images/wE.jpg"));
									}
									if(pattern[i-1] == 5 && pattern[i-2] == 7){
										grid6.setIcon(new ImageIcon("images/w.jpg"));
										grid5.setIcon(new ImageIcon("images/swE.jpg"));
									}
									if(pattern[i-1] == 5 && pattern[i-2] == 8){
										grid6.setIcon(new ImageIcon("images/w.jpg"));
										grid5.setIcon(new ImageIcon("images/sE2.jpg"));
									}
									if(pattern[i-1] == 5 && pattern[i-2] == 9){
										grid6.setIcon(new ImageIcon("images/w.jpg"));
										grid5.setIcon(new ImageIcon("images/swE.jpg"));
									}
									
									if(pattern[i-1] == 8 && pattern[i-2] == 7){
										grid6.setIcon(new ImageIcon("images/sW.jpg"));
										grid8.setIcon(new ImageIcon("images/wNE.jpg"));
									}
									if(pattern[i-1] == 8 && pattern[i-2] == 4){
										grid6.setIcon(new ImageIcon("images/sW.jpg"));
										grid8.setIcon(new ImageIcon("images/nwNE.jpg"));
									}
									if(pattern[i-1] == 8 && pattern[i-2] == 5){
										grid6.setIcon(new ImageIcon("images/sW.jpg"));
										grid8.setIcon(new ImageIcon("images/nNE.jpg"));
									}
									if(pattern[i-1] == 8 && pattern[i-2] == 9){
										grid6.setIcon(new ImageIcon("images/sW.jpg"));
										grid8.setIcon(new ImageIcon("images/eNE.jpg"));
									}
									if(pattern[i-1] == 9 && pattern[i-2] == 5){
										grid6.setIcon(new ImageIcon("images/s.jpg"));
										grid9.setIcon(new ImageIcon("images/nwN.jpg"));
									}
									if(pattern[i-1] == 9 && pattern[i-2] == 8){
										grid6.setIcon(new ImageIcon("images/s.jpg"));
										grid9.setIcon(new ImageIcon("images/wN.jpg"));
									}
									break;
								
								}
								i++;					}
						});
						grid6.setBounds(490, 220, 120, 120);
						contentPane.add(grid6);
						contentPane.updateUI();
						//grid7
						grid7 = new JButton(new ImageIcon("images/square1.jpg"));
						grid7.setFocusable(false);  //Remove the focus from the button
						//Setup the button to listen and function
						grid7.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {

								pattern[i] = 7;
								contentPane.updateUI();
								switch(i){
								case 0: grid7.setIcon(new ImageIcon("images/starter.jpg"));
									break;
								case 1: 
									if(pattern[i-1] == 4){
										//grid1.setIcon(new ImageIcon("images/eTail.jpg"));
										grid7.setIcon(new ImageIcon("images/n.jpg"));
										grid4.setIcon(new ImageIcon("images/S2.jpg"));
									}
									if(pattern[i-1] == 5){
										//grid4.setIcon(new ImageIcon("images/neTail.jpg"));
										grid7.setIcon(new ImageIcon("images/nE.jpg"));
										grid5.setIcon(new ImageIcon("images/SW3.jpg"));
									}
									if(pattern[i-1] == 8){
										grid7.setIcon(new ImageIcon("images/e.jpg"));
										grid8.setIcon(new ImageIcon("images/W2.jpg"));
									}
									break;
								default:
									if(pattern[i-1] == 4 && pattern[i-2] == 8){
										//grid1.setIcon(new ImageIcon("images/eTail.jpg"));
										grid7.setIcon(new ImageIcon("images/n.jpg"));
										grid4.setIcon(new ImageIcon("images/seS.jpg"));
									}
									if(pattern[i-1] == 4 && pattern[i-2] == 5){
										//grid1.setIcon(new ImageIcon("images/eTail.jpg"));
										grid7.setIcon(new ImageIcon("images/n.jpg"));
										grid4.setIcon(new ImageIcon("images/eS.jpg"));
									}
									if(pattern[i-1] == 4 && pattern[i-2] == 2){
										//grid1.setIcon(new ImageIcon("images/eTail.jpg"));
										grid7.setIcon(new ImageIcon("images/n.jpg"));
										grid4.setIcon(new ImageIcon("images/neS.jpg"));
									}
									if(pattern[i-1] == 4 && pattern[i-2] == 1){
										//grid1.setIcon(new ImageIcon("images/eTail.jpg"));
										grid7.setIcon(new ImageIcon("images/n.jpg"));
										grid4.setIcon(new ImageIcon("images/nS.jpg"));
									}
									if(pattern[i-1] == 5 && pattern[i-2] == 4){
										//grid4.setIcon(new ImageIcon("images/neTail.jpg"));
										grid7.setIcon(new ImageIcon("images/nE.jpg"));
										grid5.setIcon(new ImageIcon("images/wSW.jpg"));
									}
									if(pattern[i-1] == 5 && pattern[i-2] == 1){
										//grid4.setIcon(new ImageIcon("images/neTail.jpg"));
										grid7.setIcon(new ImageIcon("images/nE.jpg"));
										grid5.setIcon(new ImageIcon("images/nwSW.jpg"));
									}
									if(pattern[i-1] == 5 && pattern[i-2] == 2){
										//grid4.setIcon(new ImageIcon("images/neTail.jpg"));
										grid7.setIcon(new ImageIcon("images/nE.jpg"));
										grid5.setIcon(new ImageIcon("images/nSW.jpg"));
									}
									if(pattern[i-1] == 5 && pattern[i-2] == 3){
										//grid4.setIcon(new ImageIcon("images/neTail.jpg"));
										grid7.setIcon(new ImageIcon("images/nE.jpg"));
										grid5.setIcon(new ImageIcon("images/neSW.jpg"));
									}
									if(pattern[i-1] == 5 && pattern[i-2] == 6){
										//grid4.setIcon(new ImageIcon("images/neTail.jpg"));
										grid7.setIcon(new ImageIcon("images/nE.jpg"));
										grid5.setIcon(new ImageIcon("images/eSW.jpg"));
									}
									if(pattern[i-1] == 5 && pattern[i-2] == 9){
										//grid4.setIcon(new ImageIcon("images/neTail.jpg"));
										grid7.setIcon(new ImageIcon("images/nE.jpg"));
										grid5.setIcon(new ImageIcon("images/seSW.jpg"));
									}
									if(pattern[i-1] == 5 && pattern[i-2] == 8){
										//grid4.setIcon(new ImageIcon("images/neTail.jpg"));
										grid7.setIcon(new ImageIcon("images/nE.jpg"));
										grid5.setIcon(new ImageIcon("images/sSW.jpg"));
									}
									if(pattern[i-1] == 8 && pattern[i-2] == 4){
										grid7.setIcon(new ImageIcon("images/e.jpg"));
										grid8.setIcon(new ImageIcon("images/nwW.jpg"));
									}
									if(pattern[i-1] == 8 && pattern[i-2] == 5){
										grid7.setIcon(new ImageIcon("images/e.jpg"));
										grid8.setIcon(new ImageIcon("images/nW2.jpg"));
									}
									if(pattern[i-1] == 8 && pattern[i-2] == 6){
										grid7.setIcon(new ImageIcon("images/e.jpg"));
										grid8.setIcon(new ImageIcon("images/neW.jpg"));
									}
									if(pattern[i-1] == 8 && pattern[i-2] == 9){
										grid7.setIcon(new ImageIcon("images/e.jpg"));
										grid8.setIcon(new ImageIcon("images/eW.jpg"));
									}
									break;
								
								}
								i++;					}
						});
						grid7.setBounds(250, 340, 120, 120);
						contentPane.add(grid7);
						contentPane.updateUI();
						//grid8
						grid8 = new JButton(new ImageIcon("images/square1.jpg"));
						grid8.setFocusable(false);  //Remove the focus from the button
						//Setup the button to listen and function
						grid8.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {

								pattern[i] = 8;
								contentPane.updateUI();
								switch(i){
								case 0: grid8.setIcon(new ImageIcon("images/starter.jpg"));
									break;
								case 1: 
									if(pattern[i-1] == 7){
										//grid1.setIcon(new ImageIcon("images/eTail.jpg"));
										grid8.setIcon(new ImageIcon("images/w.jpg"));
										grid7.setIcon(new ImageIcon("images/E2.jpg"));
									}
									if(pattern[i-1] == 4){
										//grid4.setIcon(new ImageIcon("images/neTail.jpg"));
										grid8.setIcon(new ImageIcon("images/nW.jpg"));
										grid4.setIcon(new ImageIcon("images/SE3.jpg"));
									}
									if(pattern[i-1] == 5){
										grid8.setIcon(new ImageIcon("images/n.jpg"));
										grid5.setIcon(new ImageIcon("images/S2.jpg"));
									}
									if(pattern[i-1] == 6){
										grid8.setIcon(new ImageIcon("images/nE.jpg"));
										grid6.setIcon(new ImageIcon("images/SW3.jpg"));
									}
									if(pattern[i-1] == 9){
										grid8.setIcon(new ImageIcon("images/e.jpg"));
										grid9.setIcon(new ImageIcon("images/W2.jpg"));
									}
									break;
								default:
									if(pattern[i-1] == 7 && pattern[i-2] == 4){
										//grid1.setIcon(new ImageIcon("images/eTail.jpg"));
										grid8.setIcon(new ImageIcon("images/w.jpg"));
										grid7.setIcon(new ImageIcon("images/nE2.jpg"));
									}
									if(pattern[i-1] == 7 && pattern[i-2] == 5){
										//grid1.setIcon(new ImageIcon("images/eTail.jpg"));
										grid8.setIcon(new ImageIcon("images/w.jpg"));
										grid7.setIcon(new ImageIcon("images/neE.jpg"));
									}
									if(pattern[i-1] == 4 && pattern[i-2] == 1){
										//grid4.setIcon(new ImageIcon("images/neTail.jpg"));
										grid8.setIcon(new ImageIcon("images/nW.jpg"));
										grid4.setIcon(new ImageIcon("images/nSE.jpg"));
									}
									if(pattern[i-1] == 4 && pattern[i-2] == 2){
										//grid4.setIcon(new ImageIcon("images/neTail.jpg"));
										grid8.setIcon(new ImageIcon("images/nW.jpg"));
										grid4.setIcon(new ImageIcon("images/neSE.jpg"));
									}
									if(pattern[i-1] == 4 && pattern[i-2] == 5){
										//grid4.setIcon(new ImageIcon("images/neTail.jpg"));
										grid8.setIcon(new ImageIcon("images/nW.jpg"));
										grid4.setIcon(new ImageIcon("images/eSE.jpg"));
									}
									if(pattern[i-1] == 4 && pattern[i-2] == 7){
										//grid4.setIcon(new ImageIcon("images/neTail.jpg"));
										grid8.setIcon(new ImageIcon("images/nW.jpg"));
										grid4.setIcon(new ImageIcon("images/sSE.jpg"));
									}
									if(pattern[i-1] == 5 && pattern[i-2] == 7){
										grid8.setIcon(new ImageIcon("images/n.jpg"));
										grid5.setIcon(new ImageIcon("images/swS.jpg"));
									}
									if(pattern[i-1] == 5 && pattern[i-2] == 4){
										grid8.setIcon(new ImageIcon("images/n.jpg"));
										grid5.setIcon(new ImageIcon("images/wS.jpg"));
									}
									if(pattern[i-1] == 5 && pattern[i-2] == 1){
										grid8.setIcon(new ImageIcon("images/n.jpg"));
										grid5.setIcon(new ImageIcon("images/nwS.jpg"));
									}
									if(pattern[i-1] == 5 && pattern[i-2] == 2){
										grid8.setIcon(new ImageIcon("images/n.jpg"));
										grid5.setIcon(new ImageIcon("images/nS.jpg"));
									}
									if(pattern[i-1] == 5 && pattern[i-2] == 3){
										grid8.setIcon(new ImageIcon("images/n.jpg"));
										grid5.setIcon(new ImageIcon("images/neS.jpg"));
									}
									if(pattern[i-1] == 5 && pattern[i-2] == 6){
										grid8.setIcon(new ImageIcon("images/n.jpg"));
										grid5.setIcon(new ImageIcon("images/eS.jpg"));
									}
									if(pattern[i-1] == 5 && pattern[i-2] == 9){
										grid8.setIcon(new ImageIcon("images/n.jpg"));
										grid5.setIcon(new ImageIcon("images/seS.jpg"));
									}
									if(pattern[i-1] == 6 && pattern[i-2] == 3){
										grid8.setIcon(new ImageIcon("images/nE.jpg"));
										grid6.setIcon(new ImageIcon("images/nSW.jpg"));
									}
									if(pattern[i-1] == 6 && pattern[i-2] == 2){
										grid8.setIcon(new ImageIcon("images/nE.jpg"));
										grid6.setIcon(new ImageIcon("images/nwSW.jpg"));
									}
									if(pattern[i-1] == 6 && pattern[i-2] == 5){
										grid8.setIcon(new ImageIcon("images/nE.jpg"));
										grid6.setIcon(new ImageIcon("images/wSW.jpg"));
									}
									if(pattern[i-1] == 6 && pattern[i-2] == 9){
										grid8.setIcon(new ImageIcon("images/nE.jpg"));
										grid6.setIcon(new ImageIcon("images/sSW.jpg"));
									}
									if(pattern[i-1] == 9 && pattern[i-2] == 6){
										grid8.setIcon(new ImageIcon("images/e.jpg"));
										grid9.setIcon(new ImageIcon("images/nW2.jpg"));
									}
									if(pattern[i-1] == 9 && pattern[i-2] == 5){
										grid8.setIcon(new ImageIcon("images/e.jpg"));
										grid9.setIcon(new ImageIcon("images/nwW.jpg"));
									}
									break;
								
								}
								i++;					}
						});
						grid8.setBounds(370, 340, 120, 120);
						contentPane.add(grid8);
						contentPane.updateUI();
						//grid9
						grid9 = new JButton(new ImageIcon("images/square1.jpg"));
						grid9.setFocusable(false);  //Remove the focus from the button
						//Setup the button to listen and function
						grid9.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {

								pattern[i] = 9;
								contentPane.updateUI();
								switch(i){
								case 0: grid9.setIcon(new ImageIcon("images/starter.jpg"));
									break;
								case 1: 
									if(pattern[i-1] == 6){
										//grid1.setIcon(new ImageIcon("images/eTail.jpg"));
										grid9.setIcon(new ImageIcon("images/n.jpg"));
										grid6.setIcon(new ImageIcon("images/S2.jpg"));
									}
									if(pattern[i-1] == 5){
										//grid4.setIcon(new ImageIcon("images/neTail.jpg"));
										grid9.setIcon(new ImageIcon("images/nW.jpg"));
										grid5.setIcon(new ImageIcon("images/SE3.jpg"));
									}
									if(pattern[i-1] == 8){
										grid9.setIcon(new ImageIcon("images/w.jpg"));
										grid8.setIcon(new ImageIcon("images/E2.jpg"));
									}
									break;
								default:
									if(pattern[i-1] == 6 && pattern[i-2] == 3){
										//grid1.setIcon(new ImageIcon("images/eTail.jpg"));
										grid9.setIcon(new ImageIcon("images/n.jpg"));
										grid6.setIcon(new ImageIcon("images/nS.jpg"));
									}
									if(pattern[i-1] == 6 && pattern[i-2] == 2){
										//grid1.setIcon(new ImageIcon("images/eTail.jpg"));
										grid9.setIcon(new ImageIcon("images/n.jpg"));
										grid6.setIcon(new ImageIcon("images/nwS.jpg"));
									}
									if(pattern[i-1] == 6 && pattern[i-2] == 5){
										//grid1.setIcon(new ImageIcon("images/eTail.jpg"));
										grid9.setIcon(new ImageIcon("images/n.jpg"));
										grid6.setIcon(new ImageIcon("images/wS.jpg"));
									}
									if(pattern[i-1] == 6 && pattern[i-2] == 8){
										//grid1.setIcon(new ImageIcon("images/eTail.jpg"));
										grid9.setIcon(new ImageIcon("images/n.jpg"));
										grid6.setIcon(new ImageIcon("images/swS.jpg"));
									}
									if(pattern[i-1] == 5 && pattern[i-2] == 8){
										//grid4.setIcon(new ImageIcon("images/neTail.jpg"));
										grid9.setIcon(new ImageIcon("images/nW.jpg"));
										grid5.setIcon(new ImageIcon("images/sSE.jpg"));
									}
									if(pattern[i-1] == 5 && pattern[i-2] == 7){
										//grid4.setIcon(new ImageIcon("images/neTail.jpg"));
										grid9.setIcon(new ImageIcon("images/nW.jpg"));
										grid5.setIcon(new ImageIcon("images/swSE.jpg"));
									}
									if(pattern[i-1] == 5 && pattern[i-2] == 4){
										//grid4.setIcon(new ImageIcon("images/neTail.jpg"));
										grid9.setIcon(new ImageIcon("images/nW.jpg"));
										grid5.setIcon(new ImageIcon("images/wSE.jpg"));
									}
									if(pattern[i-1] == 5 && pattern[i-2] == 1){
										//grid4.setIcon(new ImageIcon("images/neTail.jpg"));
										grid9.setIcon(new ImageIcon("images/nW.jpg"));
										grid5.setIcon(new ImageIcon("images/nwSE.jpg"));
									}
									if(pattern[i-1] == 5 && pattern[i-2] == 2){
										//grid4.setIcon(new ImageIcon("images/neTail.jpg"));
										grid9.setIcon(new ImageIcon("images/nW.jpg"));
										grid5.setIcon(new ImageIcon("images/nSE.jpg"));
									}
									if(pattern[i-1] == 5 && pattern[i-2] == 3){
										//grid4.setIcon(new ImageIcon("images/neTail.jpg"));
										grid9.setIcon(new ImageIcon("images/nW.jpg"));
										grid5.setIcon(new ImageIcon("images/neSE.jpg"));
									}
									if(pattern[i-1] == 5 && pattern[i-2] == 6){
										//grid4.setIcon(new ImageIcon("images/neTail.jpg"));
										grid9.setIcon(new ImageIcon("images/nW.jpg"));
										grid5.setIcon(new ImageIcon("images/eSE.jpg"));
									}
									if(pattern[i-1] == 8 && pattern[i-2] == 7){
										grid9.setIcon(new ImageIcon("images/w.jpg"));
										grid8.setIcon(new ImageIcon("images/wE.jpg"));
									}
									if(pattern[i-1] == 8 && pattern[i-2] == 4){
										grid9.setIcon(new ImageIcon("images/w.jpg"));
										grid8.setIcon(new ImageIcon("images/nwE.jpg"));
									}
									if(pattern[i-1] == 8 && pattern[i-2] == 5){
										grid9.setIcon(new ImageIcon("images/w.jpg"));
										grid8.setIcon(new ImageIcon("images/nE2.jpg"));
									}
									if(pattern[i-1] == 8 && pattern[i-2] == 6){
										grid9.setIcon(new ImageIcon("images/w.jpg"));
										grid8.setIcon(new ImageIcon("images/neE.jpg"));
									}
									break;
								
								}
								i++;					}
						});
						grid9.setBounds(490, 340, 120, 120);
						contentPane.add(grid9); 
						contentPane.updateUI();
						btnSubmit = new JButton("Submit");
						btnSubmit.setFocusable(false);  //Remove the focus from the button
						//Setup the button to listen and function
						btnSubmit.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								if(ask == 1){
								switch(image1.numb1()){
									case 1:
										if(pattern[0] == 2 && pattern[1] == 4 && pattern[2] == 5 && pattern[3] == 7 && pattern[4] == 8 && pattern[5] == 6
										&&pattern[6] == 0 && pattern[7] == 0 && pattern[8] == 0){
											//Makes an instance of the InstructionFrame
									      	Play3 winframe = new Play3();
									      	//Set properties of the frame
									      	winframe.setSize(800,600);
									      	winframe.setLocation(100, 100);
									      	winframe.setResizable(false);  //No adjusting the sizing
									      	//Makes the current frame invisible
									      	frame.setVisible(false);
									      	//Makes the new frame visible
									      	winframe.setVisible(true);
									      	
										}else{
											int x1, x2, x3, x4, x5, y1, y2, y3, y4,y5;
									        //Current x location
									        x1 = heart1.getX();
									        x2 = heart2.getX();
									        x3 = heart3.getX();
									        x4 = heart4.getX();
									        x5 = heart5.getX();
									        
									            //Current y location
									        	y1 = heart1.getY();
										        y2 = heart2.getY();
										        y3 = heart3.getY();
										        y4 = heart4.getY();
										        y5 = heart5.getY();
									            //Random movement
									            heart1.setLocation((x1 + 45), y1);
									            heart2.setLocation((x2 + 45), y1);
									            heart3.setLocation((x3 + 45), y1);
									            heart4.setLocation((x4 + 45), y1);
									            heart5.setLocation((x5 + 45), y1);
									       
									            if(x1 >= 755){
									            	GameOver lose = new GameOver();
									    	      	lose.setSize(800,600);
									   		      	lose.setLocation(100, 100);
									 			    lose.setResizable(false);     	
									    	      	frame.setVisible(false);  			    
									   		      	lose.setVisible(true);
									            }
									            grid1.setIcon(new ImageIcon("images/square1.jpg"));
									            grid2.setIcon(new ImageIcon("images/square1.jpg"));
									            grid3.setIcon(new ImageIcon("images/square1.jpg"));
									            grid4.setIcon(new ImageIcon("images/square1.jpg"));
									            grid5.setIcon(new ImageIcon("images/square1.jpg"));
									            grid6.setIcon(new ImageIcon("images/square1.jpg"));
									            grid7.setIcon(new ImageIcon("images/square1.jpg"));
									            grid8.setIcon(new ImageIcon("images/square1.jpg"));
									            grid9.setIcon(new ImageIcon("images/square1.jpg"));
									            pattern[0] =0;
									            pattern[1] =0;
									            pattern[2] =0;
									            pattern[3] =0;
									            pattern[4] =0;
									            pattern[5] =0;
									            pattern[6] =0;
									            pattern[7] =0;
									            pattern[8] =0;
									          	 i = 0;
										
										}
										break;
							    case 2: 
							    	if(pattern[0] == 9 && pattern[1] == 6 && pattern[2] == 5 && pattern[3] == 8 && pattern[4] == 7 && pattern[5] == 4
									&&pattern[6] == 2 && pattern[7] == 0 && pattern[8] == 0){
							    		//Makes an instance of the InstructionFrame
								      	Play3 winframe = new Play3();
								      	//Set properties of the frame
								      	winframe.setSize(800,600);
								      	winframe.setLocation(100, 100);
								      	winframe.setResizable(false);  //No adjusting the sizing
								      	//Makes the current frame invisible
								      	frame.setVisible(false);
								      	//Makes the new frame visible
								      	winframe.setVisible(true);
									}else{
										int x1, x2, x3, x4, x5, y1, y2, y3, y4,y5;
								        //Current x location
								        x1 = heart1.getX();
								        x2 = heart2.getX();
								        x3 = heart3.getX();
								        x4 = heart4.getX();
								        x5 = heart5.getX();
								        
								            //Current y location
								        	y1 = heart1.getY();
									        y2 = heart2.getY();
									        y3 = heart3.getY();
									        y4 = heart4.getY();
									        y5 = heart5.getY();
								            //Random movement
								            heart1.setLocation((x1 + 45), y1);
								            heart2.setLocation((x2 + 45), y1);
								            heart3.setLocation((x3 + 45), y1);
								            heart4.setLocation((x4 + 45), y1);
								            heart5.setLocation((x5 + 45), y1);
								       
								            if(x1 >= 755){
								            	GameOver lose = new GameOver();
								    	      	lose.setSize(800,600);
								   		      	lose.setLocation(100, 100);
								 			    lose.setResizable(false);     	
								    	      	frame.setVisible(false);  			    
								   		      	lose.setVisible(true);
								            }
								            grid1.setIcon(new ImageIcon("images/square1.jpg"));
								            grid2.setIcon(new ImageIcon("images/square1.jpg"));
								            grid3.setIcon(new ImageIcon("images/square1.jpg"));
								            grid4.setIcon(new ImageIcon("images/square1.jpg"));
								            grid5.setIcon(new ImageIcon("images/square1.jpg"));
								            grid6.setIcon(new ImageIcon("images/square1.jpg"));
								            grid7.setIcon(new ImageIcon("images/square1.jpg"));
								            grid8.setIcon(new ImageIcon("images/square1.jpg"));
								            grid9.setIcon(new ImageIcon("images/square1.jpg"));
								            pattern[0] =0;
								            pattern[1] =0;
								            pattern[2] =0;
								            pattern[3] =0;
								            pattern[4] =0;
								            pattern[5] =0;
								            pattern[6] =0;
								            pattern[7] =0;
								            pattern[8] =0;
								            i = 0;
									}
							    	break;
							    case 3:
							    	if(pattern[0] == 1 && pattern[1] == 4 && pattern[2] == 5 && pattern[3] == 2 && pattern[4] == 3 && pattern[5] == 6
									&&pattern[6] == 9 && pattern[7] == 0 && pattern[8] == 0){
							    		//Makes an instance of the InstructionFrame
								      	Play3 winframe = new Play3();
								      	//Set properties of the frame
								      	winframe.setSize(800,600);
								      	winframe.setLocation(100, 100);
								      	winframe.setResizable(false);  //No adjusting the sizing
								      	//Makes the current frame invisible
								      	frame.setVisible(false);
								      	//Makes the new frame visible
								      	winframe.setVisible(true);
									}else{
										int x1, x2, x3, x4, x5, y1, y2, y3, y4,y5;
								        //Current x location
								        x1 = heart1.getX();
								        x2 = heart2.getX();
								        x3 = heart3.getX();
								        x4 = heart4.getX();
								        x5 = heart5.getX();
								        
								            //Current y location
								        	y1 = heart1.getY();
									        y2 = heart2.getY();
									        y3 = heart3.getY();
									        y4 = heart4.getY();
									        y5 = heart5.getY();
								            //Random movement
								            heart1.setLocation((x1 + 45), y1);
								            heart2.setLocation((x2 + 45), y1);
								            heart3.setLocation((x3 + 45), y1);
								            heart4.setLocation((x4 + 45), y1);
								            heart5.setLocation((x5 + 45), y1);
								       
								            if(x1 >= 755){
								            	GameOver lose = new GameOver();
								    	      	lose.setSize(800,600);
								   		      	lose.setLocation(100, 100);
								 			    lose.setResizable(false);     	
								    	      	frame.setVisible(false);  			    
								   		      	lose.setVisible(true);
								            }
								            grid1.setIcon(new ImageIcon("images/square1.jpg"));
								            grid2.setIcon(new ImageIcon("images/square1.jpg"));
								            grid3.setIcon(new ImageIcon("images/square1.jpg"));
								            grid4.setIcon(new ImageIcon("images/square1.jpg"));
								            grid5.setIcon(new ImageIcon("images/square1.jpg"));
								            grid6.setIcon(new ImageIcon("images/square1.jpg"));
								            grid7.setIcon(new ImageIcon("images/square1.jpg"));
								            grid8.setIcon(new ImageIcon("images/square1.jpg"));
								            grid9.setIcon(new ImageIcon("images/square1.jpg"));
								            pattern[0] =0;
								            pattern[1] =0;
								            pattern[2] =0;
								            pattern[3] =0;
								            pattern[4] =0;
								            pattern[5] =0;
								            pattern[6] =0;
								            pattern[7] =0;
								            pattern[8] =0;
								            i = 0;
									}
								break;
							    case 4:
							    	if(pattern[0] == 1 && pattern[1] == 2 && pattern[2] == 5 && pattern[3] == 9 && pattern[4] == 8 && pattern[5] == 7
									&&pattern[6] == 0 && pattern[7] == 0 && pattern[8] == 0){
							    		//Makes an instance of the InstructionFrame
								      	Play3 winframe = new Play3();
								      	//Set properties of the frame
								      	winframe.setSize(800,600);
								      	winframe.setLocation(100, 100);
								      	winframe.setResizable(false);  //No adjusting the sizing
								      	//Makes the current frame invisible
								      	frame.setVisible(false);
								      	//Makes the new frame visible
								      	winframe.setVisible(true);
									}else{
										int x1, x2, x3, x4, x5, y1, y2, y3, y4,y5;
								        //Current x location
								        x1 = heart1.getX();
								        x2 = heart2.getX();
								        x3 = heart3.getX();
								        x4 = heart4.getX();
								        x5 = heart5.getX();
								        
								            //Current y location
								        	y1 = heart1.getY();
									        y2 = heart2.getY();
									        y3 = heart3.getY();
									        y4 = heart4.getY();
									        y5 = heart5.getY();
								            //Random movement
								            heart1.setLocation((x1 + 45), y1);
								            heart2.setLocation((x2 + 45), y1);
								            heart3.setLocation((x3 + 45), y1);
								            heart4.setLocation((x4 + 45), y1);
								            heart5.setLocation((x5 + 45), y1);
								       
								            if(x1 >= 755){
								            	GameOver lose = new GameOver();
								    	      	lose.setSize(800,600);
								   		      	lose.setLocation(100, 100);
								 			    lose.setResizable(false);     	
								    	      	frame.setVisible(false);  			    
								   		      	lose.setVisible(true);
								            }
								            grid1.setIcon(new ImageIcon("images/square1.jpg"));
								            grid2.setIcon(new ImageIcon("images/square1.jpg"));
								            grid3.setIcon(new ImageIcon("images/square1.jpg"));
								            grid4.setIcon(new ImageIcon("images/square1.jpg"));
								            grid5.setIcon(new ImageIcon("images/square1.jpg"));
								            grid6.setIcon(new ImageIcon("images/square1.jpg"));
								            grid7.setIcon(new ImageIcon("images/square1.jpg"));
								            grid8.setIcon(new ImageIcon("images/square1.jpg"));
								            grid9.setIcon(new ImageIcon("images/square1.jpg"));
								            pattern[0] =0;
								            pattern[1] =0;
								            pattern[2] =0;
								            pattern[3] =0;
								            pattern[4] =0;
								            pattern[5] =0;
								            pattern[6] =0;
								            pattern[7] =0;
								            pattern[8] =0;
								            i = 0;
									}
							    	break;
							    case 5:
							    	if(pattern[0] == 4 && pattern[1] == 1 && pattern[2] == 5 && pattern[3] == 2 && pattern[4] == 3 && pattern[5] == 6
									&&pattern[6] == 0 && pattern[7] == 0 && pattern[8] == 0){
							    		//Makes an instance of the InstructionFrame
								      	Play3 winframe = new Play3();
								      	//Set properties of the frame
								      	winframe.setSize(800,600);
								      	winframe.setLocation(100, 100);
								      	winframe.setResizable(false);  //No adjusting the sizing
								      	//Makes the current frame invisible
								      	frame.setVisible(false);
								      	//Makes the new frame visible
								      	winframe.setVisible(true);
									}else{
										int x1, x2, x3, x4, x5, y1, y2, y3, y4,y5;
								        //Current x location
								        x1 = heart1.getX();
								        x2 = heart2.getX();
								        x3 = heart3.getX();
								        x4 = heart4.getX();
								        x5 = heart5.getX();
								        
								            //Current y location
								        	y1 = heart1.getY();
									        y2 = heart2.getY();
									        y3 = heart3.getY();
									        y4 = heart4.getY();
									        y5 = heart5.getY();
								            //Random movement
								            heart1.setLocation((x1 + 45), y1);
								            heart2.setLocation((x2 + 45), y1);
								            heart3.setLocation((x3 + 45), y1);
								            heart4.setLocation((x4 + 45), y1);
								            heart5.setLocation((x5 + 45), y1);
								       
								            if(x1 >= 755){
								            	GameOver lose = new GameOver();
								    	      	lose.setSize(800,600);
								   		      	lose.setLocation(100, 100);
								 			    lose.setResizable(false);     	
								    	      	frame.setVisible(false);  			    
								   		      	lose.setVisible(true);
								            }
								            grid1.setIcon(new ImageIcon("images/square1.jpg"));
								            grid2.setIcon(new ImageIcon("images/square1.jpg"));
								            grid3.setIcon(new ImageIcon("images/square1.jpg"));
								            grid4.setIcon(new ImageIcon("images/square1.jpg"));
								            grid5.setIcon(new ImageIcon("images/square1.jpg"));
								            grid6.setIcon(new ImageIcon("images/square1.jpg"));
								            grid7.setIcon(new ImageIcon("images/square1.jpg"));
								            grid8.setIcon(new ImageIcon("images/square1.jpg"));
								            grid9.setIcon(new ImageIcon("images/square1.jpg"));
								            pattern[0] =0;
								            pattern[1] =0;
								            pattern[2] =0;
								            pattern[3] =0;
								            pattern[4] =0;
								            pattern[5] =0;
								            pattern[6] =0;
								            pattern[7] =0;
								            pattern[8] =0;
								            i = 0;
									}
							    	break;
							    case 6:
							    	if(pattern[0] == 1 && pattern[1] == 5 && pattern[2] == 2 && pattern[3] == 4 && pattern[4] == 7 && pattern[5] == 8
									&&pattern[6] == 0 && pattern[7] == 0 && pattern[8] == 0){
							    		//Makes an instance of the InstructionFrame
								      	Play3 winframe = new Play3();
								      	//Set properties of the frame
								      	winframe.setSize(800,600);
								      	winframe.setLocation(100, 100);
								      	winframe.setResizable(false);  //No adjusting the sizing
								      	//Makes the current frame invisible
								      	frame.setVisible(false);
								      	//Makes the new frame visible
								      	winframe.setVisible(true);
									}else{
										int x1, x2, x3, x4, x5, y1, y2, y3, y4,y5;
								        //Current x location
								        x1 = heart1.getX();
								        x2 = heart2.getX();
								        x3 = heart3.getX();
								        x4 = heart4.getX();
								        x5 = heart5.getX();
								        
								            //Current y location
								        	y1 = heart1.getY();
									        y2 = heart2.getY();
									        y3 = heart3.getY();
									        y4 = heart4.getY();
									        y5 = heart5.getY();
								            //Random movement
								            heart1.setLocation((x1 + 45), y1);
								            heart2.setLocation((x2 + 45), y1);
								            heart3.setLocation((x3 + 45), y1);
								            heart4.setLocation((x4 + 45), y1);
								            heart5.setLocation((x5 + 45), y1);
								       
								            if(x1 >= 755){
								            	GameOver lose = new GameOver();
								    	      	lose.setSize(800,600);
								   		      	lose.setLocation(100, 100);
								 			    lose.setResizable(false);     	
								    	      	frame.setVisible(false);  			    
								   		      	lose.setVisible(true);
								            }
								            grid1.setIcon(new ImageIcon("images/square1.jpg"));
								            grid2.setIcon(new ImageIcon("images/square1.jpg"));
								            grid3.setIcon(new ImageIcon("images/square1.jpg"));
								            grid4.setIcon(new ImageIcon("images/square1.jpg"));
								            grid5.setIcon(new ImageIcon("images/square1.jpg"));
								            grid6.setIcon(new ImageIcon("images/square1.jpg"));
								            grid7.setIcon(new ImageIcon("images/square1.jpg"));
								            grid8.setIcon(new ImageIcon("images/square1.jpg"));
								            grid9.setIcon(new ImageIcon("images/square1.jpg"));
								            pattern[0] =0;
								            pattern[1] =0;
								            pattern[2] =0;
								            pattern[3] =0;
								            pattern[4] =0;
								            pattern[5] =0;
								            pattern[6] =0;
								            pattern[7] =0;
								            pattern[8] =0;
								            i = 0;
									}
							    	break;
							    case 7:
							    	if(pattern[0] == 8 && pattern[1] == 4 && pattern[2] == 1 && pattern[3] == 5 && pattern[4] == 2 && pattern[5] == 6
									&&pattern[6] == 0 && pattern[7] == 0 && pattern[8] == 0){
							    		//Makes an instance of the InstructionFrame
								      	Play3 winframe = new Play3();
								      	//Set properties of the frame
								      	winframe.setSize(800,600);
								      	winframe.setLocation(100, 100);
								      	winframe.setResizable(false);  //No adjusting the sizing
								      	//Makes the current frame invisible
								      	frame.setVisible(false);
								      	//Makes the new frame visible
								      	winframe.setVisible(true);
									}else{
										int x1, x2, x3, x4, x5, y1, y2, y3, y4,y5;
								        //Current x location
								        x1 = heart1.getX();
								        x2 = heart2.getX();
								        x3 = heart3.getX();
								        x4 = heart4.getX();
								        x5 = heart5.getX();
								        
								            //Current y location
								        	y1 = heart1.getY();
									        y2 = heart2.getY();
									        y3 = heart3.getY();
									        y4 = heart4.getY();
									        y5 = heart5.getY();
								            //Random movement
								            heart1.setLocation((x1 + 45), y1);
								            heart2.setLocation((x2 + 45), y1);
								            heart3.setLocation((x3 + 45), y1);
								            heart4.setLocation((x4 + 45), y1);
								            heart5.setLocation((x5 + 45), y1);
								       
								            if(x1 >= 755){
								            	GameOver lose = new GameOver();
								    	      	lose.setSize(800,600);
								   		      	lose.setLocation(100, 100);
								 			    lose.setResizable(false);     	
								    	      	frame.setVisible(false);  			    
								   		      	lose.setVisible(true);
								            }
								            grid1.setIcon(new ImageIcon("images/square1.jpg"));
								            grid2.setIcon(new ImageIcon("images/square1.jpg"));
								            grid3.setIcon(new ImageIcon("images/square1.jpg"));
								            grid4.setIcon(new ImageIcon("images/square1.jpg"));
								            grid5.setIcon(new ImageIcon("images/square1.jpg"));
								            grid6.setIcon(new ImageIcon("images/square1.jpg"));
								            grid7.setIcon(new ImageIcon("images/square1.jpg"));
								            grid8.setIcon(new ImageIcon("images/square1.jpg"));
								            grid9.setIcon(new ImageIcon("images/square1.jpg"));
								            pattern[0] =0;
								            pattern[1] =0;
								            pattern[2] =0;
								            pattern[3] =0;
								            pattern[4] =0;
								            pattern[5] =0;
								            pattern[6] =0;
								            pattern[7] =0;
								            pattern[8] =0;
								            i = 0;
									}
							    	break;
							    case 8:
							    	if(pattern[0] == 6 && pattern[1] == 8 && pattern[2] == 5 && pattern[3] == 4 && pattern[4] == 2 && pattern[5] == 0
									&&pattern[6] == 0 && pattern[7] == 0 && pattern[8] == 0){
							    		//Makes an instance of the InstructionFrame
								      	Play3 winframe = new Play3();
								      	//Set properties of the frame
								      	winframe.setSize(800,600);
								      	winframe.setLocation(100, 100);
								      	winframe.setResizable(false);  //No adjusting the sizing
								      	//Makes the current frame invisible
								      	frame.setVisible(false);
								      	//Makes the new frame visible
								      	winframe.setVisible(true);
									}else{
										int x1, x2, x3, x4, x5, y1, y2, y3, y4,y5;
								        //Current x location
								        x1 = heart1.getX();
								        x2 = heart2.getX();
								        x3 = heart3.getX();
								        x4 = heart4.getX();
								        x5 = heart5.getX();
								        
								            //Current y location
								        	y1 = heart1.getY();
									        y2 = heart2.getY();
									        y3 = heart3.getY();
									        y4 = heart4.getY();
									        y5 = heart5.getY();
								            //Random movement
								            heart1.setLocation((x1 + 45), y1);
								            heart2.setLocation((x2 + 45), y1);
								            heart3.setLocation((x3 + 45), y1);
								            heart4.setLocation((x4 + 45), y1);
								            heart5.setLocation((x5 + 45), y1);
								       
								            if(x1 >= 755){
								            	GameOver lose = new GameOver();
								    	      	lose.setSize(800,600);
								   		      	lose.setLocation(100, 100);
								 			    lose.setResizable(false);     	
								    	      	frame.setVisible(false);  			    
								   		      	lose.setVisible(true);
								            }
								            grid1.setIcon(new ImageIcon("images/square1.jpg"));
								            grid2.setIcon(new ImageIcon("images/square1.jpg"));
								            grid3.setIcon(new ImageIcon("images/square1.jpg"));
								            grid4.setIcon(new ImageIcon("images/square1.jpg"));
								            grid5.setIcon(new ImageIcon("images/square1.jpg"));
								            grid6.setIcon(new ImageIcon("images/square1.jpg"));
								            grid7.setIcon(new ImageIcon("images/square1.jpg"));
								            grid8.setIcon(new ImageIcon("images/square1.jpg"));
								            grid9.setIcon(new ImageIcon("images/square1.jpg"));
								            pattern[0] =0;
								            pattern[1] =0;
								            pattern[2] =0;
								            pattern[3] =0;
								            pattern[4] =0;
								            pattern[5] =0;
								            pattern[6] =0;
								            pattern[7] =0;
								            pattern[8] =0;
								            i = 0;
									}
							    	break;
							    case 9:
							    	if(pattern[0] == 4 && pattern[1] == 5 && pattern[2] == 2 && pattern[3] == 3 && pattern[4] == 6 && pattern[5] == 8
									&&pattern[6] == 0 && pattern[7] == 0 && pattern[8] == 0){
							    		//Makes an instance of the InstructionFrame
								      	Play3 winframe = new Play3();
								      	//Set properties of the frame
								      	winframe.setSize(800,600);
								      	winframe.setLocation(100, 100);
								      	winframe.setResizable(false);  //No adjusting the sizing
								      	//Makes the current frame invisible
								      	frame.setVisible(false);
								      	//Makes the new frame visible
								      	winframe.setVisible(true);
									}else{
										int x1, x2, x3, x4, x5, y1, y2, y3, y4,y5;
								        //Current x location
								        x1 = heart1.getX();
								        x2 = heart2.getX();
								        x3 = heart3.getX();
								        x4 = heart4.getX();
								        x5 = heart5.getX();
								        
								            //Current y location
								        	y1 = heart1.getY();
									        y2 = heart2.getY();
									        y3 = heart3.getY();
									        y4 = heart4.getY();
									        y5 = heart5.getY();
								            //Random movement
								            heart1.setLocation((x1 + 45), y1);
								            heart2.setLocation((x2 + 45), y1);
								            heart3.setLocation((x3 + 45), y1);
								            heart4.setLocation((x4 + 45), y1);
								            heart5.setLocation((x5 + 45), y1);
								       
								            if(x1 >= 755){
								            	GameOver lose = new GameOver();
								    	      	lose.setSize(800,600);
								   		      	lose.setLocation(100, 100);
								 			    lose.setResizable(false);     	
								    	      	frame.setVisible(false);  			    
								   		      	lose.setVisible(true);
								            }
								            grid1.setIcon(new ImageIcon("images/square1.jpg"));
								            grid2.setIcon(new ImageIcon("images/square1.jpg"));
								            grid3.setIcon(new ImageIcon("images/square1.jpg"));
								            grid4.setIcon(new ImageIcon("images/square1.jpg"));
								            grid5.setIcon(new ImageIcon("images/square1.jpg"));
								            grid6.setIcon(new ImageIcon("images/square1.jpg"));
								            grid7.setIcon(new ImageIcon("images/square1.jpg"));
								            grid8.setIcon(new ImageIcon("images/square1.jpg"));
								            grid9.setIcon(new ImageIcon("images/square1.jpg"));
								            int [] pattern = {0, 0, 0, 0, 0, 0, 0, 0, 0};
								            i = 0;
									}
							    	break;
							    case 10:
							    	if(pattern[0] == 1 && pattern[1] == 2 && pattern[2] == 5 && pattern[3] == 4 && pattern[4] == 7 && pattern[5] == 8
									&&pattern[6] == 6 && pattern[7] == 3 && pattern[8] == 0){
							    		//Makes an instance of the InstructionFrame
								      	Play3 winframe = new Play3();
								      	//Set properties of the frame
								      	winframe.setSize(800,600);
								      	winframe.setLocation(100, 100);
								      	winframe.setResizable(false);  //No adjusting the sizing
								      	//Makes the current frame invisible
								      	frame.setVisible(false);
								      	//Makes the new frame visible
								      	winframe.setVisible(true);
									}else{
										int x1, x2, x3, x4, x5, y1, y2, y3, y4,y5;
								        //Current x location
								        x1 = heart1.getX();
								        x2 = heart2.getX();
								        x3 = heart3.getX();
								        x4 = heart4.getX();
								        x5 = heart5.getX();
								        
								            //Current y location
								        	y1 = heart1.getY();
									        y2 = heart2.getY();
									        y3 = heart3.getY();
									        y4 = heart4.getY();
									        y5 = heart5.getY();
								            //Random movement
								            heart1.setLocation((x1 + 45), y1);
								            heart2.setLocation((x2 + 45), y1);
								            heart3.setLocation((x3 + 45), y1);
								            heart4.setLocation((x4 + 45), y1);
								            heart5.setLocation((x5 + 45), y1);
								       
								            if(x1 >= 755){
								            	GameOver lose = new GameOver();
								    	      	lose.setSize(800,600);
								   		      	lose.setLocation(100, 100);
								 			    lose.setResizable(false);     	
								    	      	frame.setVisible(false);  			    
								   		      	lose.setVisible(true);
								            }
								            grid1.setIcon(new ImageIcon("images/square1.jpg"));
								            grid2.setIcon(new ImageIcon("images/square1.jpg"));
								            grid3.setIcon(new ImageIcon("images/square1.jpg"));
								            grid4.setIcon(new ImageIcon("images/square1.jpg"));
								            grid5.setIcon(new ImageIcon("images/square1.jpg"));
								            grid6.setIcon(new ImageIcon("images/square1.jpg"));
								            grid7.setIcon(new ImageIcon("images/square1.jpg"));
								            grid8.setIcon(new ImageIcon("images/square1.jpg"));
								            grid9.setIcon(new ImageIcon("images/square1.jpg"));
								            pattern[0] =0;
								            pattern[1] =0;
								            pattern[2] =0;
								            pattern[3] =0;
								            pattern[4] =0;
								            pattern[5] =0;
								            pattern[6] =0;
								            pattern[7] =0;
								            pattern[8] =0;
								            i = 0;
									}
								}
							}
							if(ask == 2){
								switch(image2.numb2()){
								case 11:
									if(pattern[0] == 4 && pattern[1] == 2 && pattern[2] == 5 && pattern[3] == 9 && pattern[4] == 8 && pattern[5] == 6
									&&pattern[6] == 3 && pattern[7] == 0 && pattern[8] == 0){
										//Makes an instance of the InstructionFrame
								      	Play3 winframe = new Play3();
								      	//Set properties of the frame
								      	winframe.setSize(800,600);
								      	winframe.setLocation(100, 100);
								      	winframe.setResizable(false);  //No adjusting the sizing
								      	//Makes the current frame invisible
								      	frame.setVisible(false);
								      	//Makes the new frame visible
								      	winframe.setVisible(true);
								      	
									}else{
										int x1, x2, x3, x4, x5, y1, y2, y3, y4,y5;
								        //Current x location
								        x1 = heart1.getX();
								        x2 = heart2.getX();
								        x3 = heart3.getX();
								        x4 = heart4.getX();
								        x5 = heart5.getX();
								        
								            //Current y location
								        	y1 = heart1.getY();
									        y2 = heart2.getY();
									        y3 = heart3.getY();
									        y4 = heart4.getY();
									        y5 = heart5.getY();
								            //Random movement
								            heart1.setLocation((x1 + 45), y1);
								            heart2.setLocation((x2 + 45), y1);
								            heart3.setLocation((x3 + 45), y1);
								            heart4.setLocation((x4 + 45), y1);
								            heart5.setLocation((x5 + 45), y1);
								       
								            if(x1 >= 755){
								            	GameOver lose = new GameOver();
								    	      	lose.setSize(800,600);
								   		      	lose.setLocation(100, 100);
								 			    lose.setResizable(false);     	
								    	      	frame.setVisible(false);  			    
								   		      	lose.setVisible(true);
								            }
								            grid1.setIcon(new ImageIcon("images/square1.jpg"));
								            grid2.setIcon(new ImageIcon("images/square1.jpg"));
								            grid3.setIcon(new ImageIcon("images/square1.jpg"));
								            grid4.setIcon(new ImageIcon("images/square1.jpg"));
								            grid5.setIcon(new ImageIcon("images/square1.jpg"));
								            grid6.setIcon(new ImageIcon("images/square1.jpg"));
								            grid7.setIcon(new ImageIcon("images/square1.jpg"));
								            grid8.setIcon(new ImageIcon("images/square1.jpg"));
								            grid9.setIcon(new ImageIcon("images/square1.jpg"));
								            pattern[0] =0;
								            pattern[1] =0;
								            pattern[2] =0;
								            pattern[3] =0;
								            pattern[4] =0;
								            pattern[5] =0;
								            pattern[6] =0;
								            pattern[7] =0;
								            pattern[8] =0;
								          	 i = 0;
									
									}
									break;
						    case 12: 
						    	if(pattern[0] == 4 && pattern[1] == 2 && pattern[2] == 5 && pattern[3] == 7 && pattern[4] == 8 && pattern[5] == 9
								&&pattern[6] == 0 && pattern[7] == 0 && pattern[8] == 0){
						    		//Makes an instance of the InstructionFrame
							      	Play3 winframe = new Play3();
							      	//Set properties of the frame
							      	winframe.setSize(800,600);
							      	winframe.setLocation(100, 100);
							      	winframe.setResizable(false);  //No adjusting the sizing
							      	//Makes the current frame invisible
							      	frame.setVisible(false);
							      	//Makes the new frame visible
							      	winframe.setVisible(true);
								}else{
									int x1, x2, x3, x4, x5, y1, y2, y3, y4,y5;
							        //Current x location
							        x1 = heart1.getX();
							        x2 = heart2.getX();
							        x3 = heart3.getX();
							        x4 = heart4.getX();
							        x5 = heart5.getX();
							        
							            //Current y location
							        	y1 = heart1.getY();
								        y2 = heart2.getY();
								        y3 = heart3.getY();
								        y4 = heart4.getY();
								        y5 = heart5.getY();
							            //Random movement
							            heart1.setLocation((x1 + 45), y1);
							            heart2.setLocation((x2 + 45), y1);
							            heart3.setLocation((x3 + 45), y1);
							            heart4.setLocation((x4 + 45), y1);
							            heart5.setLocation((x5 + 45), y1);
							       
							            if(x1 >= 755){
							            	GameOver lose = new GameOver();
							    	      	lose.setSize(800,600);
							   		      	lose.setLocation(100, 100);
							 			    lose.setResizable(false);     	
							    	      	frame.setVisible(false);  			    
							   		      	lose.setVisible(true);
							            }
							            grid1.setIcon(new ImageIcon("images/square1.jpg"));
							            grid2.setIcon(new ImageIcon("images/square1.jpg"));
							            grid3.setIcon(new ImageIcon("images/square1.jpg"));
							            grid4.setIcon(new ImageIcon("images/square1.jpg"));
							            grid5.setIcon(new ImageIcon("images/square1.jpg"));
							            grid6.setIcon(new ImageIcon("images/square1.jpg"));
							            grid7.setIcon(new ImageIcon("images/square1.jpg"));
							            grid8.setIcon(new ImageIcon("images/square1.jpg"));
							            grid9.setIcon(new ImageIcon("images/square1.jpg"));
							            pattern[0] =0;
							            pattern[1] =0;
							            pattern[2] =0;
							            pattern[3] =0;
							            pattern[4] =0;
							            pattern[5] =0;
							            pattern[6] =0;
							            pattern[7] =0;
							            pattern[8] =0;
							            i = 0;
								}
						    	break;
						    case 13:
						    	if(pattern[0] == 4 && pattern[1] == 2 && pattern[2] == 5 && pattern[3] == 3 && pattern[4] == 6 && pattern[5] == 0
								&&pattern[6] == 0 && pattern[7] == 0 && pattern[8] == 0){
						    		//Makes an instance of the InstructionFrame
							      	Play3 winframe = new Play3();
							      	//Set properties of the frame
							      	winframe.setSize(800,600);
							      	winframe.setLocation(100, 100);
							      	winframe.setResizable(false);  //No adjusting the sizing
							      	//Makes the current frame invisible
							      	frame.setVisible(false);
							      	//Makes the new frame visible
							      	winframe.setVisible(true);
								}else{
									int x1, x2, x3, x4, x5, y1, y2, y3, y4,y5;
							        //Current x location
							        x1 = heart1.getX();
							        x2 = heart2.getX();
							        x3 = heart3.getX();
							        x4 = heart4.getX();
							        x5 = heart5.getX();
							        
							            //Current y location
							        	y1 = heart1.getY();
								        y2 = heart2.getY();
								        y3 = heart3.getY();
								        y4 = heart4.getY();
								        y5 = heart5.getY();
							            //Random movement
							            heart1.setLocation((x1 + 45), y1);
							            heart2.setLocation((x2 + 45), y1);
							            heart3.setLocation((x3 + 45), y1);
							            heart4.setLocation((x4 + 45), y1);
							            heart5.setLocation((x5 + 45), y1);
							       
							            if(x1 >= 755){
							            	GameOver lose = new GameOver();
							    	      	lose.setSize(800,600);
							   		      	lose.setLocation(100, 100);
							 			    lose.setResizable(false);     	
							    	      	frame.setVisible(false);  			    
							   		      	lose.setVisible(true);
							            }
							            grid1.setIcon(new ImageIcon("images/square1.jpg"));
							            grid2.setIcon(new ImageIcon("images/square1.jpg"));
							            grid3.setIcon(new ImageIcon("images/square1.jpg"));
							            grid4.setIcon(new ImageIcon("images/square1.jpg"));
							            grid5.setIcon(new ImageIcon("images/square1.jpg"));
							            grid6.setIcon(new ImageIcon("images/square1.jpg"));
							            grid7.setIcon(new ImageIcon("images/square1.jpg"));
							            grid8.setIcon(new ImageIcon("images/square1.jpg"));
							            grid9.setIcon(new ImageIcon("images/square1.jpg"));
							            pattern[0] =0;
							            pattern[1] =0;
							            pattern[2] =0;
							            pattern[3] =0;
							            pattern[4] =0;
							            pattern[5] =0;
							            pattern[6] =0;
							            pattern[7] =0;
							            pattern[8] =0;
							            i = 0;
								}
							break;
						    case 14:
						    	if(pattern[0] == 8 && pattern[1] == 7 && pattern[2] == 4 && pattern[3] == 2 && pattern[4] == 6 && pattern[5] == 0
								&&pattern[6] == 0 && pattern[7] == 0 && pattern[8] == 0){
						    		//Makes an instance of the InstructionFrame
							      	Play3 winframe = new Play3();
							      	//Set properties of the frame
							      	winframe.setSize(800,600);
							      	winframe.setLocation(100, 100);
							      	winframe.setResizable(false);  //No adjusting the sizing
							      	//Makes the current frame invisible
							      	frame.setVisible(false);
							      	//Makes the new frame visible
							      	winframe.setVisible(true);
								}else{
									int x1, x2, x3, x4, x5, y1, y2, y3, y4,y5;
							        //Current x location
							        x1 = heart1.getX();
							        x2 = heart2.getX();
							        x3 = heart3.getX();
							        x4 = heart4.getX();
							        x5 = heart5.getX();
							        
							            //Current y location
							        	y1 = heart1.getY();
								        y2 = heart2.getY();
								        y3 = heart3.getY();
								        y4 = heart4.getY();
								        y5 = heart5.getY();
							            //Random movement
							            heart1.setLocation((x1 + 45), y1);
							            heart2.setLocation((x2 + 45), y1);
							            heart3.setLocation((x3 + 45), y1);
							            heart4.setLocation((x4 + 45), y1);
							            heart5.setLocation((x5 + 45), y1);
							       
							            if(x1 >= 755){
							            	GameOver lose = new GameOver();
							    	      	lose.setSize(800,600);
							   		      	lose.setLocation(100, 100);
							 			    lose.setResizable(false);     	
							    	      	frame.setVisible(false);  			    
							   		      	lose.setVisible(true);
							            }
							            grid1.setIcon(new ImageIcon("images/square1.jpg"));
							            grid2.setIcon(new ImageIcon("images/square1.jpg"));
							            grid3.setIcon(new ImageIcon("images/square1.jpg"));
							            grid4.setIcon(new ImageIcon("images/square1.jpg"));
							            grid5.setIcon(new ImageIcon("images/square1.jpg"));
							            grid6.setIcon(new ImageIcon("images/square1.jpg"));
							            grid7.setIcon(new ImageIcon("images/square1.jpg"));
							            grid8.setIcon(new ImageIcon("images/square1.jpg"));
							            grid9.setIcon(new ImageIcon("images/square1.jpg"));
							            pattern[0] =0;
							            pattern[1] =0;
							            pattern[2] =0;
							            pattern[3] =0;
							            pattern[4] =0;
							            pattern[5] =0;
							            pattern[6] =0;
							            pattern[7] =0;
							            pattern[8] =0;
							            i = 0;
								}
						    	break;
						    case 15:
						    	if(pattern[0] == 1 && pattern[1] == 4 && pattern[2] == 7 && pattern[3] == 8 && pattern[4] == 9 && pattern[5] == 6
								&&pattern[6] == 5 && pattern[7] == 2 && pattern[8] == 0){
						    		//Makes an instance of the InstructionFrame
							      	Play3 winframe = new Play3();
							      	//Set properties of the frame
							      	winframe.setSize(800,600);
							      	winframe.setLocation(100, 100);
							      	winframe.setResizable(false);  //No adjusting the sizing
							      	//Makes the current frame invisible
							      	frame.setVisible(false);
							      	//Makes the new frame visible
							      	winframe.setVisible(true);
								}else{
									int x1, x2, x3, x4, x5, y1, y2, y3, y4,y5;
							        //Current x location
							        x1 = heart1.getX();
							        x2 = heart2.getX();
							        x3 = heart3.getX();
							        x4 = heart4.getX();
							        x5 = heart5.getX();
							        
							            //Current y location
							        	y1 = heart1.getY();
								        y2 = heart2.getY();
								        y3 = heart3.getY();
								        y4 = heart4.getY();
								        y5 = heart5.getY();
							            //Random movement
							            heart1.setLocation((x1 + 45), y1);
							            heart2.setLocation((x2 + 45), y1);
							            heart3.setLocation((x3 + 45), y1);
							            heart4.setLocation((x4 + 45), y1);
							            heart5.setLocation((x5 + 45), y1);
							       
							            if(x1 >= 755){
							            	GameOver lose = new GameOver();
							    	      	lose.setSize(800,600);
							   		      	lose.setLocation(100, 100);
							 			    lose.setResizable(false);     	
							    	      	frame.setVisible(false);  			    
							   		      	lose.setVisible(true);
							            }
							            grid1.setIcon(new ImageIcon("images/square1.jpg"));
							            grid2.setIcon(new ImageIcon("images/square1.jpg"));
							            grid3.setIcon(new ImageIcon("images/square1.jpg"));
							            grid4.setIcon(new ImageIcon("images/square1.jpg"));
							            grid5.setIcon(new ImageIcon("images/square1.jpg"));
							            grid6.setIcon(new ImageIcon("images/square1.jpg"));
							            grid7.setIcon(new ImageIcon("images/square1.jpg"));
							            grid8.setIcon(new ImageIcon("images/square1.jpg"));
							            grid9.setIcon(new ImageIcon("images/square1.jpg"));
							            pattern[0] =0;
							            pattern[1] =0;
							            pattern[2] =0;
							            pattern[3] =0;
							            pattern[4] =0;
							            pattern[5] =0;
							            pattern[6] =0;
							            pattern[7] =0;
							            pattern[8] =0;
							            i = 0;
								}
						    	break;
						    case 16:
						    	if(pattern[0] == 7 && pattern[1] == 4 && pattern[2] == 2 && pattern[3] == 6 && pattern[4] == 5 && pattern[5] == 8
								&&pattern[6] == 9 && pattern[7] == 0 && pattern[8] == 0){
						    		//Makes an instance of the InstructionFrame
							      	Play3 winframe = new Play3();
							      	//Set properties of the frame
							      	winframe.setSize(800,600);
							      	winframe.setLocation(100, 100);
							      	winframe.setResizable(false);  //No adjusting the sizing
							      	//Makes the current frame invisible
							      	frame.setVisible(false);
							      	//Makes the new frame visible
							      	winframe.setVisible(true);
								}else{
									int x1, x2, x3, x4, x5, y1, y2, y3, y4,y5;
							        //Current x location
							        x1 = heart1.getX();
							        x2 = heart2.getX();
							        x3 = heart3.getX();
							        x4 = heart4.getX();
							        x5 = heart5.getX();
							        
							            //Current y location
							        	y1 = heart1.getY();
								        y2 = heart2.getY();
								        y3 = heart3.getY();
								        y4 = heart4.getY();
								        y5 = heart5.getY();
							            //Random movement
							            heart1.setLocation((x1 + 45), y1);
							            heart2.setLocation((x2 + 45), y1);
							            heart3.setLocation((x3 + 45), y1);
							            heart4.setLocation((x4 + 45), y1);
							            heart5.setLocation((x5 + 45), y1);
							       
							            if(x1 >= 755){
							            	GameOver lose = new GameOver();
							    	      	lose.setSize(800,600);
							   		      	lose.setLocation(100, 100);
							 			    lose.setResizable(false);     	
							    	      	frame.setVisible(false);  			    
							   		      	lose.setVisible(true);
							            }
							            grid1.setIcon(new ImageIcon("images/square1.jpg"));
							            grid2.setIcon(new ImageIcon("images/square1.jpg"));
							            grid3.setIcon(new ImageIcon("images/square1.jpg"));
							            grid4.setIcon(new ImageIcon("images/square1.jpg"));
							            grid5.setIcon(new ImageIcon("images/square1.jpg"));
							            grid6.setIcon(new ImageIcon("images/square1.jpg"));
							            grid7.setIcon(new ImageIcon("images/square1.jpg"));
							            grid8.setIcon(new ImageIcon("images/square1.jpg"));
							            grid9.setIcon(new ImageIcon("images/square1.jpg"));
							            pattern[0] =0;
							            pattern[1] =0;
							            pattern[2] =0;
							            pattern[3] =0;
							            pattern[4] =0;
							            pattern[5] =0;
							            pattern[6] =0;
							            pattern[7] =0;
							            pattern[8] =0;
							            i = 0;
								}
						    	break;
						    case 17:
						    	if(pattern[0] == 4 && pattern[1] == 7 && pattern[2] == 8 && pattern[3] == 6 && pattern[4] == 2 && pattern[5] == 0
								&&pattern[6] == 0 && pattern[7] == 0 && pattern[8] == 0){
						    		//Makes an instance of the InstructionFrame
							      	Play3 winframe = new Play3();
							      	//Set properties of the frame
							      	winframe.setSize(800,600);
							      	winframe.setLocation(100, 100);
							      	winframe.setResizable(false);  //No adjusting the sizing
							      	//Makes the current frame invisible
							      	frame.setVisible(false);
							      	//Makes the new frame visible
							      	winframe.setVisible(true);
								}else{
									int x1, x2, x3, x4, x5, y1, y2, y3, y4,y5;
							        //Current x location
							        x1 = heart1.getX();
							        x2 = heart2.getX();
							        x3 = heart3.getX();
							        x4 = heart4.getX();
							        x5 = heart5.getX();
							        
							            //Current y location
							        	y1 = heart1.getY();
								        y2 = heart2.getY();
								        y3 = heart3.getY();
								        y4 = heart4.getY();
								        y5 = heart5.getY();
							            //Random movement
							            heart1.setLocation((x1 + 45), y1);
							            heart2.setLocation((x2 + 45), y1);
							            heart3.setLocation((x3 + 45), y1);
							            heart4.setLocation((x4 + 45), y1);
							            heart5.setLocation((x5 + 45), y1);
							       
							            if(x1 >= 755){
							            	GameOver lose = new GameOver();
							    	      	lose.setSize(800,600);
							   		      	lose.setLocation(100, 100);
							 			    lose.setResizable(false);     	
							    	      	frame.setVisible(false);  			    
							   		      	lose.setVisible(true);
							            }
							            grid1.setIcon(new ImageIcon("images/square1.jpg"));
							            grid2.setIcon(new ImageIcon("images/square1.jpg"));
							            grid3.setIcon(new ImageIcon("images/square1.jpg"));
							            grid4.setIcon(new ImageIcon("images/square1.jpg"));
							            grid5.setIcon(new ImageIcon("images/square1.jpg"));
							            grid6.setIcon(new ImageIcon("images/square1.jpg"));
							            grid7.setIcon(new ImageIcon("images/square1.jpg"));
							            grid8.setIcon(new ImageIcon("images/square1.jpg"));
							            grid9.setIcon(new ImageIcon("images/square1.jpg"));
							            pattern[0] =0;
							            pattern[1] =0;
							            pattern[2] =0;
							            pattern[3] =0;
							            pattern[4] =0;
							            pattern[5] =0;
							            pattern[6] =0;
							            pattern[7] =0;
							            pattern[8] =0;
							            i = 0;
								}
						    	break;
						    case 18:
						    	if(pattern[0] == 2 && pattern[1] == 4 && pattern[2] == 5 && pattern[3] == 3 && pattern[4] == 6 && pattern[5] == 8
								&&pattern[6] == 7 && pattern[7] == 0 && pattern[8] == 0){
						    		//Makes an instance of the InstructionFrame
							      	Play3 winframe = new Play3();
							      	//Set properties of the frame
							      	winframe.setSize(800,600);
							      	winframe.setLocation(100, 100);
							      	winframe.setResizable(false);  //No adjusting the sizing
							      	//Makes the current frame invisible
							      	frame.setVisible(false);
							      	//Makes the new frame visible
							      	winframe.setVisible(true);
								}else{
									int x1, x2, x3, x4, x5, y1, y2, y3, y4,y5;
							        //Current x location
							        x1 = heart1.getX();
							        x2 = heart2.getX();
							        x3 = heart3.getX();
							        x4 = heart4.getX();
							        x5 = heart5.getX();
							        
							            //Current y location
							        	y1 = heart1.getY();
								        y2 = heart2.getY();
								        y3 = heart3.getY();
								        y4 = heart4.getY();
								        y5 = heart5.getY();
							            //Random movement
							            heart1.setLocation((x1 + 45), y1);
							            heart2.setLocation((x2 + 45), y1);
							            heart3.setLocation((x3 + 45), y1);
							            heart4.setLocation((x4 + 45), y1);
							            heart5.setLocation((x5 + 45), y1);
							       
							            if(x1 >= 755){
							            	GameOver lose = new GameOver();
							    	      	lose.setSize(800,600);
							   		      	lose.setLocation(100, 100);
							 			    lose.setResizable(false);     	
							    	      	frame.setVisible(false);  			    
							   		      	lose.setVisible(true);
							            }
							            grid1.setIcon(new ImageIcon("images/square1.jpg"));
							            grid2.setIcon(new ImageIcon("images/square1.jpg"));
							            grid3.setIcon(new ImageIcon("images/square1.jpg"));
							            grid4.setIcon(new ImageIcon("images/square1.jpg"));
							            grid5.setIcon(new ImageIcon("images/square1.jpg"));
							            grid6.setIcon(new ImageIcon("images/square1.jpg"));
							            grid7.setIcon(new ImageIcon("images/square1.jpg"));
							            grid8.setIcon(new ImageIcon("images/square1.jpg"));
							            grid9.setIcon(new ImageIcon("images/square1.jpg"));
							            pattern[0] =0;
							            pattern[1] =0;
							            pattern[2] =0;
							            pattern[3] =0;
							            pattern[4] =0;
							            pattern[5] =0;
							            pattern[6] =0;
							            pattern[7] =0;
							            pattern[8] =0;
							            i = 0;
								}
						    	break;
						    case 19:
						    	if(pattern[0] == 7 && pattern[1] == 8 && pattern[2] == 5 && pattern[3] == 4 && pattern[4] == 2 && pattern[5] == 3
								&&pattern[6] == 0 && pattern[7] == 0 && pattern[8] == 0){
						    		//Makes an instance of the InstructionFrame
							      	Play3 winframe = new Play3();
							      	//Set properties of the frame
							      	winframe.setSize(800,600);
							      	winframe.setLocation(100, 100);
							      	winframe.setResizable(false);  //No adjusting the sizing
							      	//Makes the current frame invisible
							      	frame.setVisible(false);
							      	//Makes the new frame visible
							      	winframe.setVisible(true);
								}else{
									int x1, x2, x3, x4, x5, y1, y2, y3, y4,y5;
							        //Current x location
							        x1 = heart1.getX();
							        x2 = heart2.getX();
							        x3 = heart3.getX();
							        x4 = heart4.getX();
							        x5 = heart5.getX();
							        
							            //Current y location
							        	y1 = heart1.getY();
								        y2 = heart2.getY();
								        y3 = heart3.getY();
								        y4 = heart4.getY();
								        y5 = heart5.getY();
							            //Random movement
							            heart1.setLocation((x1 + 45), y1);
							            heart2.setLocation((x2 + 45), y1);
							            heart3.setLocation((x3 + 45), y1);
							            heart4.setLocation((x4 + 45), y1);
							            heart5.setLocation((x5 + 45), y1);
							       
							            if(x1 >= 755){
							            	GameOver lose = new GameOver();
							    	      	lose.setSize(800,600);
							   		      	lose.setLocation(100, 100);
							 			    lose.setResizable(false);     	
							    	      	frame.setVisible(false);  			    
							   		      	lose.setVisible(true);
							            }
							            grid1.setIcon(new ImageIcon("images/square1.jpg"));
							            grid2.setIcon(new ImageIcon("images/square1.jpg"));
							            grid3.setIcon(new ImageIcon("images/square1.jpg"));
							            grid4.setIcon(new ImageIcon("images/square1.jpg"));
							            grid5.setIcon(new ImageIcon("images/square1.jpg"));
							            grid6.setIcon(new ImageIcon("images/square1.jpg"));
							            grid7.setIcon(new ImageIcon("images/square1.jpg"));
							            grid8.setIcon(new ImageIcon("images/square1.jpg"));
							            grid9.setIcon(new ImageIcon("images/square1.jpg"));
							            pattern[0] =0;
							            pattern[1] =0;
							            pattern[2] =0;
							            pattern[3] =0;
							            pattern[4] =0;
							            pattern[5] =0;
							            pattern[6] =0;
							            pattern[7] =0;
							            pattern[8] =0;
							            i = 0;
								}
						    	break;
						    case 20:
						    	if(pattern[0] == 6 && pattern[1] == 9 && pattern[2] == 8 && pattern[3] == 5 && pattern[4] == 4 && pattern[5] == 2
								&&pattern[6] == 0 && pattern[7] == 0 && pattern[8] == 0){
						    		//Makes an instance of the InstructionFrame
							      	Play3 winframe = new Play3();
							      	//Set properties of the frame
							      	winframe.setSize(800,600);
							      	winframe.setLocation(100, 100);
							      	winframe.setResizable(false);  //No adjusting the sizing
							      	//Makes the current frame invisible
							      	frame.setVisible(false);
							      	//Makes the new frame visible
							      	winframe.setVisible(true);
								}else{
									int x1, x2, x3, x4, x5, y1, y2, y3, y4,y5;
							        //Current x location
							        x1 = heart1.getX();
							        x2 = heart2.getX();
							        x3 = heart3.getX();
							        x4 = heart4.getX();
							        x5 = heart5.getX();
							        
							            //Current y location
							        	y1 = heart1.getY();
								        y2 = heart2.getY();
								        y3 = heart3.getY();
								        y4 = heart4.getY();
								        y5 = heart5.getY();
							            //Random movement
							            heart1.setLocation((x1 + 45), y1);
							            heart2.setLocation((x2 + 45), y1);
							            heart3.setLocation((x3 + 45), y1);
							            heart4.setLocation((x4 + 45), y1);
							            heart5.setLocation((x5 + 45), y1);
							       
							            if(x1 >= 755){
							            	GameOver lose = new GameOver();
							    	      	lose.setSize(800,600);
							   		      	lose.setLocation(100, 100);
							 			    lose.setResizable(false);     	
							    	      	frame.setVisible(false);  			    
							   		      	lose.setVisible(true);
							            }
							            grid1.setIcon(new ImageIcon("images/square1.jpg"));
							            grid2.setIcon(new ImageIcon("images/square1.jpg"));
							            grid3.setIcon(new ImageIcon("images/square1.jpg"));
							            grid4.setIcon(new ImageIcon("images/square1.jpg"));
							            grid5.setIcon(new ImageIcon("images/square1.jpg"));
							            grid6.setIcon(new ImageIcon("images/square1.jpg"));
							            grid7.setIcon(new ImageIcon("images/square1.jpg"));
							            grid8.setIcon(new ImageIcon("images/square1.jpg"));
							            grid9.setIcon(new ImageIcon("images/square1.jpg"));
							            pattern[0] =0;
							            pattern[1] =0;
							            pattern[2] =0;
							            pattern[3] =0;
							            pattern[4] =0;
							            pattern[5] =0;
							            pattern[6] =0;
							            pattern[7] =0;
							            pattern[8] =0;
							            i = 0;
								}
							}
							}
						}
		    	  	});
						btnSubmit.setBounds(700, 300, 118, 30);
						contentPane.add(btnSubmit);
						contentPane.updateUI();
		    		}

		    		
		    		updateTimer(sub);
		    	}

		    },0,1000);
	}
	public void updateTimer(long sub){
		int s=(int)(sub/1000%60);
		String str =""+s;
	    SimpleDateFormat sdf=new SimpleDateFormat("ss");
	    Date date=new Date();
	    Font font=new Font("Default", Font.PLAIN, 40);
	    label.setFont(font);
	    try{
	    	date=sdf.parse(str);
		    }catch(Exception e){
		    e.printStackTrace();
		    }
		label.setText(sdf.format(date));
	    System.out.println(sdf.format(date));

	}
}

