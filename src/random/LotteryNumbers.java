package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
	public static void main(String[] args) {
		
	
	
int a = new Random().nextInt(101);
int b = new Random().nextInt((200-100)+1)+100;
int c = new Random().nextInt((317-205)+1)+205;
int d = new Random().nextInt((563-318)+1)+205;
int e = new Random().nextInt(6);
JOptionPane.showMessageDialog(null, a + "," + b + "," + c + "," + d + "," + e);
}
}
