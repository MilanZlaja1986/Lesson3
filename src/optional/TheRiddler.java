package optional;

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {
		
		int score = 0;
		String userAnswer = JOptionPane.showInputDialog("Brothers and sisters I have none, but this man's father is my father's son. \nWho is the man?");
		
		if (userAnswer.equals("my son")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
		} 
		else {
			JOptionPane.showMessageDialog(null, "Wrong. My son is corect answer.");
		}
		
		userAnswer = JOptionPane.showInputDialog("What can travel around the world while staying in a corner?");
		
		if (userAnswer.equals("stamp")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
		} 
		else {
			JOptionPane.showMessageDialog(null, "Wrong. Stamp is corect answer.");
		}
		
        userAnswer = JOptionPane.showInputDialog("What has hands but can not clap?");
		
		if (userAnswer.equals("clock")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
		} 
		else {
			JOptionPane.showMessageDialog(null, "Wrong. Clock is corect answer.");
		}
		
	
		JOptionPane.showMessageDialog(null, "Your score is :" + score);
		
	}
}

