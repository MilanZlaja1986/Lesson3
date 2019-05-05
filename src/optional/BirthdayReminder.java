package optional;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
		
		
		String momsBirthday = "June 25th";
		String dadsBirthday = "August 8th";
		String milansBirthday = "August 11th";
		String nikolasBirthday = "May 12th";
		

		// 2. Find out which birthday the user wants and and store their response in a variable
		String userAnswer = JOptionPane.showInputDialog("Witch birthday user wants: ");
	
		System.out.println(userAnswer);
		
		// 4. if user asked for "mom"
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		
		if(userAnswer.equals("mom")){
			JOptionPane.showMessageDialog(null, momsBirthday);
		} 
		else if(userAnswer.equals("dad")){
			JOptionPane.showMessageDialog(null, dadsBirthday);
		}
		else if(userAnswer.equals("Milan")){
			JOptionPane.showMessageDialog(null, milansBirthday);
		}
		else if(userAnswer.equals("Nikola")){
			JOptionPane.showMessageDialog(null, nikolasBirthday);
		}
		else {
			JOptionPane.showMessageDialog(null, "Sorry, i don't remember that person's birthday!");
		}

	}
}
