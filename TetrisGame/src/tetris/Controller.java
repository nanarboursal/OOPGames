package tetris;

import java.awt.event.KeyEvent;
import java.util.concurrent.BlockingQueue;

public class Controller {

	BlockingQueue<KeyPressedMessage> queue;
	WindowGame theWindow;

	public Controller(BlockingQueue<KeyPressedMessage> queue, WindowGame theWindow) {
		this.queue = queue;
		this.theWindow = theWindow;
	}

	public void runningLoop() {
		Board theBoard = theWindow.getBoard();
		
		while (theBoard.isDisplayable()) {
			KeyPressedMessage theMessage = null;

			try {
				theMessage = queue.take();
			} catch (InterruptedException e) {

			}

			if (theMessage.e.getKeyCode() == KeyEvent.VK_RIGHT) {
				theBoard.getCurrentShape().moveRight();
			} else if (theMessage.e.getKeyCode() == KeyEvent.VK_LEFT) {
				theBoard.getCurrentShape().moveLeft();
			} else if (theMessage.e.getKeyCode() == KeyEvent.VK_UP) {
				theBoard.getCurrentShape().rotateShape();
			}

			if (theBoard.getState() == 1) {
				if (theMessage.e.getKeyCode() == KeyEvent.VK_SPACE) {
					// resets game -- cleans the board

					for (int row = 0; row < theBoard.getBoard().length; row++) {
						for (int col = 0; col < theBoard.getBoard()[row].length; col++) {
							theBoard.getBoard()[row][col] = null;
							theBoard.resetScore();
						}
					}
					theBoard.setCurrentShape();
					theBoard.setState(0);

				}
			}
		}
	}

}
