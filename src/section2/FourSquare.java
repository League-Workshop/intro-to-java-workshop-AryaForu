package section2;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
Robot ineedhelp = new Robot();
	void go() {
		// 4. Make the robot move as fast as possible
		ineedhelp.setSpeed(500);
		// 5. Set the pen width to 5
	
		ineedhelp.setSpeed(500);
		// 6. Use a for loop to repeat steps #7 to #8, four times...
		for (int i = 0; i < 4; i++) {
			// 7. Set the pen color to random
	ineedhelp.setRandomPenColor();
			// 1. Call the drawSquare() method
	drawSquare();
			// 8. Turn the robot 90 degrees to the right
ineedhelp.turn(90);
	}
	}
	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		ineedhelp.penDown();
		ineedhelp.setPenWidth(5);
		ineedhelp.setSpeed(500);
		for (int i = 0; i < 4; i++) {
			ineedhelp.move(200);
			ineedhelp.turn(90);
		}
		
		
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}



