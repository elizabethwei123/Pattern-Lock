package patternlock;

import java.awt.*;

public class Application1 {

	//Launch the Java program using the Application1 Default Constructor.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//Make an Application1 object
					Application1 window = new Application1();
//					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//Application1 Default Constructor
	public Application1() {
		//Call the initialize method
		initialize();
	}

	//Setup
	private void initialize() {
		//Makes an instance of the MenuFrame
      	MainMenu menuFrame = new MainMenu();
      	//Set properties of the frame
      	menuFrame.setSize(800,600);
      	menuFrame.setLocation(100, 100);
      	menuFrame.setResizable(false);  //No adjusting the sizing
      	//Makes the new frame visible
      	menuFrame.setVisible(true);
	}
}
