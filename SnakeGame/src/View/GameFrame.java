package View;
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

public class GameFrame extends JFrame{

	/** 
	 * Constructor
	 */
	
	public GameFrame() {
		
		GamePanel panel = new GamePanel();
>>>>>>> creating basic MVC structure
		this.add(panel);
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
<<<<<<< HEAD

		// Fit JFrame around all other view components
		this.pack();
		this.setLayout(new FlowLayout());

=======
		
		// Fit JFrame around all other view components
		this.pack();
		
>>>>>>> creating basic MVC structure
		this.setVisible(true);
		
		// Set window in the middle of the screen
		this.setLocationRelativeTo(null);
	}
}
