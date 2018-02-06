import java.awt.Color;

import javax.swing.JFrame;

public class Main {
	
	public static void main(String[] args) {
		makeScreen();
		
	}
	
	
	public static void makeScreen() {
		//Creating JFrame
		JFrame screen = new JFrame("Pong");
		//program stops running when JFrame is closed
		screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				
		//making JFrame visible, setting its size and color
		screen.setSize(600,500);
		screen.getContentPane().setBackground(Color.BLACK);
		screen.setVisible(true);
	}
}
