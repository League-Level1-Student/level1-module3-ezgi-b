package _04_magic_box;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */


import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class MagicBox extends JPanel implements Runnable, MouseListener {
	JFrame frame;
	MediaPalace media;
	/*
	 * We are going to hide secrets within the magic box. 
	 * When the user clicks on a secret place, stuff will happen.
	 * 
	 * 1. Make the frame respond to mouse clicks.
	 * 
	 * 2. When the mouse is clicked, use the Media Palace (read the code in the magic_box package) to play sounds, 
	 *    show images or speak.
	 * 
	 * 3. Choose 3 different locations on the background image.You can either use the mouse position, 
	 *    or the color of the image, then decide what action the Media Palace should take in each case. 
	 *     backgroundImage.getRGB(e.getX(), e.getY()) will give you the color of the current pixel.
	 */

	BufferedImage backgroundImage;


	@Override
	public void run() {
		try {
			loadBackgroundImage();
			createUI();
		} catch (Exception w) {
			System.err.println(w.getMessage());
		}
	}

	private void createUI() {
		frame = new JFrame("The Magic Box contains many secrets...");
		frame.add(this);
		setPreferredSize(new Dimension(backgroundImage.getWidth(), backgroundImage.getHeight()));
		frame.addMouseListener(this);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		media = new MediaPalace();
	}

	private void loadBackgroundImage() throws Exception {
		String imageFile = "src/_04_magic_box/magic-box.jpg";
		try {
			backgroundImage = ImageIO.read(new File(imageFile));
		} catch (IOException e) {
			throw new Exception("Could not load image: " + imageFile);
		}
	}

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(backgroundImage, 0, 0, null);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getX());
		System.out.println(e.getY());
		if(462<e.getX()&&509>e.getX()&&e.getY()>622&&e.getY()<645) {
			JFrame secondFrame = new JFrame("INVISIBLE BRIDGE");
			secondFrame.setVisible(true);
			secondFrame.setDefaultCloseOperation(3);
			secondFrame.add(media.loadImageFromWithinProject("InvisibleBridge.jpg"));
			secondFrame.pack();
		}else if(e.getX()>257&&e.getX()<283&&e.getY()>711&&e.getY()<841){
			media.playMusicOnComputer("src/_04_magic_box/magic.wav");
			JFrame otherFrame = new JFrame("Orange Magic Tree");
			otherFrame.setVisible(true);
			otherFrame.setDefaultCloseOperation(3);
			otherFrame.add(media.loadImageFromWithinProject("orangeTree.jpeg"));
			otherFrame.pack();
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}


