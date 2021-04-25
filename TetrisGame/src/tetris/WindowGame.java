package tetris;

import javax.swing.JFrame;

public class WindowGame {
	public static final int WIDTH = 445, HEIGHT = 630;

	private Board board;
	private JFrame window;

	public WindowGame() {

		// Frame Settings
		window = new JFrame("Tetris");
		window.setSize(WIDTH, HEIGHT);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLocationRelativeTo(null); // puts the window in the center of the screen
		window.setResizable(false);

		board = new Board();
		window.add(board);
		window.addKeyListener(board);
		window.setVisible(true);
	}

	public static void main(String[] args) {
		new WindowGame();
	}

}
