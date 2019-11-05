package _03_jukebox;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class JukeboxRunner {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Jukebox());
		Jukebox box = new Jukebox();
		box.createUI(box);
	
	}
}
