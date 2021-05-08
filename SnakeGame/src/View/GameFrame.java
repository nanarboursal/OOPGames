package View;

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

		GamePanel panel = new GamePanel(queue,applemodel, snakemodel);
		JPanel scorePanel = new JPanel();
		this.add(panel);

		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);

		// Fit JFrame around all other view components
		this.pack();
		this.setLayout(new FlowLayout());

		this.setVisible(true);
		
		// Set window in the middle of the screen
		this.setLocationRelativeTo(null);
	}
}
