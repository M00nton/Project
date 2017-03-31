package project;

import javax.swing.JFrame;
import project.GuiFrontPage;

public class Main {

// The main class. Really just used for creating the main page of the GUI upon
// program startup
	public static void main(String[] args) {
		GuiFrontPage gfp = new GuiFrontPage();
		gfp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gfp.pack();
		gfp.setVisible(true);
	}

}
