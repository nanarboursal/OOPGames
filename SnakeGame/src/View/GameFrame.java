package View;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameFrame extends JFrame {

	/**
	 * Constructor
	 */

	public GameFrame() {

		GamePanel panel = new GamePanel();
		JPanel scorePanel = new JPanel();
//		int score = panel.getApples();
//		scorePanel.add(new JLabel("score: " + score));
//		this.add(scorePanel);
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
