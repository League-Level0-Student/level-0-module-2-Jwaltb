package methods;

import javax.swing.JOptionPane;

public class RollerCoaster {
public static void main(String[] args) {
	String input=JOptionPane.showInputDialog("How tall are you? inch");
	int height=Integer.parseInt(input);
	if(height>48) {
		JOptionPane.showMessageDialog(null, "You can go on the RollerCoaster");
	}
	else {
		JOptionPane.showMessageDialog(null, "You need to be taller");
	}
}
}
