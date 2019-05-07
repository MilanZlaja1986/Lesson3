package optional;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		Robot r2d2 = new Robot();
		
		
		for (int i = 0; i < 10; i++) {
			String userAnswer = JOptionPane.showInputDialog("Please tell me what color whould you like the tortoise to draw: ");
			
			if(userAnswer.equals("green")) {
				r2d2.setPenColor(java.awt.Color.green);
			} 
			else if (userAnswer.equals("red")) {
				r2d2.setPenColor(java.awt.Color.red);
			} 
			else if (userAnswer.equals("yellow")) {
				r2d2.setPenColor(java.awt.Color.yellow);
			} 
			else if(userAnswer.equals("blue")){
				r2d2.setPenColor(java.awt.Color.blue);
			} 
			else {
				r2d2.setRandomPenColor();
			}
		}
		
		r2d2.setPenWidth(10);
		r2d2.setSpeed(10);
		r2d2.penDown();
		
		for (int k = 0; k < 4; k++) {
			r2d2.move(100);
			r2d2.turn(90);
		}
	}
}
