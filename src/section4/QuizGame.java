package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 0;
		// 2.  Ask the user a question 
	String question1 = JOptionPane.showInputDialog("Who is the best team in the NFL?");
		// 3.  Use an if statement to check if their answer is correct
		if(question1.equals("49ers")){
			// 4.  if the user's answer is correct
			JOptionPane.showMessageDialog(null, "You are correct");
			// -- add one to their score 
			score=score = +1;
		}
		else {
	JOptionPane.showMessageDialog(null, "You obviously dont know alot about football boii ");
			}
		// 6.  After all the questions have been asked, print the user's score 
		
	}
}
