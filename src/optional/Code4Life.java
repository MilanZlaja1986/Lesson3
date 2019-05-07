package optional;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class Code4Life {
	
	
	public static void main(String[] args) {
		
		String userAnswer = JOptionPane.showInputDialog("How many hours do you spend this week?");
		int answer = Integer.parseInt(userAnswer);
		
		if (answer > 5) {
			playBatmanTheme();
		}else if (answer >= 3) {
			JOptionPane.showMessageDialog(null, "You are a Code Ninja");
		}else  {
			JOptionPane.showMessageDialog(null, "You need to stop watching YouTube and write code instead.");
		}
	}
	

	private static void playBatmanTheme() {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("src/batman.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(60002);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}

