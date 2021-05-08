package View;
<<<<<<< HEAD
<<<<<<< HEAD

import java.awt.FlowLayout;
import java.util.concurrent.BlockingQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Model.AppleModel;
import Model.KeyDetails;
import Model.SnakeModel;

public class GameFrame extends JFrame {

	/**
	 * 
	 * @param queue
	 * @param applemodel
	 * @param snakemodel
	 * 
	 * Create the JFrame where GamePanel is added
	 */
	public GameFrame(BlockingQueue<KeyDetails> queue, AppleModel applemodel, SnakeModel snakemodel) {

		GamePanel panel = new GamePanel(queue,applemodel, snakemodel);
=======
import javax.swing.*;
=======
>>>>>>> fixing model

import java.awt.FlowLayout;
import java.util.concurrent.BlockingQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Model.AppleModel;
import Model.KeyDetails;
import Model.SnakeModel;

public class GameFrame extends JFrame {

	/**
	 * Constructor
	 */

	public GameFrame(BlockingQueue<KeyDetails> queue, AppleModel applemodel, SnakeModel snakemodel) {

<<<<<<< HEAD
		GamePanel panel = new GamePanel();
<<<<<<< HEAD
>>>>>>> creating basic MVC structure
=======
		JPanel scorePanel = new JPanel();
//		int score = panel.getApples();
//		scorePanel.add(new JLabel("score: " + score));
//		this.add(scorePanel);
>>>>>>> fixing model
=======
		GamePanel panel = new GamePanel(queue,applemodel, snakemodel);
		JPanel scorePanel = new JPanel();
>>>>>>> Finishes MVC
		this.add(panel);

		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
<<<<<<< HEAD
<<<<<<< HEAD

		// Fit JFrame around all other view components
		this.pack();
		this.setLayout(new FlowLayout());

=======
		
		// Fit JFrame around all other view components
		this.pack();
		
>>>>>>> creating basic MVC structure
=======

		// Fit JFrame around all other view components
		this.pack();
		this.setLayout(new FlowLayout());

>>>>>>> fixing model
		this.setVisible(true);
		
		// Set window in the middle of the screen
		this.setLocationRelativeTo(null);
	}
}
