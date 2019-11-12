package _07_cow_timer;

import javax.swing.JOptionPane;

public class CowTimerRunner {
	public static void main(String[] args) throws InterruptedException {
		CowTimer mooooo = new CowTimer(Integer.parseInt(JOptionPane.showInputDialog("How many seconds")));
		mooooo.start();
		
		/* Make a CowTimer, set its time and start it.
		 * Use a short delay (seconds) when testing, then try with longer delays */

	}
}
