package exercises;

import javax.swing.JOptionPane;

import voce.SpeechSynthesizer;


public class SpeakAndSpell {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Hi. If you want to play, press the OK button and wait to hear the word.");
		int score = 0;
		String spellingWord = "mandlebrot";
		speak(spellingWord);
	
		String userAnswer = JOptionPane.showInputDialog("Try to spell the word.");
		
		if (userAnswer.equals(spellingWord)) {
			speak("correct");
			score += 3;
		} 
		else {
			speak("wrong");
			score -= 1;
		}

		JOptionPane.showMessageDialog(null, "Hi. Press OK buton for next word!");
		spellingWord = "curriculum";
		speak(spellingWord);
		userAnswer = JOptionPane.showInputDialog("Try to spell the word.");
		
		if (userAnswer.equals(spellingWord)) {
			speak("correct");
			score += 3;
		} 
		else {
			speak("wrong");
			score -= 1;
		}
		
		JOptionPane.showMessageDialog(null, "Hi. Press OK buton for next word!");
		spellingWord = "requirement";
		speak(spellingWord);
		userAnswer = JOptionPane.showInputDialog("Try to spell the word.");
		
		if (userAnswer.equals(spellingWord)) {
			speak("correct");
			score += 3;
		} 
		else {
			speak("wrong");
			score -= 1;
		}
		
		JOptionPane.showMessageDialog(null, "Hi. Press OK buton for next word!");
		spellingWord = "equipment";
		speak(spellingWord);
		userAnswer = JOptionPane.showInputDialog("Try to spell the word.");
		
		if (userAnswer.equals(spellingWord)) {
			speak("correct");
			score += 3;
		} 
		else {
			speak("wrong");
			score -= 1;
		}
		
		JOptionPane.showMessageDialog(null, "Hi. Press OK buton for next word!");
		spellingWord = "examination";
		speak(spellingWord);
		userAnswer = JOptionPane.showInputDialog("Try to spell the word.");
		
		if (userAnswer.equals(spellingWord)) {
			speak("correct");
			score += 3;
		} 
		else {
			speak("wrong");
			score -= 1;
		}
		
		JOptionPane.showMessageDialog(null, "Your score is " + score);
		
		
		if (score <= 15) {
			speak("Awesome. Great job.");
		} 
		else if (score <= 12) {
			speak("Great job. Nice");
		} 
		else if(score <= 9) {
			speak("Good job.");
		} 
		else if(score <= 6) {
			speak("Well you need more practice");
		} 
		else {
			speak("You are beginner. Keep practice");
		}
	}

	static void speak(String words) {
		SpeechSynthesizer speaker = new SpeechSynthesizer("speaker");
		speaker.synthesize(words);
	}

}
