package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		System.out.println("Hello World!");

		Robot ineedhelp = new Robot();
		ineedhelp.penDown();
		ineedhelp.setPenColor(Color.red);
		ineedhelp.setPenWidth(50);
		ineedhelp.setSpeed(50);
		for (int i = 0; i < 4; i++) {
			ineedhelp.move(200);
		ineedhelp.turn(90);
		}
		
		ineedhelp.penUp();
		ineedhelp.setX(500);
		ineedhelp.setY(200);
		ineedhelp.penDown();
		ineedhelp.move(1);
		ineedhelp.penUp();
		ineedhelp.setX(600);
		ineedhelp.setY(200);
		ineedhelp.penDown();
		ineedhelp.move(1);
		ineedhelp.penUp();
		ineedhelp.move(100);
		ineedhelp.setX(550);
		ineedhelp.setY(225);
		ineedhelp.penDown();
		ineedhelp.move(1);
		ineedhelp.penUp();
		ineedhelp.move(100);
		ineedhelp.penDown();
		ineedhelp.setX(470);
		ineedhelp.setY(250);
		ineedhelp.setAngle(90);
		ineedhelp.move(125);
		ineedhelp.penUp();
		ineedhelp.move(100);
		
		
	}
}
