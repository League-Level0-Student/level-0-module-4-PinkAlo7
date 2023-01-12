package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class TestScores {
public static void main(String[] args) {
	String test = JOptionPane.showInputDialog("What is your test score in decimal form?");
	 double score = Double.parseDouble(test);
	if(score >= 75.0) {
		JOptionPane.showMessageDialog(null,"Wow, great job! You must have studied really hard for that test!!");
	}
	else if(score >= 50.0) {
		JOptionPane.showMessageDialog(null,"Hmmm, not really what I was expecting, that score is not so good.");
	}
	else if(score >=20.0) {
		JOptionPane.showMessageDialog(null,"Wow, that score is soooooooooooooooooooooooo BAAAAAAD!!!!!!!!!!!");
	}
	else if(score >=0.0) {
		JOptionPane.showMessageDialog(null,"Wow, I'm very sorry that you got such a low score, but that is the most horrible test score I've ever heard!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	}
}
}
