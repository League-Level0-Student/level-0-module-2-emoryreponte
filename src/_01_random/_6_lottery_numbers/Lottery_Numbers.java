package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lottery_Numbers {

	public static void main(String[] args) {
		Random randomMaker = new Random();
		int randomNumber1 = randomMaker.nextInt(71);
		int randomNumber2 = randomMaker.nextInt(71);
		int randomNumber3 = randomMaker.nextInt(71);
		int randomNumber4 = randomMaker.nextInt(71);
		int randomNumber5 = randomMaker.nextInt(71);
		int randomNumber6 = randomMaker.nextInt(71);
		
		
		JOptionPane.showMessageDialog(null, randomNumber1 + " " + randomNumber2 + " " + randomNumber3 + " " + randomNumber4 + " "  + randomNumber5 + " " + randomNumber6 );

	}

}
