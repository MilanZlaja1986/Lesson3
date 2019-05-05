package exercises;

import javax.swing.JOptionPane;

/* See the diagram in the "doc" directory. */

public class AreYouHappy {
	public static void main(String[] args) {
	
		String userAnswer = JOptionPane.showInputDialog("Are you happy: ");
		
		
		if(userAnswer.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
		}
		
		if(userAnswer.equals("no")) {
			String userAnswer1 = JOptionPane.showInputDialog("Do you want to be happy: ");
			
			if(userAnswer1.equals("yes")) 
			{
				JOptionPane.showMessageDialog(null, "Change something");
			} 
			else if(userAnswer1.equals("no")) 
			{
				JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
			}
			else 
			{
				JOptionPane.showMessageDialog(null, "Invalid input.");
			}
		}
		 	
	}

}
