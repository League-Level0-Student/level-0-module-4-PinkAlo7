package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class TestScores {
public static void main(String[] args) {
	String test = JOptionPane.showInputDialog("What is your test score in decimal form?");
	 int score= Integer.parseInt(test);
	if(score >= 75.5) {
		JOptionPane.showMessageDialog(null,"Wow, great job! You must have studied really hard for that test!!");
	}
	if(score >= 50.3) {
		JOptionPane.showMessageDialog(null,"Hmmm, not really what I was expecting, but I guess that score is a little bit good.");
	}
}
}
