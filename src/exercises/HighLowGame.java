package exercises;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		int randomNumber = random.nextInt(101);
		
		boolean userGuess = false;
		String userInputString;
		int userNumber;
		
		while(!userGuess)
		{
			userInputString = JOptionPane.showInputDialog("Guess the number ");
			userNumber = Integer.parseInt(userInputString);
			if(userNumber > randomNumber){
				JOptionPane.showInputDialog(null, "High, try again.");	
			} else if (userNumber < randomNumber){
				JOptionPane.showInputDialog(null, "Low, try again.");
			} else {
				JOptionPane.showInputDialog(null, "Congradulations, you guessed the number.");
				userGuess = true;				
			}
			
		}
		System.exit(0);

	}


}
