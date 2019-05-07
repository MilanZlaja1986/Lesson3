package optional;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
		
		
		String momsBirthday = "June 25th";
		String dadsBirthday = "August 8th";
		String milansBirthday = "August 11th";
		
		

		
		String userAnswer = JOptionPane.showInputDialog("Witch birthday user wants: ");
	
		System.out.println(userAnswer);
		
		
		if(userAnswer.equals("mom")){
			JOptionPane.showMessageDialog(null, momsBirthday);
		} 
		else if(userAnswer.equals("dad")){
			JOptionPane.showMessageDialog(null, dadsBirthday);
		}
		else if(userAnswer.equals("Milan")){
			JOptionPane.showMessageDialog(null, milansBirthday);
		}
		else {
			JOptionPane.showMessageDialog(null, "Sorry, i don't remember that person's birthday!");
		}

	}
}
