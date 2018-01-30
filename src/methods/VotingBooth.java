package methods;

import javax.swing.JOptionPane;

public class VotingBooth {
	public static void main(String[] args) {
		String input=JOptionPane.showInputDialog("How old are you?");
		int age=Integer.parseInt(input);
		if(age>=18) {
			JOptionPane.showMessageDialog(null, "Who should the next president be?");
		}
		else {
			JOptionPane.showMessageDialog(null, "No one cares what you think");
		}
	}

}
