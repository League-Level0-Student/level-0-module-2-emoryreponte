package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class voting_booth {

	public static void main(String[] args) {
		String age = JOptionPane.showInputDialog("enter your age");
		int ageint = Integer.parseInt(age);
		
		if(ageint >= 18) {
			String Q1 = JOptionPane.showInputDialog("who should the next president be");
		}
		else {
			JOptionPane.showMessageDialog(null, "nobody cares");
		}

	}

}
