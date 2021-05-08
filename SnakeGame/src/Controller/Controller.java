package Controller;

import java.util.concurrent.BlockingQueue;

import Model.KeyDetails;
import Model.SnakeGame;
import View.GameFrame;

public class Controller {

	BlockingQueue<KeyDetails> queue;
	SnakeGame model;
	GameFrame view;

	public Controller(BlockingQueue<KeyDetails> queue, SnakeGame model, GameFrame view) {
		this.queue = queue;
		this.model = model;
		this.view = view;
	}

	public void mainLoop() {
		while (view.isDisplayable()) {
			KeyDetails event = null;
			try {
				event = queue.take();
			} catch (InterruptedException exception) {
				// do nothing
			}
			
			if(event.getDirection() == 'R') {
				SnakeGame.snakemodel.setDirection('R');
			}
			else if(event.getDirection() == 'L') {
				SnakeGame.snakemodel.setDirection('L');			
				}
			else if(event.getDirection() == 'U') {
				SnakeGame.snakemodel.setDirection('U');			
				}
			else if(event.getDirection() == 'D') {
				SnakeGame.snakemodel.setDirection('D');
			}
		}
	}
} // end of class
