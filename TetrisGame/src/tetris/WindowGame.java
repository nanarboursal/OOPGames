package tetris;

import java.util.concurrent.BlockingQueue;

import javax.swing.JFrame;

public class WindowGame {
	public static final int WIDTH = 445, HEIGHT = 630;

	private Board board;
	private JFrame window;
	BlockingQueue<KeyPressedMessage> queue;

	public WindowGame(BlockingQueue<KeyPressedMessage> queue) {

		this.queue = queue;
		
		// Frame Settings
		window = new JFrame("Tetris");
		window.setSize(WIDTH, HEIGHT);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLocationRelativeTo(null); // puts the window in the center of the screen
		window.setResizable(false);

		board = new Board(queue);
		window.add(board);
		window.addKeyListener(board);
		window.setVisible(true);
	}
	
	public Board getBoard() {
		return this.board;
	}

}
