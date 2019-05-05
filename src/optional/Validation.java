package optional;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {

		// 1. Watch the first 2 minutes of this movie: http://vimeo.com/2485018
		int randomNumber = new Random().nextInt(5);
		// 2. On paper, write all the numbers that get printed when you run this class
		System.out.println(randomNumber);

		// 3. Use the randomNumber to give the user a random compliment.

		// 4. Repeat all the code above 10 times
		for (int i = 0; i < 10; i++) {
			if (randomNumber == 1) {
				JOptionPane.showMessageDialog(null, "You look very pretty today!");
			} 
			else if(randomNumber == 2) {
				JOptionPane.showMessageDialog(null, "You have a nice suit!");
			} 
			else if(randomNumber == 3) {
				JOptionPane.showMessageDialog(null, "I think you have a nice smile. Let me see you smile!");
			}
			else if(randomNumber == 4) {
				JOptionPane.showMessageDialog(null, "I think you have a beautiful eyes. Am I right?");
			} 
			else if(randomNumber == 5) {
				JOptionPane.showMessageDialog(null, "I think you are awesome.");
			} 
			else {
				JOptionPane.showMessageDialog(null, "I think you have a nice hearcut.");
				
			}
			
		
		
		
		}
		
		
		// 5. Find someone to test out your program. They will like it :)
	}
}
		
		
		
		
		


